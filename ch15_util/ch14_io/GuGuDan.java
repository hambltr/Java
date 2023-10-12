package ch14_io;

public class GuGuDan {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			System.out.println();
			for (int j = 2; j < 9; j++) {
				System.out.print(j+"*"+i+"="+(j*i)+"\t");
			}//inner-for
		}//out-for
	}//main-end
}//class-end
