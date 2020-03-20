import java.util.StringTokenizer;

public class Deadlock extends Thread {

	public static void main(String[] args) {
		final String res1 = "prasanjit";
		final String res2 = "rakhee";
		Thread t1 = new Thread(){
			public void run(){
				synchronized (res1){
					System.out.println("Thread 1 : locaked res1");
					try {
						Thread.sleep(100);
					} catch (Exception e){}
					synchronized (res2){
						System.out.println("thread 1:locaked res2");
					}
				}
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				synchronized (res2){
					System.out.println("Thread 2 locked res2");
					try {
						Thread.sleep(100);
					} catch (Exception e){}
					synchronized (res1){
						System.out.println("Thread 2 locaked res1");
					}
				}
			}
		};
		t1.start();
		t2.start();
	}
}
