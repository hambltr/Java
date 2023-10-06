package ch12_event;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*; //메세지 대화상자 사용하기 위해 swing import
//창종료

public class Test01_event extends Frame implements ActionListener {
	//변수
	JTextField tf1,tf2;
	JTextArea ta;

	//생성자
	public Test01_event(){
		super("대화하기");
		
		tf1=new JTextField();
		tf2=new JTextField();
		ta=new JTextArea();
		
		ta.setBackground(Color.LIGHT_GRAY);
		ta.setEditable(false);//편집 못하게 막아두기
		
		//컨테이너에 컴포넌트 붙히기, BorderLayout은 Window계열에 디폴트이다.
		add(tf1,"North");
		add(ta,"Center");
		add(tf2,"South");

		addWindowListener(new MyWin());//창종료 이벤트
		tf1.addActionListener(this);//이벤트 등록
		tf2.addActionListener(this);//이벤트 등록
		
		
		
		setBounds(300,300,500,500);
		setVisible(true);

	}//cons-end

	//inner-class
	class MyWin extends WindowAdapter{

		@Override
		public void windowClosing(WindowEvent we){
			System.exit(0);

		}//we
	}//inner-class-end
	
	//오버라이딩
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==tf1){
			String msg="Player1 >>"+tf1.getText();
			ta.append(msg+"\n");
			tf1.setText("");//내용 지우기
			tf2.requestFocus();// 포커스 설정 tf2로
		}else if(e.getSource()==tf2){
			String msg="Player2 >>"+tf2.getText();
			ta.append(msg+"\n");
			tf2.setText("");//내용 지우기
			tf1.requestFocus();// 포커스 설정 tf1로
		}
	}//actionPerformed-end
	
	public static void main(String[] args) {
		new Test01_event();//객체생성, 생성자 호출
	}//main-end
}//class-end
