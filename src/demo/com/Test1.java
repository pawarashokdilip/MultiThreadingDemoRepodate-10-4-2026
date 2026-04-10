package demo.com;

public class Test1 {
	public static void main(String[] args) throws InterruptedException {
		Printer p = new Printer();
		Mythread mt1 = new Mythread(p, "TATAmoters");
		mt1.setName("mt1");
		Mythread mt2 = new Mythread(p, "ZeRODA");
		mt2.setName("mt2");
		mt1.start();
		mt2.start();

	}
}

class Mythread extends Thread {
	Printer p;
	String name;

	public Mythread(Printer p, String name) {
		super();
		this.p = p;
		this.name = name;
	}

	public void run() {
		p.printSharename(name);
		

	}

}

class Printer {
	public  synchronized void    printSharename(String name) {
		for (int i = 0; i <=10; i++) {
			System.out.println("share name"+ name+"Printrd by ThreadName" + Thread.currentThread().getName());

		}
	}
}