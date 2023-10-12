package ch17_thread;
//Thread.sleep( ms); : 1밀리초 => 1/1000초
//Thread.sleep( ms); : 예외 사용
public class Test03_Thread {
	public static void main(String[] args) {
		MyThread2 my = new MyThread2();//객체생성
		
		my.start(); //run(); 호출
		
	}//main-end
}//class-end

//============================
class MyThread2 extends Thread{
	int i=0; //변수
	
	@Override
	public void run(){
		try{
			while(i<5){
				i++;
				Thread.sleep(2000); //2000ms = 2sec
				System.out.println("Hi");
			}//while-end
			
		}catch(InterruptedException e){
			System.out.println(e);
		}
	}//run()-end
	
}