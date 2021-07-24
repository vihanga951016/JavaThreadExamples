package test;

class Printer{
	void printDocuments(String symbol) {
		for(int i=1;i<=10;i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(symbol+i);
		}
	}
}

class oldThread extends Thread{
	Printer pReference;
	
	public oldThread(Printer p) {
		pReference = p;
	}
	public void run() {
		pReference.printDocuments("#");
	}
	
}

class newThread extends Thread{
	Printer pReference;
	
	public newThread(Printer p) {
		pReference = p;
	}
	public void run() {
		pReference.printDocuments("^^");
	}
	
}

public class Program {

	public static void main(String[] args) {
		
		System.out.println("===========Start==========");
		
			Printer printer = new Printer();
			
			oldThread old_t = new oldThread(printer);
			old_t.start();
			newThread new_t = new newThread(printer);
			new_t.start();
			
		System.out.println("===========End============");
		
		
	}

}
