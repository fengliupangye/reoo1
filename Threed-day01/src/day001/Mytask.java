package day001;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Mytask  {
	private ReentrantReadWriteLock lock=new ReentrantReadWriteLock();
	
	//����̷߳��ʣ���������
	public void read() {
		// TODO Auto-generated method stub
		lock.readLock().lock();
		System.out.println(Thread.currentThread().getName()+"���ڶ�ȡ����");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"������ȡ����");
		lock.readLock().unlock();
	}
	//����̷߳��ʣ�дд����
	public void write() {
		// TODO Auto-generated method stub
		lock.writeLock().lock();
		System.out.println(Thread.currentThread().getName()+"����д��ȡ����");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"����д�����");
		lock.writeLock().unlock();
	}
	
	public static void main(String[] args) {
		Mytask mytask=new Mytask();
		/*for(int i=0;i<10;i++){
			new Thread(()-> {mytask.read();}).start();
		}*/
		for(int i=0;i<10;i++){
			new Thread(()-> {mytask.write();}).start();
		}
		for(int i=0;i<10;i++){
			new Thread(()-> {mytask.read ();}).start();
		}
	}

}
