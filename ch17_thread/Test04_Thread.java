package ch17_thread;

public class Test04_Thread {
	public static void main(String[] args) {
		MyThread3 A = new MyThread3("AAA",1000);
		MyThread3 B = new MyThread3("BBB",2000);
		MyThread3 C = new MyThread3("CCC",3000);
		
		A.start();
		B.start();
		C.start();
		
		
	}//main-end
}//class-end

//============================================

class MyThread3 extends Thread{
	String msg; //��������
	long msec;
	
	//������
	public MyThread3(String msg, long msec){
		this.msg=msg;
		this.msec=msec;
	}//cons-end
	
	
	@Override
	public void run(){
		try{
			while(true){
				Thread.sleep(msec); // �и��� ���� ���α׷� ���
				System.out.println(msg); //msg ���
			}//while-end
		}catch(InterruptedException e){
			System.out.println(e);
		}
	}//run()-end
}//class-end
