abstract  class Parent {
	public abstract void printName();
}

class Child extends Parent {
	@Override
	public void printName() {
		System.out.println("Java programming");
	}
}

public class Prg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Child();
		p.printName();

	}

}
/* when we declare  abstract method in class . its mandatory to add abstract  keyword with class.
 * point 2, java source file, we can have multiple class but only class added with public access modifier can saved as .java extension
 */




