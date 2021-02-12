package method_inside;
//클래스 내부에서 매소드 호출
public class Calculator {
	
	int plus(int x, int y) {
		int result = x+y;
		return result;
	}
	
	double avg(int x, int y) {
		double sum = plus(x, y); //위의 plus 메소드 호출
		double result = sum/2;
		return result;
	}
	
	void execute() {
		double result = avg(7, 10); //위의 avg 메소드 호출
		println("실행결과 : " + result); // 아래의 println 메소드 호출
	}
	
	void println(String message) {
		System.out.println(message);
	}
}
