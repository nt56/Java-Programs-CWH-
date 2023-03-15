package MyPackage;

interface sampleInterface1{
	void meth1();
	void meth2();
}

interface sampleInterface2 extends sampleInterface1{
	void meth3();
	void meth4();
}

class SampleClass implements sampleInterface2{
	
	public void meth1() {
		System.out.println("method1");
	}
	
	public void meth2() {
		System.out.println("method2");
	}
	
	public void meth3() {
		System.out.println("method3");
	}
	
	public void meth4() {
		System.out.println("method4");
	}
}

public class InheritanceInterface {

	public static void main(String[] args) {
		
		SampleClass sc = new SampleClass();
		sc.meth1();
		sc.meth2();
		sc.meth3();
		sc.meth4();
	}

}
