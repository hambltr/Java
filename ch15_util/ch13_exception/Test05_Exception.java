package ch13_exception;

public class Test05_Exception {
	public static void main(String[] args) {
		try{
			System.out.println("aa() ȣ�� ��");
			aa();
			System.out.println("aa() ȣ�� ��");
		}catch(Exception e1){
			//System.out.println(e1);
			e1.printStackTrace();
		}finally{
			System.out.println("main() finally��");
		}

	}//main-end
	public static void aa(){
		try{
			System.out.println("bb() ȣ�� ��");
			bb();
			System.out.println("bb() ȣ�� ��");
		}catch(Exception e2){
			e2.printStackTrace();
		}finally{
			System.out.println("aa() finally��");
		}

	}//aa()-end

	public static void bb(){
		try{
			System.out.println("cc() ȣ�� ��");
			cc();
			System.out.println("cc() ȣ�� ��");
		}catch(Exception e3){
			e3.printStackTrace();
		}finally{
			System.out.println("bb() finally��");
		}

	}//bb()-end

	public static void cc(){
		try{
			System.out.println("dd() ȣ�� ��");
			dd();
			System.out.println("dd() ȣ�� ��");
		}catch(Exception e4){
			e4.printStackTrace();
		}finally{
			System.out.println("cc() finally��");
		}

	}//cc()-end
	
	public static void dd(){
		try{
			System.out.println("������ ��");
			int x=3, y=0;
			System.out.println(x/y);//���ܹ߻�
		}catch(Exception e5){
			e5.printStackTrace();
		}finally{
			System.out.println("dd() finally��");
		}

	}//cc()-end


	
}//class-end
