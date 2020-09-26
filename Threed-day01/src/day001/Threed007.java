package day001;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Threed007 implements Runnable{
	
	private int  count=100;
	private Lock lock=new ReentrantLock(); 

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (count>0){
			ticket();
		}
		
	}
	
	public void ticket(){
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			lock.lock();
			if(count>0){
				System.out.println(Thread.currentThread().getName()+",���ڳ�Ʊ��"+(100-count+1)+"��");
				count--;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
	}
	
	public static void main(String[] args) {
		Threed007 threed007=new Threed007();
		new Thread(threed007,"����һ").start();
		new Thread(threed007,"���ڶ�").start();
	}

}
