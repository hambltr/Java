package ch12_event;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*; //�޼��� ��ȭ���� ����ϱ� ���� swing import
//â����

public class Test01_event extends Frame implements ActionListener {
	//����
	JTextField tf1,tf2;
	JTextArea ta;

	//������
	public Test01_event(){
		super("��ȭ�ϱ�");
		
		tf1=new JTextField();
		tf2=new JTextField();
		ta=new JTextArea();
		
		ta.setBackground(Color.LIGHT_GRAY);
		ta.setEditable(false);//���� ���ϰ� ���Ƶα�
		
		//�����̳ʿ� ������Ʈ ������, BorderLayout�� Window�迭�� ����Ʈ�̴�.
		add(tf1,"North");
		add(ta,"Center");
		add(tf2,"South");

		addWindowListener(new MyWin());//â���� �̺�Ʈ
		tf1.addActionListener(this);//�̺�Ʈ ���
		tf2.addActionListener(this);//�̺�Ʈ ���
		
		
		
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
	
	//�������̵�
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==tf1){
			String msg="Player1 >>"+tf1.getText();
			ta.append(msg+"\n");
			tf1.setText("");//���� �����
			tf2.requestFocus();// ��Ŀ�� ���� tf2��
		}else if(e.getSource()==tf2){
			String msg="Player2 >>"+tf2.getText();
			ta.append(msg+"\n");
			tf2.setText("");//���� �����
			tf1.requestFocus();// ��Ŀ�� ���� tf1��
		}
	}//actionPerformed-end
	
	public static void main(String[] args) {
		new Test01_event();//��ü����, ������ ȣ��
	}//main-end
}//class-end
