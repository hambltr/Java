package ch17_thread;
import java.util.*; //Vector

public class Test05_Thread {
	public static void main(String[] args) {

		House house = new House();
		Producer p = new Producer(house);
		Consumer c = new Consumer(house);
		
		p.start();
		c.start();

	}//main-end

}//class-end


class House{
	Vector<Character> vec; //전역변수

	//생성자
	public House(){
		vec=new Vector<Character>();

	}//cons-end

	//put() : vec에 넣는 작업 , 사용자 정의 메서드
	synchronized void put(char ch){
		while(vec.size()==3){ //작업할 수 없는 동안 
			try{
				wait();		  //대기
			}catch(InterruptedException e){}
		}//while-end

		//처리내용
		vec.add(new Character(ch));
		System.out.println("창고에 " + ch + " 가 들어왔습니다.");
		System.out.println("재고 수량: "+vec.size() + " 개");
		notifyAll(); // 스레드 작업종료 전체알림


	}//put()-end

	//get() : vec에서 빼는 작업 , 사용자 정의 메서드
	synchronized char get(){
		while(vec.size()==0){
			try{ 
				wait();
			}catch(InterruptedException e){}
		}//while-end

		//처리내용
		Character ch=(Character)vec.remove(0); //꺼낸 후 제거
		System.out.println("창고에서 " + ch + " 가 나갔습니다.");
		System.out.println("재고 수량: " + vec.size() + " 개");
		notifyAll(); // 스레드 작업종료 전체알림

		return ch.charValue(); //char 자료형으로 변환 후 return


	}//get()-end
}//class-end
//=============================================================
//put() 호출 , 생산클래스
class Producer extends Thread{
	private House house; //전역변수

	//생성자 
	public Producer(House house){
		this.house=house;
	}//cons-end

	@Override
	public void run(){
		for(char ch='A'; ch<='J'; ch++){
			System.out.println("생산자가 제품 " + ch + "을/를 생산했습니다.");
			house.put(ch); //메서드 호출, vec.add()
		}//for-end
	}//run()-end
}//class-end

//=============================================================
//get() 호출, 소비 클래스
class Consumer extends Thread{
	private House house; //전역변수
	
	//생성자
	public Consumer (House house){
		this.house=house;
	}//cons-end
	
	//run
	
	@Override
	public void run(){
		char ch;//변수
		for (int i = 1; i <= 10; i++) {
			ch=house.get();//메서드 호출   *(핵심)*
			System.out.println("소비자가 제품 " + ch + " 를 소비했습니다.");
		}//for-end
	}//run()-end
}//class-end
