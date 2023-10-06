package ch01;

public class Test04CommandInput {
	public static void main(String args[]){
		System.out.println("�μ� ����:"+args.length);
		System.out.println("args[0]"+args[0]);
		System.out.println("args[1]"+args[1]);
		System.out.println("args[2]"+args[2]);
		
/* 		��Ŭ�������� �����ϸ� ������ �߻��ϴµ�,
		
	    Run menu >> Run Configurations... >> Arguments �� 
		 >> Program arguments >> �� ���� >> apply >> Run 
		 
		 �̴� String args[]�� �������� �־��ֱ� �����Դϴ�.
		 
		 ���� ������ ���Ⱑ ���ٸ�, �� ����ǥ�� ����Ͽ� ������� �մϴ�.
		 
		 ex) "alpha to omega" 
		
		cmd â������ ����
		
		C:\_work\java_work\JavaPro\bin>java ch01.Test04CommandInput aaa bbb ccc
		�μ� ����:3
		args[0]aaa
		args[1]bbb
		args[2]ccc 
*/
		
		
	}//main-end
}//class-end

/*
 	����� �μ� (�Ű�����)
	Java ���ø����̼ǿ��� �ݵ�� main()�̶�� ���� �޼ҵ尡 ���ԵǾ�� �Ѵ�.
	�� �޼ҵ�� String ��ü�迭�� �μ�(args) �ϳ��� ���´�.
	ex) main(String args[]) << args �� �ڿ� [] �� ��ġ�ص� ��� ����.

	�� �μ��� ��ü���� ����ڰ� ����ٿ� �Է� �� �� �ִ� ��� �μ��� ǥ���� �� �ִ�.

	����� �μ��� ����(�)�� int ���̰�, (��: args.length) �� ���ؼ� ���Ѵ�.
	�μ��� args[0], args[1], args[2], ... ������ ������ �ȴ�.
*/
