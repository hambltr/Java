package ch10_awt;
import java.awt.*;
import java.awt.event.*;

//inner class â����
public class Test04Graphics extends Frame{
	//����
	//������
	public Test04Graphics(){
		super("Graphics ����");

		addWindowListener(new MyWin());//�̺�Ʈ ���

		setSize(450,450);
		setVisible(true);

	}//cons-end

	//inner class

	class MyWin extends WindowAdapter{
		//�޼��� �������̵�
		public void windowClosing(WindowEvent we){
			System.exit(0);
		}

	}//inner-class-end

	
	//paint()�޼���: ���� ����ϰ��� �Ҷ� JVM�� ���ؼ� ȣ��Ǵ� �޼����̴�.
	public void paint(Graphics g){
		g.drawString("������ ������",100,150); //x��ǥ : 100, y��ǥ 150
		
		//Font f=new Font("Helvetica",Font.BOLD,20);
		//g.setFont(f);
		g.setFont(new Font("Helvetica",Font.BOLD,20));
		g.setColor(Color.CYAN);
		g.drawString("������ ������",100,100);
		
		//
		//���׸���
		
		//g.drawLine(x1, y1, x2, y2);
		g.setColor(Color.MAGENTA);
		g.drawLine(50, 100, 80, 130);
		
		//
		//�簢�� �׸���
		
		//g.drawRect(x, y, width, height);
		g.drawRect(300, 300, 100, 100);
		
		//
		//ä���� �簢��
		
		//g.fillRect(x, y, width, height);
		g.setColor(Color.MAGENTA);
		g.fillRect(200, 200, 100, 100);
		
		
		//
		//�� �׸���
		//g.drawOval(x, y, width, height);
		g.setColor(Color.CYAN);
		g.drawOval(200, 200, 100, 100);
		
		//
		//ä���� �� �׸���
		//g.fillOval(x, y, width, height);
		g.fillOval(300, 300, 100, 100);
		
		
		
	}//paint()-end
	public static void main(String[] args) {
		new Test04Graphics();
	}

}//class-end
