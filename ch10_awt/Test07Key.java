package ch10_awt;
import java.awt.*;
import java.awt.event.*;


public class Test07Key extends Frame implements KeyListener{
	//����
	Image img;
	int x,y;
	
	
	//������
	public Test07Key() {
		//super("Ű �̺�Ʈ");		
		setTitle("Ű �̺�Ʈ"); //�̷� �ص� ��
		x=100;
		y=100;
		img=Toolkit.getDefaultToolkit().getImage("C:\\_work\\_imgs\\catrave.gif");
		
		
		addWindowListener(new MyWin());//�̺�Ʈ ���
		addKeyListener(this); //Ű �̺�Ʈ ���
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

	//�޼��� �������̵�
	@Override
	public void keyPressed(KeyEvent ke) {
		switch(ke.getKeyCode()){
		case KeyEvent.VK_UP: //���� ����Ű
			y-=5;
			break;
		case KeyEvent.VK_DOWN://�Ʒ��� ����Ű
			y+=5;
			break;
		case KeyEvent.VK_LEFT:
			x-=5;
			break;
		case KeyEvent.VK_RIGHT:
			x+=5;
			break;
		}//switch-end
		repaint();//paint ȣ��
	}//keyPressed()-end
	
	//paint()
	public void paint(Graphics g){
		g.drawImage(img,x,y,this);
	}
	
	@Override
	public void keyReleased(KeyEvent ke) {}
	
	@Override
	public void keyTyped(KeyEvent ke) {}
	
	
	
	
	//main
	public static void main(String[] args) {
		new Test07Key();
	}


}//class-end
