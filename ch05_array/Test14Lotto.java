package ch05_array;

public class Test14Lotto {
	public static void main(String args[]){
		
		int lotto[]=new int[6];//�迭����, �迭����
		
		for(int i=0; i<6; i++){
			lotto[i]=(int)(Math.random()*45+1);	//���� �߻�
			//���⿡�� �ߺ��Ǵ� ���� �߻��� ���,
			
			for (int j=0; j<i; j++){
				if (lotto[i]==lotto[j]){
					i--; //�ߺ� �߻��� �� �ʱ�ȭ
					break; //inner_for break
					
				}//if
			}//inner_for
			
		}//out_for
		
		//�迭�� ���
		for (int i=0; i<6; i++){
			System.out.print(lotto[i]+" ");
		}
	}//main
}//class
