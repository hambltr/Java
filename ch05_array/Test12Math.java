package ch05_array;

public class Test12Math {
	public static void main(String args[]){
		
		System.out.println(Math.PI); //변수의 상수화 -> 대문자로 작성 PI
		//static으로 된 메서드나 변수는 객체 생성을 하지 않아도 사용 가능하다.
		
		System.out.println(Math.abs(-100)); //abs = absolute : 절댓값만 출력 (양수, 음수 구분x)
		System.out.println(Math.abs(-12.5));
		System.out.println();//ㄱㅎ
		
		//max(double a, double b)
		//min(double a, double b)
		
		System.out.println(Math.max(12.5, 22.5));
		// Math.max 메서드는 두 개의 인수 중에서 최댓값을 반환합니다.
		// 여기서는 12.5와 22.5 중에서 22.5가 더 크므로 22.5가 출력됩니다.

		System.out.println(Math.min(12.5, 22.5));
		// Math.min 메서드는 두 개의 인수 중에서 최솟값을 반환합니다.
		// 여기서는 12.5와 22.5 중에서 12.5가 더 작으므로 12.5가 출력됩니다.
		
		System.out.println();//개행
		
		//floor(double a)
		//ceil(double a)
		//round(double a)
		
		
		System.out.println(Math.floor(5.7));
		// Math.floor 메서드는 주어진 숫자를 내림하여 가장 가까운 정수를 반환합니다.
		// 여기서는 5.7을 내림하면 5가 되므로 5가 출력됩니다.

		System.out.println(Math.ceil(5.7));
		// Math.ceil 메서드는 주어진 숫자를 올림하여 가장 가까운 정수를 반환합니다.
		// 여기서는 5.7을 올리면 6이 되므로 6이 출력됩니다.

		System.out.println(Math.round(5.7));
		// Math.round 메서드는 주어진 숫자를 반올림하여 가장 가까운 정수를 반환합니다.
		// 여기서는 5.7을 반올림하면 6이 되므로 6이 출력됩니다.
		
		System.out.println();//개행
		
		System.out.println("총 페이지 수: "+((37/10)+(37%10==0?0:1)));
		//일반 수식과 조건문을 활용하여 페이지 수 계산
		
		System.out.println("(ceil) 총 페이지 수: "+(int)(Math.ceil((double)37/10)));
		//ceil을 사용하여 doouble 형으로 나오는 결과값을 int로 캐스팅 해주는 구문
		
		System.out.println();//개행
		
		System.out.println(Math.round(5.7));
		System.out.println(Math.round(5.1));
		
		
		
		
	}//main
}//class
