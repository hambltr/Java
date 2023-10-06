package ch06_oop;
//static 변수: 그 클래스의 모든 객체가 공유한다 ***

//	올바른  예제: 성인, 미성년 판별하여 출력하기

public class Test09staticVariable {
	private String name; //전역변수
	private int age; //전역변수
	private static int adult=18; //전역변수
	
	//생성자(=생성자 메서드)
	public Test09staticVariable(String name,int age){
		this.name=name;
		this.age=age;
		
	}//constructor_end
	
	//사용자 정의 메서드
	public void dp(){
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
		if(age>=adult){
			System.out.println("성인 입니다.");
		}else{
			System.out.println("미성년자 입니다.");
		}//if-else_end
		System.out.println();//개행
	}//dp
	
	
	public static void main(String[] args) {
		
		Test09staticVariable im,iu,lee; //변수 선언

		im=new Test09staticVariable("임영웅",99);//객체 생성
		iu=new Test09staticVariable("아이유",99);//객체 생성
		lee=new Test09staticVariable("이시안",1);//객체 생성
		
		im.dp();//객체,메서드() 메서드 호출
		iu.dp();
		lee.dp();
		
		
	}//main_end
	
}//class_end
