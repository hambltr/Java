package ch08_class;
import java.util.Scanner;

public class Test02Homework {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("주민등록번호를 '-' 포함하여 입력하세요: ");
        String jumin=scanner.nextLine(); // 주민등록번호를 문자열로 입력받습니다.
        scanner.close();

        if (jumin.length() !=14) {
            System.out.println("주민등록번호는 '-' 를 포함하여 13자리여야 합니다.");
            return;
        }//if

        char genderChar = jumin.charAt(7); // 주민등록번호 8번째 문자를 가져옵니다. (-1,-3 or -2,-4)
        int genderCode = Character.getNumericValue(genderChar); // 문자를 숫자로 변환

        String gender;
        if (genderCode%2==1) {
            gender="남성";
        } else {
            gender="여성";
        }//else

        System.out.println("입력한 주민등록번호는 " + gender + "입니다.");
    }//main
}//class
