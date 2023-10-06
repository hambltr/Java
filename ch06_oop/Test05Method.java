package ch06_oop;
public class Test05Method {
    // 별을 출력하는 메서드 1
    public void star() {
        for (int i=1; i<=4; i++) { // 행 루프
            for (int j=1; j<=i; j++) { // 열 루프
                System.out.print("*"); // 별 출력
            }//inner_for
            System.out.println(); // 행 바꾸기
        }//out_for
    }//star()_end

    // 다른 모양의 별을 출력하는 메서드 2
    public void star2() {
        for (int i=1; i<=4; i++) { // 행 루프
            for (int j=1; j<=(5-i); j++) { // 열 루프, 공백 출력
                System.out.print(" ");
            }//inner_for

            for (int k=1; k<=(i*2-1); k++) { // 앞  i에서 행 루프 값을 받아와서  열 루프, 별 출력
                System.out.print("*");
            }//inner_for
            System.out.println(); //개행
        }//out_for
    }//star2()_end

    // 구구단을 출력하는 메서드 3
    public void gugudan() {
        for (int i=1; i<=9; i++) { // 곱하는 수 루프
            for (int j=2; j<=9; j++) { // 구구단 숫자 루프
                System.out.print(j+"*"+i+"="+(j*i)+"\t"); // 구구단 출력
            }//inner_for
            System.out.println(); //개행
        }//out_for
    }//gugudan()_end

    public static void main(String[] args) {
        Test05Method t = new Test05Method();
        
        // 별 모양 출력 메서드 호출
        t.star();//메서드 1
        System.out.println();
        
        t.star2();//메서드 2
        System.out.println(); 
        
        // 구구단 출력 메서드 호출
        t.gugudan();//메서드 3
        
        
        //star, star2, gugudan 만 호출해도 되는 이유는 
        //이미 print 구문이 들어가 있어서 그렇습니다.
        
    }//main_end
}//class_end

