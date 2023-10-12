package ch13_exception;

public class Test05_Exception {
	public static void main(String[] args) {
		try{
			System.out.println("aa() 호출 전");
			aa();
			System.out.println("aa() 호출 후");
		}catch(Exception e1){
			//System.out.println(e1);
			e1.printStackTrace();
		}finally{
			System.out.println("main() finally절");
		}

	}//main-end
	public static void aa(){
		try{
			System.out.println("bb() 호출 전");
			bb();
			System.out.println("bb() 호출 후");
		}catch(Exception e2){
			e2.printStackTrace();
		}finally{
			System.out.println("aa() finally절");
		}

	}//aa()-end

	public static void bb(){
		try{
			System.out.println("cc() 호출 전");
			cc();
			System.out.println("cc() 호출 후");
		}catch(Exception e3){
			e3.printStackTrace();
		}finally{
			System.out.println("bb() finally절");
		}

	}//bb()-end

	public static void cc(){
		try{
			System.out.println("dd() 호출 전");
			dd();
			System.out.println("dd() 호출 후");
		}catch(Exception e4){
			e4.printStackTrace();
		}finally{
			System.out.println("cc() finally절");
		}

	}//cc()-end
	
	public static void dd(){
		try{
			System.out.println("나누기 전");
			int x=3, y=0;
			System.out.println(x/y);//예외발생
		}catch(Exception e5){
			e5.printStackTrace();
		}finally{
			System.out.println("dd() finally절");
		}

	}//cc()-end


	
}//class-end
