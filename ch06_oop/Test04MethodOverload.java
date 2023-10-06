package ch06_oop;

public class Test04MethodOverload {

	public int add(int end){
		int sum=0;
		for (int i=1; i<=end; i++){
			sum+=i;
		}//for_end
		return sum;
	}//add_end

	public int add(int a, int b){
		int s=a+b;
		return s;
	}//add_end
	
	public static void main(String[] args) {
		
		Test04MethodOverload t=new Test04MethodOverload();//객체 생성
		
		System.out.println(t.add(10)); //1~10까지의 합
		System.out.println(t.add(100)); //1~100까지의 합
		System.out.println(t.add(1000)); //1~1000까지의 합

		System.out.println(t.add(10,5));//10+5
		System.out.println(t.add(100,15));//100+15
		
		
	}//main_end
}//class_end
