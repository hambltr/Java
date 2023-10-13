package ch18_swing;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test02_event extends JFrame implements ActionListener {
	//변수
	JButton b1, b2, b3;

	//생성자
	public Test02_event() {
		// 아이콘 이미지 생성
		ImageIcon icon1 = new ImageIcon("C:\\_work\\_imgs\\dogo1.png");
		ImageIcon icon2 = new ImageIcon("C:\\_work\\_imgs\\sadcat1.png");
		ImageIcon icon3 = new ImageIcon("C:\\_work\\_imgs\\sadcat2.png");

		// 버튼 생성
		b1 = new JButton("정보", icon1);
		b2 = new JButton("경고", icon2);
		b3 = new JButton("에러", icon3);

		// 각 버튼에 툴팁 추가
		b1.setToolTipText("정보 대화 상자 입니다.");
		b2.setToolTipText("경고 대화 상자 입니다.");
		b3.setToolTipText("에러 대화 상자 입니다.");

		// 버튼에 ActionListener 등록
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);

		// 프레임 레이아웃 설정
		setLayout(new FlowLayout());

		// 버튼 프레임에 추가
		add(b1);
		add(b2);
		add(b3);

		// 프레임 설정
		setSize(500, 500);
		setVisible(true);

		// 프로그램 종료 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//cons-end

	public static void main(String[] args) {
		new Test02_event();
	}//main-end
	
//메서드
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			// 버튼 b1를 클릭했을 때 실행할 동작 (정보 버튼)
			JOptionPane.showMessageDialog(this, "정보 대화 메세지");

		} else if (e.getSource() == b2) {
			// 버튼 b2를 클릭했을 때 실행할 동작 (경고 버튼)
			JOptionPane.showMessageDialog(this, "경고 대화 메세지","창제목",JOptionPane.WARNING_MESSAGE);
										// 부모		메세지	     창제목		아이콘	-	경고아이콘
		} else if (e.getSource() == b3) {
			// 버튼 b3를 클릭했을 때 실행할 동작 (에러 버튼)
			JOptionPane.showMessageDialog(this, "에러 대화 메세지","Error",JOptionPane.ERROR_MESSAGE);
										// 부모		메세지	     창제목		아이콘	-	경고아이콘
		}
	}//if-end
}//class-end
