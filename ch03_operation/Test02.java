package ch03_operation;

public class Test02 {
	public static void main(String[] args) {
		
		int a=5, b=3; //�ܼ� ���� ����
		System.out.println("a+b: "+(a+b));
		System.out.println("a-b: "+(a-b));
		System.out.println("a*b: "+(a*b));
		System.out.println("a/b: "+(a/b));
		System.out.println("a%b: "+(a%b));	
		System.out.println(); //����
		
		System.out.println("�Խ��� ������ �� ���ϱ�"); 
		int totalCount=37;
		int pageCount=(totalCount/10)+(totalCount%10==0?0:1);
		//						3	 +	 1
		//totalCount �� 10���� ���������� ������ ���� 0�ΰ�? True >> 0 , False >> 1
		
		System.out.println("Page: "+pageCount);
		
	}//main-end

}//class-end
