package AssignPolyandInheritance;

abstract class A1 { 
	
	abstract void m1(); 
	void m2(){ 
		System.out.println("One");	
		}
	}

class B extends A1{
	
	void m1() {
		System.out.println("abstract method");
	}
	void m2(){ 
		System.out.println("Two");
	} 	
}

public class Test {
	
public static void main(String[] args) {
	B b = new B(); 
	b.m2(); 
	} 
}
//There can be only one public class in a java file.
//The subclass of the abstract class has to implement all the abstract methods.
