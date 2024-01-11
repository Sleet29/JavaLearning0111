package notepad;

public class Throw_문이해 {
	public static void main(String args[]) {
		Test test = new Test();
		
		try {
			test.test("1","ㄱ");
		} catch (NumberFormatException e) {		// 숫자 넘겨야 하지만 숫자와 문자를 넘겨준다.
			System.out.println("입력하신 값은 숫자가 아닙니다.");	// NumberFormatException 발생시 실행시킴
		}
	}
}

class Test{
	
	public void test(String a,String b) throws NumberFormatException{
		int sum = Integer.parseInt(a) + Integer.parseInt(b); // 문자로 받은 a와 b의 문자를 숫자로 변환하여 더한다.
		// 하지만 문자를 받을 시 형변환과정에서 NumberFormatException이 발생한다.
		System.out.println("문자로 입력받은" + a + "," + b + "의 합은" + sum + "입니다."); // 문자로 받은 숫자 2개의 합을 출력한다.
	}
}