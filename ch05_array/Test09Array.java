package ch05_array;
//2�� �迭 ����
public class Test09Array {
	public static void main(String[] args) {
		
		double ki[][]={
					  {177.7, 166.6},
					  {188.8, 157.7}
		};
		
		
		//2���� �迭�� 2�� for�� ���
		for(int i=0; i<ki.length; i++){
			for(int j=0; j<ki[i].length; j++){
				System.out.print(ki[i][j]+"  ");
			}//inner
			System.out.println();//�� ���� ����
			
		}//out
	}//main
}
//class