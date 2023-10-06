package ch08_class;
//클래스 상속 예제

class PanMae{
	//전역변수=필드=property(속성)
	protected String pum;//보호필드
	protected int su;
	protected int dan;


	//default 생성자
	public PanMae(){}

	public PanMae(String pum, int su, int dan){
		this.pum=pum;
		this.su=su;
		this.dan=dan;
	}//cons_end

	//사용자 정의 메서드
	protected void disp(){
		System.out.println(pum+" "+su+" "+dan);
	}//disp()_end

}//class_end-------------------------------------------

//파생클래스
class PanMaeSub extends PanMae{

	private double rate;//할인율

	//default생성자
	public PanMaeSub(){}

	//인자있는 생성자
	public PanMaeSub(String pum, int su, int dan, double rate){
		super(pum, su, dan);//상위 클래스 생성자 호출
		this.rate=rate;
	}//cons_end

	//메서드,오버라이딩: 상속받은 메서드 내용 재정의
	//protected void disp(){
	public void disp(){
		System.out.println();//개행
		System.out.println("품명: "+pum);
		System.out.println("수량: "+su);
		System.out.println("단가:: "+dan+"원");
		System.out.println("할인율: "+(rate * 100) + "%");

		System.out.println("할인 된 금액: "+(dan*rate)+"원");
		System.out.println("지불할 돈: "+(dan-(dan*rate))+"원");

	}//disp_end
}//class_end-------------------------------------------



public class Test04extends {

	public static void main(String[] args) {

		PanMae p1=new PanMae("배",3, 4000);
		p1.disp();
		//실행
		
		//상위 클래스 변수로 하위객체 처리
		p1=new PanMaeSub("수박",5, 25000, 0.2);
		p1.disp();
		//실행

		//상위 클래스 변수로 하위객체 처리
		//List list=new arralist();
		//Map map=new HashMap();
		
		
	}//main_end
}//class_end
