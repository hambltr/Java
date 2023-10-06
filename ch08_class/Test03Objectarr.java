package ch08_class;
//객체배열 실습



class Sung{
	private String name;
	private int kor;
	private int eng;
	
	public Sung(){}//디폴트 생성자
	
	//인자 있는 생성자
	public Sung(String name, int kor, int eng){
		this.name=name;
		this.kor=kor;
		this.eng=eng;
	}//cons-end
	
	//사용자 정의 메서드
	public void disp(){
		System.out.println(name + " " + kor + " " + eng + " ");
		
	}//disp_end
	
}//class_end

public class Test03Objectarr {
	public static void main(String[] args) {
	
		int a=10;
		int b=20;
		int c=30;
		
		//객체 = 레퍼런스변수 = 참조변수 = 인스턴스
		Sung kim=new Sung("Kim",77,88); //객체 사용
		Sung lee=new Sung("lee",11,22);
		Sung park=new Sung("park",33,44);
		
		//객체.메서드();
		kim.disp();
		lee.disp();
		park.disp();
		System.out.println("=======================");
		
		//실행
		
		//객체배열
		int x[]=new int[3];
		x[0]=100;
		x[1]=200;
		x[2]=300;
		
		//객체배열
		Sung s[]=new Sung[3];
		s[0]=new Sung("aaa",66,77);
		s[1]=new Sung("bbb",11,22);
		s[2]=new Sung("ccc",33,44);
		
		
		//for문을 사용해서 결과를 출력하시오
		
	    
        for(int i=0; i<s.length; i++){
        	s[i].disp();
        	
        }//for_end
        System.out.println("=======================");
		//
        int y[]={30,40,50};
        
        Sung m[]={new Sung("choi",77,88),
        		  new Sung("An",88,99),
        		  new Sung("aa",22,33)
        }; //Sung
        
        
        //for문으로 출력하시오
        for(int i=0; i<m.length; i++){
        	m[i].disp();
        }//for_end
        System.out.println("=======================");
        
       
	}//main_end
}//class_end
	
