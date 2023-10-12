package ch15_util;
import java.util.Calendar;

//Calendar : 달력 만들때 사용 :: 추상클래스 , 객체생성 불가능
//내용없는 추상메서드가 존재하기 때문에

public class Test03_Calendar {
	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();//인스턴스 얻기 (객체 얻기)
		
		int year = cal.get(Calendar.YEAR); // 시스템의 년도를 얻음
		int month = cal.get(Calendar.MONTH); // 1월(0) 2월(1) 3월 (2) month만 이럼
		int day = cal.get(Calendar.DATE); //날짜 얻기
		
		int h=cal.get(Calendar.HOUR);
		int m=cal.get(Calendar.MINUTE);
		int s=cal.get(Calendar.SECOND);

		System.out.println(year+"-"+(month+1)+"-"+day);
		System.out.println(year+"-"+(month+1)+"-"+day+" "+h+":"+m+":"+s);
		System.out.println(year+"년 "+(month+1)+"월 "+day+"일 "+h+"시 "+m+"분 "+s+"초 ");
		
	}//main
}//class
