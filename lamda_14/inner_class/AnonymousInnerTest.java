package lamda_14.inner_class;

class Outer2{
	
	/* 
	 * 익명(내부클래스) : 클래스 이름이 없는 클래스
	 * -추상클래스의 추상메소드, 인터페이스의 추상메소드를 잠시 사용하고 버릴때 사용.
	 */
	
	//1.메소드를 사용해서 구현.
	Runnable getRunnable(int i) {				//익명 내부 클래스, 메소드 내에서 클래스 이름이 생략된 내부 클래스
		int num=100;
		
		return new Runnable() {
			
			@Override
			public void run() {
				System.out.println();
				System.out.println(num);
			}
		};
	}
	
	Runnable runner = new Runnable() {
		@Override 
		public void run() {
			System.out.println("Runnable이 구성된 익명 클래스 변수");
		}
	};
}
public class AnonymousInnerTest {
	
	public static void main(String[] args) {
		Outer2 out = new Outer2();
		
		Runnable runner = out.getRunnable(10);
		runner.run();
		
		out.runner.run();
	}

}