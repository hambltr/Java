package ch18_swing;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Test04_img extends Frame implements ActionListener {

	//����
	Image img;
	Button bu[][]; //�迭����
	int n=4; // �迭 index�� ����Ϸ��� ����


	//������
	public Test04_img(){
		bu = new Button[n][n];//�迭����
		setLayout(new GridLayout(n,n));//��� ���� (�׸���)
		setFont(new Font("Helvetica",Font.BOLD,45));

		int a = 1; //��ư�� label�� ����� ���� ����
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {
				bu[i][j] = new Button(""+a++); //��ư ����
				bu[i][j].setBackground(Color.CYAN);//����
				bu[i][j].setForeground(Color.WHITE);//���ڻ�
				bu[i][j].addActionListener(this);//��ư �̺�Ʈ ���
				add(bu[i][j]);//Frame�� ��ư ���̱�

			}//inner-for

		}//out-for

		img=Toolkit.getDefaultToolkit().getImage("C:\\_work\\_imgs\\pepe.jpg");
		setSize(500,500);
		setVisible(true);

		//���α׷� ����, �͸�Ŭ���� ���
		addWindowListener(new WindowAdapter(){

			@Override
			public void windowClosing(WindowEvent we){
				System.exit(0);// ���α׷� ����
			}
		});

	}//cons-end

	//paint() , �̹��� ���
	public void paint(Graphics g){
		g.drawImage(img, 0,0,500,500,this);
	}//paint()-end

	//�޼��� 
	@Override
	public void actionPerformed(ActionEvent e){
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {


				if(e.getSource()==bu[i][j]){
					int answer = JOptionPane.showConfirmDialog(this, "Java�� �Ҹ��ϴ�.","Question",JOptionPane.YES_NO_OPTION);
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
