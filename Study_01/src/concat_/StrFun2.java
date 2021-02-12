package concat_;

public class StrFun2 {

	public static void main(String[] args) {
		String greet = "안녕하세요.";
		String name = "정우성씨!";
		String text = "그들 자신의 눈으로 보고 자신의 심장으로 느끼는 사람들은 극히 드물다.";
		System.out.println(greet.concat(name));
		System.out.println(text.contains("심장"));
		System.out.println(text.contains("정열"));
	}

}
