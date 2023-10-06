package ch06_oop;
public class Test05Method {
    // ���� ����ϴ� �޼��� 1
    public void star() {
        for (int i=1; i<=4; i++) { // �� ����
            for (int j=1; j<=i; j++) { // �� ����
                System.out.print("*"); // �� ���
            }//inner_for
            System.out.println(); // �� �ٲٱ�
        }//out_for
    }//star()_end

    // �ٸ� ����� ���� ����ϴ� �޼��� 2
    public void star2() {
        for (int i=1; i<=4; i++) { // �� ����
            for (int j=1; j<=(5-i); j++) { // �� ����, ���� ���
                System.out.print(" ");
            }//inner_for

            for (int k=1; k<=(i*2-1); k++) { // ��  i���� �� ���� ���� �޾ƿͼ�  �� ����, �� ���
                System.out.print("*");
            }//inner_for
            System.out.println(); //����
        }//out_for
    }//star2()_end

    // �������� ����ϴ� �޼��� 3
    public void gugudan() {
        for (int i=1; i<=9; i++) { // ���ϴ� �� ����
            for (int j=2; j<=9; j++) { // ������ ���� ����
                System.out.print(j+"*"+i+"="+(j*i)+"\t"); // ������ ���
            }//inner_for
            System.out.println(); //����
        }//out_for
    }//gugudan()_end

    public static void main(String[] args) {
        Test05Method t = new Test05Method();
        
        // �� ��� ��� �޼��� ȣ��
        t.star();//�޼��� 1
        System.out.println();
        
        t.star2();//�޼��� 2
        System.out.println(); 
        
        // ������ ��� �޼��� ȣ��
        t.gugudan();//�޼��� 3
        
        
        //star, star2, gugudan �� ȣ���ص� �Ǵ� ������ 
        //�̹� print ������ �� �־ �׷����ϴ�.
        
    }//main_end
}//class_end

