package ch01;

//Test03.java

class Test03{
    public static void main(String []args){
      System.out.print("�达");
      System.out.print("�̾�");
      System.out.print("�ھ�");
    
    /* println() �� ����(�� �ٲ�=line skip) �ȴ�
     print() �� �ٹٲ� �� �� */

    System.out.println();//�ٹٲ� �ȴ�
    System.out.print("�Ⱦ�\n");//\n : ���� (�ٹٲ�)
    System.out.print("�־�\n");

    System.out.println("aaa\tbbb\tccc");//\t ���� ���ݸ�ŭ �̰�(8ĭ)

/* 
 \n : ���� : �ٹٲ�
 \t : �̰� : ���� ���ݸ�ŭ �̰� (8ĭ)
 \r : ĳ���� ����(carrage return) : �� ���� ù��°�� Ŀ�� ��ǥ �̵� */
    
    System.out.print("�ȳ�\r");
    System.out.print("�ڹ�\r");//�ȳ� ���� ����
    System.out.println();//�ٹٲ�

    System.out.print("�ȳ�\r\n");
    System.out.print("�ڹ�\r\n");//�̷��� �ϸ� �Ⱦ���

    }
}