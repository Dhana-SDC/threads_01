package Threads;

public class Task2 {
		
		public static void main(String[] args) {
			
			System.out.println("Thread main started");
			
			Thread thread1 = new Thread(new MyTask());	
			Thread thread2 = new Thread(new MyTask());	
			thread1.start();
			thread2.start();
			
			System.out.println("Thread main finished");
		}
	}

	class MyTask implements Runnable {
		
		public MyTask() {
		}
		
		public void run() {
			for (int i = 0; i < 10; i++) {
				System.out.println("[" + Thread.currentThread().getName() + "]" + i);
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

