
public class SingletonDemo {

	private static SingletonDemo ins = new SingletonDemo();

	public static SingletonDemo getIns() {
		return ins;
	}
	
	public void show(){
		System.out.println("Hi Prasanjit");
	}
	
	public static void main(String[] args) {
		SingletonDemo obj = SingletonDemo.getIns();
		obj.show();
	}
}
