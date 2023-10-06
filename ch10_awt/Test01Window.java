package ch10_awt;
import java.awt.*;
import java.awt.event.*;

//인터페이스를 사용하여 창 종료 하기
//창종료 하려면
//1. 상속받는다 (클래스나 인터페이스를)
//2. 이벤트 등록을 한다
//3. 그에 해당하는 메서드를 오버라이딩 한다

public class Test01Window extends Frame implements WindowListener {
	//변수
	//생성자
	public Test01Window(){
		super("창종료");
		addWindowListener(this);//이벤트 등록
		setSize(450,450); //창크기
		setVisible(true); //창표시	
	}//cons-end
	
	//메서드, 오버라이딩
	public void windowOpened(WindowEvent we){}
	public void windowClosing(WindowEvent we){
		dispose();//리소스 반환
		System.exit(0);//프로그램 종료
	}
	public void windowClosed(WindowEvent we){}
	
	public void windowIconified(WindowEvent we){}	//아이콘화
	public void windowDeiconified(WindowEvent we){}	//비아이콘화
	
	public void windowActivated(WindowEvent we){}
	public void windowDeactivated(WindowEvent we){}
	
	//main
	public static void main(String[] args) {
		new Test01Window();//객체생성, 생성자 호출
	}//main-end
	
}//class-end
