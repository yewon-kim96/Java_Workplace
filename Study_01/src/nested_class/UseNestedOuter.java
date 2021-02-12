package nested_class;
//중첩 클래스 : 클래스 안에 static 클래스를 정의하는 클래스
//@예원
public class UseNestedOuter {
	int outI;  //instance 변수
	static int outJ; //static 변수
	
	public void outInsMethod() {
		System.out.println("바깥 클래스의 instance method");
	} //outInsMethod
	
	public static void outStaMethod() {
		System.out.println("바깥 클래스의 static method");
	} //outStaMethod

	//////////////////// Nested class의 시작 //////////////////////////
	static class Inner {
		static int inI;
		
//		public Inner() {
//			//Nested class는 생성자를 정의하지 않는다.
//		}
		
		public static void inMethod() {
			System.out.println("내부 클래스의 method");
//			outI = 100; //static 영역에서는 instance변수 사용 불가
//			outInsMethod(); //instance method도 사용 불가
			outJ = 	100;
			outStaMethod(); //static 변수와 static method는 사용 가능
		} //inMethod
	} //Inner
	//////////////////// Nested class의 끝 //////////////////////////
	
	public static void main(String[] args) {
		Inner.inMethod(); //내부 클래스의 method를 static 문법으로 사용할 수 있다.
		
	}//main
} //class
