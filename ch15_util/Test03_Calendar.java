package ch15_util;
import java.util.Calendar;

//Calendar : �޷� ���鶧 ��� :: �߻�Ŭ���� , ��ü���� �Ұ���
//������� �߻�޼��尡 �����ϱ� ������

public class Test03_Calendar {
	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();//�ν��Ͻ� ��� (��ü ���)
		
		int year = cal.get(Calendar.YEAR); // �ý����� �⵵�� ����
		int month = cal.get(Calendar.MONTH); // 1��(0) 2��(1) 3�� (2) month�� �̷�
		int day = cal.get(Calendar.DATE); //��¥ ���
		
		int h=cal.get(Calendar.HOUR);
		int m=cal.get(Calendar.MINUTE);
		int s=cal.get(Calendar.SECOND);

		System.out.println(year+"-"+(month+1)+"-"+day);
		System.out.println(year+"-"+(month+1)+"-"+day+" "+h+":"+m+":"+s);
		System.out.println(year+"�� "+(month+1)+"�� "+day+"�� "+h+"�� "+m+"�� "+s+"�� ");
		
	}//main
}//class
