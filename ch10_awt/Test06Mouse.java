package ch10_awt;
import java.awt.*;
import java.awt.event.*;


//이벤트 처리하려면
//1. 상속받는다(인터페이스, 클래스)
//2. 이벤트 등록
//3. 해당 메서드 오버라이딩

public class Test06Mouse extends Frame
implements MouseListener, MouseMotionListener{
	//변수
	private String msg;
	private int xpos,ypos;//마우스 좌표값을 넣을 변수


	//생성자
	public Test06Mouse() {
		super("마우스이벤트");		

		addWindowListener(new MyWin());//이벤트 등록
		addMouseListener(this); //마우스 이벤트 등록
		addMouseMotionListener(this); //마우스 모션 리스너 이벤트 등록
		
		setSize(1450,1050);
		setVisible(true);
		
	}//cons-end

	//inner class
	class MyWin extends WindowAdapter{
		//필요한 메서드만 오버라이딩 하면 된다
		public void windowClosing(WindowEvent we){
			dispose();
			System.exit(0);
		}

	}//inner-class-end
	
	//사용자 정의 메서드
	private void setValue(String msg,int x, int y){
		this.msg=msg;
		this.xpos=x;
		this.ypos=y;
		repaint();//paint 호출
		
	}//setValue()-end
	
	
	public void paint(Graphics g){
		//g.drawString(iterator, x, y);
		
		g.drawString(msg+ "[" + xpos + "," + ypos + "]" , xpos , ypos);
	}//paint()-end
	
	//오버라이드
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
	
	


	//메서드
	//main

	public static void main(String[] args) {
		new Test06Mouse();
	}


}//class-end
