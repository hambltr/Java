package ch08_class;

public class Test01 {
	public static void main(String[] args) {
		String str="Good After-noon Gil-Dong";
		//		 012345678901234567890123

		String s1=str.substring(16);//gil-dong 발췌
		System.out.println(s1);
		//실행

		String s2=str.substring(5,10);//After 발췌
		System.out.println(s2);
		//실행

		String ctz="991010-125510";
		// 	                0123456789012

		String j=ctz.substring(7,8);
		System.out.println(j);

		String str3="banana";
		//           012345
		int idx=str3.indexOf('a');//'a'가 첫번째로 발견된 위치를 반환한다. (return: 1번째 자리: //1)
		System.out.println(idx);


		String str5="총 비용은 $45.67";
		        //   01 234 567890
		int idx2=str5.indexOf("$45.67");
		System.out.println("idx2: "+idx2);//6
		String str7=str5.substring(idx2);// $45.67
		System.out.println(str7);
		
	}//main
}//class
