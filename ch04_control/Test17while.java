package ch04_control;

public class Test17while {
	public static void main(String args[]){
		/*
		�ʱⰪ;
		while(����){
		ó��;
		����ġ;
		}
		 */

		//"�ݿ���"  5ȸ ���                                  
		//for(int i=1; i<=5; i++){ } ������ for��ó�� ���� ��
		int i=1;		//�ʱⰪ
		while(i<=5){	//����
			System.out.println("�ݿ���");
			i++; 		//����ġ
		}//while 

		System.out.println();//����

		i=1; //for�� ó�� �� ���� ���� �ʰ� �����ϸ� �޸� ���� ����
		while(i<=10){
			System.out.println(i+"�̸�");
			i++;
		}//while

		System.out.println();//����

		//1~10 ����غ���
		i=1;
		while(i<=10){
			System.out.print(i+" ");
			i++;
		}//while

		System.out.println();//����

		//1~20 ¦���� ����غ���

		i=1;
		while(i<=20){
			if(i%2==0){
				System.out.print(i+" ");
			}//if
			i++;
		}//while

		System.out.println();//����

		//1~10���� �� ���Ͻ�

		i=1;
		int sum=0; //���� ���� ������ ���� ����
		while(i<=10){
			sum+=i;
			i++;
		}//while

		System.out.print(sum);

		//1~20���� ¦���� ���Ͻ�

		i=1;
		sum=0;
		while(i<=20){
			if(i%2==0){
				sum += i;
			}//if
			i++;
		}//while
		System.out.println();//����
		System.out.println(sum);


	}//main



}//main


