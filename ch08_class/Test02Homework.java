package ch08_class;
import java.util.Scanner;

public class Test02Homework {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("�ֹε�Ϲ�ȣ�� '-' �����Ͽ� �Է��ϼ���: ");
        String jumin=scanner.nextLine(); // �ֹε�Ϲ�ȣ�� ���ڿ��� �Է¹޽��ϴ�.
        scanner.close();

        if (jumin.length() !=14) {
            System.out.println("�ֹε�Ϲ�ȣ�� '-' �� �����Ͽ� 13�ڸ����� �մϴ�.");
            return;
        }//if

        char genderChar = jumin.charAt(7); // �ֹε�Ϲ�ȣ 8��° ���ڸ� �����ɴϴ�. (-1,-3 or -2,-4)
        int genderCode = Character.getNumericValue(genderChar); // ���ڸ� ���ڷ� ��ȯ

        String gender;
        if (genderCode%2==1) {
            gender="����";
        } else {
            gender="����";
        }//else

        System.out.println("�Է��� �ֹε�Ϲ�ȣ�� " + gender + "�Դϴ�.");
    }//main
}//class
