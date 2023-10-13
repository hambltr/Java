package ch18_swing;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test02_event extends JFrame implements ActionListener {
	//����
	JButton b1, b2, b3;

	//������
	public Test02_event() {
		// ������ �̹��� ����
		ImageIcon icon1 = new ImageIcon("C:\\_work\\_imgs\\dogo1.png");
		ImageIcon icon2 = new ImageIcon("C:\\_work\\_imgs\\sadcat1.png");
		ImageIcon icon3 = new ImageIcon("C:\\_work\\_imgs\\sadcat2.png");

		// ��ư ����
		b1 = new JButton("����", icon1);
		b2 = new JButton("���", icon2);
		b3 = new JButton("����", icon3);

		// �� ��ư�� ���� �߰�
		b1.setToolTipText("���� ��ȭ ���� �Դϴ�.");
		b2.setToolTipText("��� ��ȭ ���� �Դϴ�.");
		b3.setToolTipText("���� ��ȭ ���� �Դϴ�.");

		// ��ư�� ActionListener ���
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);

		// ������ ���̾ƿ� ����
		setLayout(new FlowLayout());

		// ��ư �����ӿ� �߰�
		add(b1);
		add(b2);
		add(b3);

		// ������ ����
		setSize(500, 500);
		setVisible(true);

		// ���α׷� ���� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//cons-end

	public static void main(String[] args) {
		new Test02_event();
	}//main-end
	
//�޼���
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			// ��ư b1�� Ŭ������ �� ������ ���� (���� ��ư)
			JOptionPane.showMessageDialog(this, "���� ��ȭ �޼���");

		} else if (e.getSource() == b2) {
			// ��ư b2�� Ŭ������ �� ������ ���� (��� ��ư)
			JOptionPane.showMessageDialog(this, "��� ��ȭ �޼���","â����",JOptionPane.WARNING_MESSAGE);
										// �θ�		�޼���	     â����		������	-	��������
		} else if (e.getSource() == b3) {
			// ��ư b3�� Ŭ������ �� ������ ���� (���� ��ư)
			JOptionPane.showMessageDialog(this, "���� ��ȭ �޼���","Error",JOptionPane.ERROR_MESSAGE);
										// �θ�		�޼���	     â����		������	-	��������
		}
	}//if-end
}//class-end
