package interface_inheritance;
//호출 가능한 메소드 구현
public class Example {

	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();
		
		InterfaceA ia = impl;
		ia.methodA();
		System.out.println();
		
		InterfaceB ib = impl;
		ib.methodB();
		System.out.println();
		
		InterfaceC ic = impl;
		ia.methodA();
		ib.methodB();
		ic.methodC();
	
	}

}
