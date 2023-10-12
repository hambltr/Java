package ch17_thread;

public class Test02_Thread {
	public static void main(String[] args) {
		
		MyThread my = new MyThread();		 //��ü����
		YourThread your = new YourThread();  //��ü����
		
		//�켱 ���� ����� ( �� �ǹ̴� ���� �׳� �ǽ� )
		my.setPriority(1); //���� ���� �켱����
		your.setPriority(10); //���� ���� �켱����  (�߰��� 5)
		
	//---------------------------------------------
		
		my.start();	  //run() ȣ��
		your.start(); //run() ȣ��
		
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