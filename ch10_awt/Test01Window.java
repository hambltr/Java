package ch10_awt;
import java.awt.*;
import java.awt.event.*;

//�������̽��� ����Ͽ� â ���� �ϱ�
//â���� �Ϸ���
//1. ��ӹ޴´� (Ŭ������ �������̽���)
//2. �̺�Ʈ ����� �Ѵ�
//3. �׿� �ش��ϴ� �޼��带 �������̵� �Ѵ�

public class Test01Window extends Frame implements WindowListener {
	//����
	//������
	public Test01Window(){
		super("â����");
		addWindowListener(this);//�̺�Ʈ ���
		setSize(450,450); //âũ��
		setVisible(true); //âǥ��	
	}//cons-end
	
	//�޼���, �������̵�
	public void windowOpened(WindowEvent we){}
	public void windowClosing(WindowEvent we){
		dispose();//���ҽ� ��ȯ
		System.exit(0);//���α׷� ����
	}
	public void windowClosed(WindowEvent we){}
	
	public void windowIconified(WindowEvent we){}	//������ȭ
	public void windowDeiconified(WindowEvent we){}	//�������ȭ
	
	public void windowActivated(WindowEvent we){}
	public void windowDeactivated(WindowEvent we){}
	
	//main
	public static void main(String[] args) {
		new Test01Window();//��ü����, ������ ȣ��
	}//main-end
	
}//class-end
