package ch18_swing;
import javax.swing.*;
import java.awt.*; //layout


public class Test01_swing extends JFrame{
	//��������
	JButton b1, b2, b3;
	
	//������
	public Test01_swing(){
		this.getContentPane().setLayout(new FlowLayout());
		
		ImageIcon icon1 = new ImageIcon("C:\\_work\\_imgs\\dogo1.png");
		ImageIcon icon2 = new ImageIcon("C:\\_work\\_imgs\\sadcat1.png");
		ImageIcon icon3 = new ImageIcon("C:\\_work\\_imgs\\sadcat2.png");
		
		b1 = new JButton("1��",icon1);
		b1.setToolTipText("Į�� �� ������ �ູ�� �����");
		this.getContentPane().add(b1);
		
		b2 = new JButton("2��",icon2);
		b2.setToolTipText("�߱� �� ���� �ֿ˾�");
		this.getContentPane().add(b2);
		
		b3 = new JButton("3��",icon3);
		b3.setToolTipText("�߱ٿ� �ɷ����� �ֿ˾�");
		this.getContentPane().add(b3);
		
		setSize(500,500);
		setVisible(true);
		
		//���α׷� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//cons-end
	public static void main(String[] args) {
		new Test01_swing(); //��ü����
	}
}
