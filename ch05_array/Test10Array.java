package ch05_array;
//1���� �迭, 2���� �迭  :: 1�� = �̸� , 2�� = ����, �� ���
// name1 100 99 �� ���
// name2 99 88
// name3 88 80

public class Test10Array {
	public static void main(String[] args) {

		String name[]={"name1","name2","name3"};
		int score[][]={
				{100,99},
				{99,88},
				{88,80}
		};
		int sum =0;//�� ���� ����
		for(int i=0; i<score.length; i++){//��
			System.out.print(name[i]+"\t");//�̸�
			
			for(int j=0; j<score[i].length; j++){//��
				System.out.print(score[i][j]+"\t");//����
				
				sum += score[i][j];//sum=sum+score[i][j]
				
			}//inner
			
			System.out.print(sum+"\t"+(sum/2.0));//�ڵ� ����ȯ int->double
			sum=0;// ���� ��� ���� ���ϱ� ���ؼ� sum�� �� �ٽ� �ʱ�ȭ
			System.out.println();
		}//out

		
	}//main
}//class
