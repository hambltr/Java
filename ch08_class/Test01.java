package ch08_class;

public class Test01 {
	public static void main(String[] args) {
		String str="Good After-noon Gil-Dong";
		//		 012345678901234567890123

		String s1=str.substring(16);//gil-dong ����
		System.out.println(s1);
		//����

		String s2=str.substring(5,10);//After ����
		System.out.println(s2);
		//����

		String ctz="991010-125510";
		// 	                0123456789012

		String j=ctz.substring(7,8);
		System.out.println(j);

		String str3="banana";
		//           012345
		int idx=str3.indexOf('a');//'a'�� ù��°�� �߰ߵ� ��ġ�� ��ȯ�Ѵ�. (return: 1��° �ڸ�: //1)
		System.out.println(idx);


		String str5="�� ����� $45.67";
		        //   01 234 567890
		int idx2=str5.indexOf("$45.67");
		System.out.println("idx2: "+idx2);//6
		String str7=str5.substring(idx2);// $45.67
		System.out.println(str7);
		
	}//main
}//class
