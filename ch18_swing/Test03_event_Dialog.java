package ch18_swing;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

//JOptionPane.showMessageDialog(): �޼��� ���
//JOptionPane.showConfirmDialog(): Ȯ��, ���, ��, �ƴϿ�
//JOptionPane.showInputDialog(): text(���ڿ�) �Է� ������ ���

public class Test03_event_Dialog extends Frame implements ActionListener {

	//����
	Button b1, b2, b3;
	
	//������
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
		 
		//â���� �̺�Ʈ ���, �͸�Ŭ���� ���
		addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent we){
				System.exit(0);// ���α׷� ����
			}
		});
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		//Flow Layout ����
		
		setLayout(new FlowLayout());
		
		//Frame�� ������Ʈ ���̱�
		
		add(b1);
		add(b2);
		add(b3);
		
		setSize(500,500);
		setVisible(true);
		
	}//cons-end
	
	//�޼���
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==b1){
				JOptionPane.showMessageDialog(this, "message");
				//message
		}else if (e.getSource()==b2){
			JOptionPane.showConfirmDialog(this, "confirm");
			//confirm
		}else if (e.getSource()==b3){
			String inputText = JOptionPane.showInputDialog(this, "��ȭ���� �Է��ϼ���");
			//input
			if (inputText != null) { // ����ڰ� ��� ��ư�� ������ null�� ���ϵǹǷ� üũ
				JOptionPane.showMessageDialog(this, "����� ��ȭ���� " + inputText + " �Դϴ�.");
			}

		}//if-end
		
	}//actionPerformed()-end
	
	public static void main(String[] args) {
		new Test03_event_Dialog();
	}
		
}//class-end
