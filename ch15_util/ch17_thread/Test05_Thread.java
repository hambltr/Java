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
	Vector<Character> vec; //��������

	//������
	public House(){
		vec=new Vector<Character>();

	}//cons-end

	//put() : vec�� �ִ� �۾� , ����� ���� �޼���
	synchronized void put(char ch){
		while(vec.size()==3){ //�۾��� �� ���� ���� 
			try{
				wait();		  //���
			}catch(InterruptedException e){}
		}//while-end

		//ó������
		vec.add(new Character(ch));
		System.out.println("â�� " + ch + " �� ���Խ��ϴ�.");
		System.out.println("��� ����: "+vec.size() + " ��");
		notifyAll(); // ������ �۾����� ��ü�˸�


	}//put()-end

	//get() : vec���� ���� �۾� , ����� ���� �޼���
	synchronized char get(){
		while(vec.size()==0){
			try{ 
				wait();
			}catch(InterruptedException e){}
		}//while-end

		//ó������
		Character ch=(Character)vec.remove(0); //���� �� ����
		System.out.println("â���� " + ch + " �� �������ϴ�.");
		System.out.println("��� ����: " + vec.size() + " ��");
		notifyAll(); // ������ �۾����� ��ü�˸�

		return ch.charValue(); //char �ڷ������� ��ȯ �� return


	}//get()-end
}//class-end
//=============================================================
//put() ȣ�� , ����Ŭ����
class Producer extends Thread{
	private House house; //��������

	//������ 
	public Producer(House house){
		this.house=house;
	}//cons-end

	@Override
	public void run(){
		for(char ch='A'; ch<='J'; ch++){
			System.out.println("�����ڰ� ��ǰ " + ch + "��/�� �����߽��ϴ�.");
			house.put(ch); //�޼��� ȣ��, vec.add()
		}//for-end
	}//run()-end
}//class-end

//=============================================================
//get() ȣ��, �Һ� Ŭ����
class Consumer extends Thread{
	private House house; //��������
	
	//������
	public Consumer (House house){
		this.house=house;
	}//cons-end
	
	//run
	
	@Override
	public void run(){
		char ch;//����
		for (int i = 1; i <= 10; i++) {
			ch=house.get();//�޼��� ȣ��   *(�ٽ�)*
			System.out.println("�Һ��ڰ� ��ǰ " + ch + " �� �Һ��߽��ϴ�.");
		}//for-end
	}//run()-end
}//class-end
