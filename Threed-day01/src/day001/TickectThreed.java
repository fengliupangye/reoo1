package day001;

public class TickectThreed implements Runnable{
	private static  int count=100;
	@Override
	public  void run() {
		// TODO Auto-generated method stub
		while(count>0){
			ticket();
		}
	}
	
	public synchronized static void ticket(){
		if(count>0){
			System.out.println(Thread.currentThread().getName()+",���ڳ�Ʊ��"+(100-count+1)+"��");
			count--;
		}
	}
	
	public static void main(String[] args) {
		TickectThreed tickectThreed=new TickectThreed();
		new Thread(tickectThreed,"����һ").start();
		new Thread(tickectThreed,"���ڶ�").start();
	}

}
