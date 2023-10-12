package ch17_thread;

public class Test01_go_come {
	public static void main(String[] args) {
		Go go = new Go();
		Come come = new Come();
		
		go.start();//run()호출
		come.start();//run() 호출
		
	}//main
}//class

class Go extends Thread{
	
	@Override
	public void run(){
		int i=1;
		while(i<=30){
			System.out.print("Go ");
			i++;
		}//while-end
	}//run()-end
}//class-end========

class Come extends Thread{
	@Override
	public void run(){
		int i=1;
		while(i<=30){
			System.out.print("Come ");
			i++;
		}//while-end
	}//run()-end
	
}//class-end============
