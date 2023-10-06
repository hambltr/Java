package ch10_awt;
import java.awt.*;
import java.awt.event.*;


//�̺�Ʈ ó���Ϸ���
//1. ��ӹ޴´�(�������̽�, Ŭ����)
//2. �̺�Ʈ ���
//3. �ش� �޼��� �������̵�

public class Test06Mouse extends Frame
implements MouseListener, MouseMotionListener{
	//����
	private String msg;
	private int xpos,ypos;//���콺 ��ǥ���� ���� ����


	//������
	public Test06Mouse() {
		super("���콺�̺�Ʈ");		

		addWindowListener(new MyWin());//�̺�Ʈ ���
		addMouseListener(this); //���콺 �̺�Ʈ ���
		addMouseMotionListener(this); //���콺 ��� ������ �̺�Ʈ ���
		
		setSize(1450,1050);
		setVisible(true);
		
	}//cons-end

	//inner class
	class MyWin extends WindowAdapter{
		//�ʿ��� �޼��常 �������̵� �ϸ� �ȴ�
		public void windowClosing(WindowEvent we){
			dispose();
			System.exit(0);
		}

	}//inner-class-end
	
	//����� ���� �޼���
	private void setValue(String msg,int x, int y){
		this.msg=msg;
		this.xpos=x;
		this.ypos=y;
		repaint();//paint ȣ��
		
	}//setValue()-end
	
	
	public void paint(Graphics g){
		//g.drawString(iterator, x, y);
		
		g.drawString(msg+ "[" + xpos + "," + ypos + "]" , xpos , ypos);
	}//paint()-end
	
	//�������̵�
	public void mousePressed(MouseEvent m){
		setValue("mousePressed" , m.getX(), m.getY());
	}
	public void mouseReleased(MouseEvent m){
		setValue("mouseReleased" , m.getX(), m.getY());
	}
	public void mouseClicked(MouseEvent m){
		setValue("mouseClicked" , m.getX(), m.getY());
	}
	public void mouseEntered(MouseEvent m){
		System.out.println("Mouse IN");
	}
	public void mouseExited(MouseEvent m){
		System.out.println("Mouse OUT");
	}
	
	
	public void mouseDragged(MouseEvent m){
		setValue("mouseDragged" , m.getX(), m.getY());
	}
	public void mouseMoved(MouseEvent m){
		setValue("mouseMoved" , m.getX(), m.getY());
	}
	
	


	//�޼���
	//main

	public static void main(String[] args) {
		new Test06Mouse();
	}


}//class-end
