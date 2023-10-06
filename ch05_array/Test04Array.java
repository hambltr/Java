package ch05_array;
//지역변수 연습
public class Test04Array {
	public static void main(String[] args) {
		int a=10;
		
		if(a>3){
			int b=20;
			{
				int c=30;
			}
			System.out.println(a);
			System.out.println(b);//b는 if의 지역변수 이기 때문에 if문을 벗어나면 맹구됨
			System.out.println(c);//c는 if의 지역변수의 지역변수 이기 때문에 벗어나면 맹구됨
		}//if
		
		
		
	}//main
}//class
