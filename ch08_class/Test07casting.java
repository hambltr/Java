package ch08_class;
//클래스 상속, 클래스 캐스팅 예제

class PanMae3{
	protected String pum;//상품명
	protected int su;
	protected int dan;

	public PanMae3(){}//디폴트 생성자

	//인자 있는 생성자 (매개변수)
	public PanMae3(String pum, int su, int dan){
		this.pum=pum;
		this.su=su;
		this.dan=dan;
	}//cons_end

	//사용자 정의 메서드
	public void disp(){
		System.out.println();
		System.out.println(pum+" "+su+" "+dan);
	}//disp()_end

}//class_end==========


//파생클래스
class SalePanMae3 extends PanMae3{

	private double rate; //할인율

	public SalePanMae3(){}//디폴트 생성자

	//인자 있는 생성자 (매개변수)
	public SalePanMae3(String pum, int su, int dan, double rate){
		super(pum,su,dan); //상위 클래스 생성자 호출
		this.rate = rate; // 할인율 초기화
		
	}//cons_end

	//오버라이딩: 상속 받은 메서드 내용 재정의
	public void disp(){
		System.out.println();//개행
		System.out.println("품명: "+pum);
		System.out.println("수량: "+su);
		System.out.println("단가: "+dan);
	}//disp()_end

	//사용자 정의 메서드
	public void halInAk(){
		System.out.println("할인액: "+(dan*rate));
	}

}//class_end==========

public class Test07casting {
	public static void main(String[] args) {
		
		PanMae3 p[]=new PanMae3[4];//배열생성
		
		//상위 클래스 변수로 하위 객체 처리
		p[0]=new PanMae3("aaaa",4,6000);	//객체생성
		p[1]=new SalePanMae3("abab",4,6000,0.2);
		p[2]=new PanMae3("bbbb",4,9000);
		p[3]=new SalePanMae3("cccc",5,56000,0.2);
		
		for(int i=0; i<p.length; i++){
			p[i].disp();
			//p[i].halInAk(); //에러
			
			if (p[i] instanceof SalePanMae3){
				((SalePanMae3)p[i]).halInAk();
				
			}//if-end
		}//for-end
		
		
	}//main-end
}//class-end
