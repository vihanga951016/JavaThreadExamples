package test;

//class TaskOne{
//	void executeTaskOne() {
//		for(int doc=1;doc<=10;doc++) {
//			System.out.println("@@"+doc);
//		}
//	}
//}

//This is now child thread
class TaskOne extends Thread{
	public void run() {
		for(int doc=1;doc<=10;doc++) {
			System.out.println("@@"+doc);
		}
	}
}

public class Threads_program {

	//Main thread (Main method always in a thread)
	public static void main(String[] args) {
		
		//This application runs under sequence
		//Threads always execute code in a sequence
		
		
		System.out.println("Application Start ****************");
		System.out.println("");
		
		//If this task(TaskOne "@@") is a long running operation, the below "^^" will-
		//-wait until complete the long running task. That's causes a problem. For that-
		//we have to use threads.
		
		//This is now child thread
		TaskOne taskOne = new TaskOne();
		//taskOne.executeTaskOne();
		taskOne.start();
		
		for(int doc=1;doc<=10;doc++) {
			System.out.println("^^"+doc);
		}
		
		
		System.out.println("");
		System.out.println("Application Ended ****************");
		
	}
}


