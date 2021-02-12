package import_;
//import : 외부 패키지에 존재하는 클래스를 사용하는 방법
//@예원
import java.util.Date;
import java.util.Calendar;
import java.util.List;
//import java.util.*; //패키지명.* -> 해당 패키지 내 모든 클래스, 인터페이스 사용가능, 권장X
//import java.sql.Date; //다른 패키지의 Date클래스는 import 불가, 먼저 선언하면 장땡
//따라서 소스에서 많이 사용되는 클래스를 import 처리, 적게 사용되는 클래스는 full path 처리


public class TestImport {
	public static void main(String[] args) {
		
		Date d = new Date();
		Calendar cal = null;
		List list = null;
		java.sql.Date da = null;
		
		System.out.println(d);
		System.out.println(cal);
		System.out.println(list);
		System.out.println(da);
	
	} //main

} //class
