package practice1;

public class ArrayCopyExample2 {

	public static void main(String[] args) {
		String[] oldStrArray = { "공대생", "자바", "인공지능" };
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		for( int i=0 ; i<newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ",");
		}

	}

}
