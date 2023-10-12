package ch17_thread;

public class Test02_Thread {
	public static void main(String[] args) {
		
		MyThread my = new MyThread();		 //객체생성
		YourThread your = new YourThread();  //객체생성
		
		//우선 순위 적용법 ( 별 의미는 없음 그냥 실습 )
		my.setPriority(1); //가장 낮은 우선순위
		your.setPriority(10); //가장 높은 우선순위  (중간은 5)
		
	//---------------------------------------------
		
		my.start();	  //run() 호출
		your.start(); //run() 호출
		
	}//main-end
}//class-end

//==========================================

class MyThread extends Thread{
	@Override
	public void run(){
		for(char ch='A'; ch<='Z'; ch++){
			System.out.print(ch);
		}//for-end
		
		
	}//run()-end
}//class-end

//========================

class YourThread extends Thread{
	@Override
	public void run(){
		for(char ch='a'; ch<='z'; ch++){
			System.out.print(ch);
		}//for-end
		
		
	}//run()-end
}//class-end