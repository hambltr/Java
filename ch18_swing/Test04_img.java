package ch18_swing;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Test04_img extends Frame implements ActionListener {

	//변수
	Image img;
	Button bu[][]; //배열선언
	int n=4; // 배열 index로 사용하려고 선언


	//생성자
	public Test04_img(){
		bu = new Button[n][n];//배열생성
		setLayout(new GridLayout(n,n));//행렬 설정 (그리드)
		setFont(new Font("Helvetica",Font.BOLD,45));

		int a = 1; //버튼의 label로 사용할 숫자 선언
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {
				bu[i][j] = new Button(""+a++); //버튼 생성
				bu[i][j].setBackground(Color.CYAN);//배경색
				bu[i][j].setForeground(Color.WHITE);//글자색
				bu[i][j].addActionListener(this);//버튼 이벤트 등록
				add(bu[i][j]);//Frame에 버튼 붙이기

			}//inner-for

		}//out-for

		img=Toolkit.getDefaultToolkit().getImage("C:\\_work\\_imgs\\pepe.jpg");
		setSize(500,500);
		setVisible(true);

		//프로그램 종료, 익명클래스 사용
		addWindowListener(new WindowAdapter(){

			@Override
			public void windowClosing(WindowEvent we){
				System.exit(0);// 프로그램 종료
			}
		});

	}//cons-end

	//paint() , 이미지 출력
	public void paint(Graphics g){
		g.drawImage(img, 0,0,500,500,this);
	}//paint()-end

	//메서드 
	@Override
	public void actionPerformed(ActionEvent e){
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {


				if(e.getSource()==bu[i][j]){
					int answer = JOptionPane.showConfirmDialog(this, "Java는 할만하다.","Question",JOptionPane.YES_NO_OPTION);
					switch(answer){
					case JOptionPane.YES_OPTION:
						bu[i][j].setVisible(false);
						break;

					case JOptionPane.NO_OPTION:
						break;
					}//switch-end
				}
			}
		}
	}//



	public static void main(String[] args) {
		new Test04_img();
	}//main-end

}//class-end
