package test2;

public class Test { //아우터 클래스

	public static void main(String[] args) { //method 
		int out	= 10; //final int out 이라고 해줘야 되는데 자동으로 들어간다 (자바 1.8버전부터)
		
		class Inner { //이너클래스
			public int count() {
				int cnt = 0;
				for(int i = 0; i < out;i++) {
					cnt += i;
				}
				return cnt;
			}
		}
		Inner a = new Inner(); //객체 생성
	
		System.out.println(a.count());
		
//		Member m = new Member();
//		m.setAge(i);  //데이터의 패스, 전달
//		System.out.println(m.getAge());

	}

}



//class Member{ //별도의 클래스, inner 클래스 아님
//	private int age;
//	
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		if(age>0) {
//			this.age = age;
//		}
//	}
//}
