package ch10_awt;
import java.awt.*;
import java.awt.event.*;

//inner class 창종료
public class Test04Graphics extends Frame{
	//변수
	//생성자
	public Test04Graphics(){
		super("Graphics 예제");

		addWindowListener(new MyWin());//이벤트 등록

		setSize(450,450);
		setVisible(true);

	}//cons-end

	//inner class

	class MyWin extends WindowAdapter{
		//메서드 오버라이딩
		public void windowClosing(WindowEvent we){
			System.exit(0);
		}

	}//inner-class-end

	
	//paint()메서드: 무언가 출력하고자 할때 JVM에 의해서 호출되는 메서드이다.
	public void paint(Graphics g){
		g.drawString("오늘은 수요일",100,150); //x좌표 : 100, y좌표 150
		
		//Font f=new Font("Helvetica",Font.BOLD,20);
		//g.setFont(f);
		g.setFont(new Font("Helvetica",Font.BOLD,20));
		g.setColor(Color.CYAN);
		g.drawString("오늘은 수요일",100,100);
		
		//
		//선그리기
		
		//g.drawLine(x1, y1, x2, y2);
		g.setColor(Color.MAGENTA);
		g.drawLine(50, 100, 80, 130);
		
		//
		//사각형 그리기
		
		//g.drawRect(x, y, width, height);
		g.drawRect(300, 300, 100, 100);
		
		//
		//채워진 사각형
		
		//g.fillRect(x, y, width, height);
		g.setColor(Color.MAGENTA);
		g.fillRect(200, 200, 100, 100);
		
		
		//
		//원 그리기
		//g.drawOval(x, y, width, height);
		g.setColor(Color.CYAN);
		g.drawOval(200, 200, 100, 100);
		
		//
		//채워진 원 그리기
		//g.fillOval(x, y, width, height);
		g.fillOval(300, 300, 100, 100);
		
		
		
	}//paint()-end
	public static void main(String[] args) {
		new Test04Graphics();
	}

}//class-end
