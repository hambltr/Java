package ch13_exception;

public class Test02_Exception {
	public static void main(String[] args) {
		try{
			int num=Integer.parseInt(args[0]);
			//if(num%2==0){
			if(num%0==0){
				System.out.println(num+" ��/�� ¦���Դϴ�.");
			}else{
				System.out.println(num+" ��/�� Ȧ���Դϴ�.");
			}
						
		}catch(ArrayIndexOutOfBoundsException e1){
			System.out.println("�迭����: "+e1);
		}catch(NullPointerException e2){
			System.out.println("���ڿ���: "+e2);
		}catch(ArithmeticException e3){
			System.out.println("���꿡��: "+e3);
		}finally{
			System.out.println("finally��: ���� �߻��� ��� ���� ������ ����");
		}
	}//main
}//class