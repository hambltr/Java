package ch06_oop;

//static 변수를 잘 못 사용한 예제
//static 그 클래스의 모든 객체가 공유한다

class Product{
	private String name;//상품명
	private int num;//상품수량
	private int cost;//상품단가 :
	//    : 해당 부분이 static으로 들어가면 모든 단가를 공유해버림.. **

	//생성자(=생성자 메서드)
	public Product(String name, int num, int cost){
		this.name=name;// 전역변수에 매개변수 내용을 할당 a=100
		this.num=num;
		this.cost=cost;

	}//cons_end

	//사용자 정의 메서드 
	public void disp(){
		System.out.println(name+" "+num+" "+cost);

	}//disp_end

}//class_end

public class Test10staticVariable {

	public static void main(String[] args) {

		Product banana=new Product("바나나", 1,4500); //객체생성
		Product apple=new Product("사과", 3,5500);	//객체생성
		Product orange=new Product("오렌지", 5,3000); //객체생성
		
		banana.disp();
		apple.disp();
		orange.disp();
		
	}//main_end
}//class_end
