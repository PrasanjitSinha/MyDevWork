
public class ThreadJoin extends Thread {

	public void run(){
		for(int i=1;i<=5;i++){
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		ThreadJoin t1 = new ThreadJoin();
		ThreadJoin t2 = new ThreadJoin();
		ThreadJoin t3 = new ThreadJoin();
		
		t1.start();
		try{
			t1.join();
		} catch(Exception e){
			System.out.println(e);
		}
		t2.start();
		t3.start();
	}
}
