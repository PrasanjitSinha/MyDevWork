public class Testing {

	void method(){
		System.out.println("hello");
	}
	static void  methodA(){
		new Testing().method();
	}
	public static void main(String[] args) {
		methodA();
	}
}
