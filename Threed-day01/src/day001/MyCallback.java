package day001;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class MyCallback implements Callable<String>{

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		try {
			System.out.println(Thread.currentThread().getName()+"���ڿ�ʼ�첽���Ͷ���");
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "�첽���Ͷ���";
	}
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		FutureTask<String>  futureTask=new FutureTask<>(new MyCallback());
		new Thread(futureTask).start();
		System.out.println("result:"+futureTask.get());
	}

}
