package day001;

public class Threed002 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+"�������߳�");
	}

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+"�������߳�");
		new Thread(new Threed002()).start();
		/*new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println(Thread.currentThread().getName()+"�������߳�");
			}
		}).start();*/
		new Thread(() -> System.out.println(Thread.currentThread().getName()+"�������߳�")).start();
	}
	
}
