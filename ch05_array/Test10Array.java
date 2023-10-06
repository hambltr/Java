package ch05_array;
//1차원 배열, 2차원 배열  :: 1차 = 이름 , 2차 = 점수, 합 평균
// name1 100 99 합 평균
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
		int sum =0;//합 구할 변수
		for(int i=0; i<score.length; i++){//행
			System.out.print(name[i]+"\t");//이름
			
			for(int j=0; j<score[i].length; j++){//열
				System.out.print(score[i][j]+"\t");//점수
				
				sum += score[i][j];//sum=sum+score[i][j]
				
			}//inner
			
			System.out.print(sum+"\t"+(sum/2.0));//자동 형변환 int->double
			sum=0;// 다음 사람 합을 구하기 위해서 sum값 을 다시 초기화
			System.out.println();
		}//out

		
	}//main
}//class
