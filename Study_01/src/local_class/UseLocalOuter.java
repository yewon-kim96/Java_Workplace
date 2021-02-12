package local_class;
//local class : method 내부에 정의하고, method 안에서만 사용되는 지역클래스 사용
//@예원
public class UseLocalOuter {
	int outI;
	
	public void method(int param_i, int param_j) {
		int locI = 10;
		int locJ = 20;
		
		///////////////////// 지역 클래스 시작 /////////////////////
		class Local {
			int i;
			
			public Local() {
				System.out.println("지역 클래스의 생성자");
			} //local
			
			public void locMethod() {
				System.out.println("지역 클래스의  method i = " + i);
				System.out.println("바깥 클래스의 인스턴스 변수 outI = " + outI);
				System.out.println("method 안의 지역변수 locI = " + locI + ", locJ = " + locJ);
				System.out.println("method의 매개변수 param_ i = " + param_i + ", param_j = " + param_j);
				//지역 클래스에서 바깥 클래스의 인스턴스 변수에 값할당은 가능
				outI = 34;
//				locI = 1;
//				locJ = 1; //지역변수 출력은 가능하나 값할당은 불가능
//				param_i = 1;
//				parma_j = 1; //매개변수도 출력은 가능하나 값할당은 불가능
			} //locMethod
			
		} //Local class
		///////////////////// 지역 클래스 끝 /////////////////////
		
//		locI = 1000;
//		param_i = 2000; 
		//지역 클래스 객체화
		
		Local loc = new Local();
		loc.i = 100;
		loc.locMethod();		
	} //method
	
	public static void main(String[] args) {
		UseLocalOuter ulo = new UseLocalOuter();
		ulo.method(2020, 11);
	} //main

} //class