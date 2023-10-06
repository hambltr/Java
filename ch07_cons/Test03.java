package ch07_cons;

class SinSang{
	//전역변수 = 필드 = 프로퍼티 = property
	private String name;	//이름
	private int age;		//나이
	private double height;	//키

	//디폴트 생성자 오버로드
	public SinSang(){}

	//매개변수가 있는 생성자 오버로드
	public SinSang(String name, int age, double height){
		this.name=name;
		this.age=age;
		this.height=height;

	}//cons_end

	//매개변수가 있는 생성자 오버로드
	public SinSang(int age, String name, double height){
		this.age=age;
		this.name=name;
		this.height=height;

	}//cons_end

	//사용자 정의 메서드
	public void disp(){

		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
		System.out.println("키: "+height+"\n");

	}//disp()_end
}//class_end

public class Test03 {

	public static void main(String[] args) {
		SinSang kim,lee,park;//참조변수-레퍼런스 변수


		kim= new SinSang("김정은",45,155.5);
		lee= new SinSang(31,"이지은", 165.6);
		park= new SinSang("박찬호", 13,180.2);

		kim.disp();
		lee.disp();
		park.disp();

	}//main_end
}//class_end
