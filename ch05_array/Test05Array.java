package ch05_array;

public class Test05Array {
	public static void main(String[] args) {
		int age[]={25,27,29};
		double height[]={177.7, 188.8, 199.9};
		String str[]={"name", "name2", "name3"};
		  
		for (int i=0; i<age.length; i++){
			System.out.println(age[i]+" "+height[i]+" "+str[i]);
			
		}//for
	}//main
}//class
