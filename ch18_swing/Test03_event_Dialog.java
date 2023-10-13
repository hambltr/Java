package ch18_swing;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

//JOptionPane.showMessageDialog(): 메세지 출력
//JOptionPane.showConfirmDialog(): 확인, 취소, 예, 아니오
//JOptionPane.showInputDialog(): text(문자열) 입력 받을때 사용

public class Test03_event_Dialog extends Frame implements ActionListener {

	//변수
	Button b1, b2, b3;
	
	//생성자
	public Test03_event_Dialog(){
		b1=new Button("Message");
		b2=new Button("Confirm");
		b3=new Button("Input");
		
		b1.setBackground(Color.blue);
		b2.setBackground(Color.blue);
		b3.setBackground(Color.blue);
		
		b1.setForeground(Color.white);
		b2.setForeground(Color.white);
		b3.setForeground(Color.white);
		
		b1.setFont(new Font("Dialog",Font.BOLD,16));
		b2.setFont(new Font("Dialog",Font.BOLD,16));
		b3.setFont(new Font("Dialog",Font.BOLD,16));
	
		setBackground(Color.CYAN);
		 
		//창종료 이벤트 등록, 익명클래스 사용
		addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent we){
				System.exit(0);// 프로그램 종료
			}
		});
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		//Flow Layout 설정
		
		setLayout(new FlowLayout());
		
		//Frame에 컴포넌트 붙이기
		
		add(b1);
		add(b2);
		add(b3);
		
		setSize(500,500);
		setVisible(true);
		
	}//cons-end
	
	//메서드
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==b1){
				JOptionPane.showMessageDialog(this, "message");
				//message
		}else if (e.getSource()==b2){
			JOptionPane.showConfirmDialog(this, "confirm");
			//confirm
		}else if (e.getSource()==b3){
			String inputText = JOptionPane.showInputDialog(this, "대화명을 입력하세요");
			//input
			if (inputText != null) { // 사용자가 취소 버튼을 누르면 null이 리턴되므로 체크
				JOptionPane.showMessageDialog(this, "당신의 대화명은 " + inputText + " 입니다.");
			}

		}//if-end
		
	}//actionPerformed()-end
	
	public static void main(String[] args) {
		new Test03_event_Dialog();
	}
		
}//class-end
