package ch04_control;

public class Test06Variable {
	public static void main(String[] args) {
		Demo demo=new Demo();
		demo.aa();

	}//main-end
}//class-end


/*	
  	���������� �ڵ����� �ʱ�ȭ �� ��, �޼��� �ȿ����� ����
 	���������� �ڵ����� �ʱ�ȭ ��, �޼��� �ۿ����� ����
*/

class Demo{
	int age;		//�������� 0
	double height;  //�������� 0.0
	char ch;		//�������� �ʱ�ȭ
	String str;		//null�� �ʱ�ȭ
	
	public void aa(){
		System.out.println(age);
		System.out.println(height);
		System.out.println(ch);
		System.out.println(str);
	}
	
	public void bb(){
		int a;
		double d;
		char c;
		String s;
		
		System.out.println(a);
		System.out.println(d);
		System.out.println(c);
		System.out.println(s);
	}

}//class-end