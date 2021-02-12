package inner_class;
//inner class : 클래스 안에 클래스가 정의되는 클래스
//@예원

public class UseInner {
	int outI;
	
	public UseInner() {
		System.out.println("바깥 클래스의 생성자");
	} //UseInner
	
	public void outMethod() {
		System.out.println("바깥 클래스의 method " + outI);
//		System.out.println("안쪽 클래스의 변수 j " + j); -> 변수를 직접 접근하여 사용할 수 없다.
//		inMethod(); -> 내부 클래스의 method를 직접 접근할 수 없다.
	} //outMethod
	
	//////////////////////////// Inner Class 시작 ////////////////////////////////
	public class Inner {
		int j;
		
		public Inner() {
			System.out.println("안쪽 클래스의 생성자");
		} //Inner
		
		public void inMethod() {
			System.out.println("안쪽 클래스의 method j = " + j);
			System.out.println("바깥 클래스의 변수 outI = " + outI); 
			//내부 클래스에선는 바깥 클래스의 변수에 접근하여 사용할 수 있다.
			outMethod(); //바깥 클래스의 method 또한 사용 가능
		}  //inMethod
	} //class Inner
	////////////////////////////Inner Class 끝 ////////////////////////////////

	//내부 클래스를 객체화 해보기.
	public void createInner() {
		@SuppressWarnings("unused")
		Inner in = this.new Inner(); //this method를 호출하는 객체의 주소로 대체
		//this 생략 가능
		//this.outI
	} //createInner
	
	public static void main(String[] args) {
		//1.바깥 클래스 객체화
		UseInner ui = new UseInner();
		
		ui.createInner(); //2.바깥 클래스의 객체를 사용하여 내부 클래스의 객체를 생성한다.
		
		System.out.println("---------------------");
		
		//바깥 클래스명.안쪽 클래스명 객체명 = 바깥클래스객체명.new.안쪽클래스생성자();
		//UseInner.Inner in = ui.new Inner();
		Inner in = ui.new Inner();

		in.j = 11;
		in.inMethod(); //내부 클래스의 method에서 바깥 클래스의 변수나 method 호출
		
	} //main
} //class
