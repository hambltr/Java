package ch01;

public class Test01 {
	
	/* JVM(가상머신)에 의해서 최초로 호출 되어지는 메서드를 쓰시오.
	     답 : public static void main(String args[]){}
	     
	   JVM(가상머신)을 가상 cpu 라고도 합니다. (cpu = 중앙처리장치)
	   JVM은 JDK만 설치하면 됩니다.*/
	
	
	
	public static void main(String args[]){

		        System.out.println("환경 설정 확인");
		        System.out.println("2023-09-18");
		        System.out.println("첫번째 실습");

	}//main-end
	
	 /* class : 키워드 (예약어)
	    Test01 : 클래스 이름,첫 글자를 대문자로 해야 합니다.
	    public : 접근제한자 키워드
	    static : 클래스에 소속
	    void : 리턴형 (무치형)
	    main : 메서드 이름
	    String args[] : 프로그램에 전달하는 인수값, Arguments, 문자열로 받음
	    
     */
}//class-end
