package ch01;

//Test03.java

class Test03{
    public static void main(String []args){
      System.out.print("김씨");
      System.out.print("이씨");
      System.out.print("박씨");
    
    /* println() 는 개행(줄 바꿈=line skip) 된다
     print() 는 줄바꿈 안 됨 */

    System.out.println();//줄바꿈 된다
    System.out.print("안씨\n");//\n : 개행 (줄바꿈)
    System.out.print("최씨\n");

    System.out.println("aaa\tbbb\tccc");//\t 일정 간격만큼 이격(8칸)

/* 
 \n : 개행 : 줄바꿈
 \t : 이격 : 일정 간격만큼 이격 (8칸)
 \r : 캐리지 리턴(carrage return) : 그 줄의 첫번째로 커서 좌표 이동 */
    
    System.out.print("안녕\r");
    System.out.print("자바\r");//안녕 지문 씹힘
    System.out.println();//줄바꿈

    System.out.print("안녕\r\n");
    System.out.print("자바\r\n");//이렇게 하면 안씹힘

    }
}