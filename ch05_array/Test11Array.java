package ch05_array;
//3���� �迭, 3�� for��
public class Test11Array {
	public static void main(String[] args) {
		//a b c
		//d e f 0��° ��
		//
		//g h i
		//j k l 1��° ��

		char ch[][][]={
				{{'a','b','c'},{'d','e','f'}},
				{{'g','h','i'},{'j','k','l'}}
		};

		for(int i=0; i<2; i++){//��
			for(int j=0; j<2; j++){//��
				for(int k=0; k<3; k++){//��

					System.out.print(ch[i][j][k]+" ");
//										��   ��   ��
				}//inner-for
				System.out.println();//�౸��
			}//middle-for
			System.out.println();//�鱸��
		}//out-for
	}//main
}//class
