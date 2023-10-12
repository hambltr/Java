package ch18_swing;
import javax.swing.*;
import java.awt.*; //layout


public class Test01_swing extends JFrame{
	//전역변수
	JButton b1, b2, b3;
	
	//생성자
	public Test01_swing(){
		this.getContentPane().setLayout(new FlowLayout());
		
		ImageIcon icon1 = new ImageIcon("C:\\_work\\_imgs\\dogo1.png");
		ImageIcon icon2 = new ImageIcon("C:\\_work\\_imgs\\sadcat1.png");
		ImageIcon icon3 = new ImageIcon("C:\\_work\\_imgs\\sadcat2.png");
		
		b1 = new JButton("1번",icon1);
		b1.setToolTipText("칼퇴 할 생각에 행복한 댕댕이");
		this.getContentPane().add(b1);
		
		b2 = new JButton("2번",icon2);
		b2.setToolTipText("야근 할 뻔한 애옹쓰");
		this.getContentPane().add(b2);
		
		b3 = new JButton("3번",icon3);
		b3.setToolTipText("야근에 걸려버린 애옹쓰");
		this.getContentPane().add(b3);
		
		setSize(500,500);
		setVisible(true);
		
		//프로그램 종료
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//cons-end
	public static void main(String[] args) {
		new Test01_swing(); //객체생성
	}
}
