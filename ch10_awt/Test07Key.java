package ch10_awt;
import java.awt.*;
import java.awt.event.*;


public class Test07Key extends Frame implements KeyListener{
	//변수
	Image img;
	int x,y;
	
	
	//생성자
	public Test07Key() {
		//super("키 이벤트");		
		setTitle("키 이벤트"); //이래 해도 됨
		x=100;
		y=100;
		img=Toolkit.getDefaultToolkit().getImage("C:\\_work\\_imgs\\catrave.gif");
		
		
		addWindowListener(new MyWin());//이벤트 등록
		addKeyListener(this); //키 이벤트 등록
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

	//메서드 오버라이딩
	@Override
	public void keyPressed(KeyEvent ke) {
		switch(ke.getKeyCode()){
		case KeyEvent.VK_UP: //위쪽 방향키
			y-=5;
			break;
		case KeyEvent.VK_DOWN://아래쪽 방향키
			y+=5;
			break;
		case KeyEvent.VK_LEFT:
			x-=5;
			break;
		case KeyEvent.VK_RIGHT:
			x+=5;
			break;
		}//switch-end
		repaint();//paint 호출
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
