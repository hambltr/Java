package ch10_awt;
import java.awt.*;
import java.awt.event.*;

//�̸����� Ŭ���� ���
public class Test03Window extends Frame{
	//����
	//������
	public Test03Window(){
		super("â����");

		//�̺�Ʈ ���
		addWindowListener(new WindowAdapter() 
		{//�� �κ��� �̸� ���� Ŭ���� = �͸�Ŭ���� = Anonymus(��ϸӽ�)
			//�޼��� �������̵�
			public void windowClosing(WindowEvent we){
				System.exit(0);//���α׷� ����
			}//WindowClosing()-end
		}//�̸� ���� Ŭ���� - end

		);
		
		setSize(450,450);
		setVisible(true);
		
	}//cons-end
	
	//main
	public static void main(String[] args) {
		new Test03Window(); //��ü����, ������ ȣ��
	}//main-end

}//class-end
