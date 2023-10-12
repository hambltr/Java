package ch17_thread;
//Thread.sleep( ms); : 1�и��� => 1/1000��
//Thread.sleep( ms); : ���� ���
public class Test03_Thread {
	public static void main(String[] args) {
		MyThread2 my = new MyThread2();//��ü����
		
		my.start(); //run(); ȣ��
		
	}//main-end
}//class-end

//============================
class MyThread2 extends Thread{
	int i=0; //����
	
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