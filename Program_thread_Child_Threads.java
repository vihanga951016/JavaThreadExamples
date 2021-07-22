package test;

class CA{
	
}

class TaskOne extends CA implements Runnable{
	public void run() {
		for(int doc=1;doc<=10;doc++) {
			System.out.println("@@"+doc);
		}
	}
}

class TaskTwo implements Runnable{
	public void run() {
		for(int doc=1;doc<=10;doc++) {
			System.out.println("%"+doc);
		}
	}
}


public class Program {

	public static void main(String[] args) {
		
		System.out.println("Application Start ****************");
		System.out.println("");

		Runnable run = new TaskOne();
		Thread taskOne = new Thread(run);
		taskOne.start();
		
		new Thread(new TaskTwo()).start();
		
		
		for(int doc=1;doc<=10;doc++) {
			System.out.println("^^"+doc);
		}

		System.out.println("");
		System.out.println("Application Ended ****************");
		
	}

}
