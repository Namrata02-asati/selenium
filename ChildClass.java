
//overloading
package practice;

public class ChildClass extends ParentClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParentClass ob= new ChildClass();
		ob.getData(5);
		ob.getData("Namrata");
		ob.getData(10, "Namrata");
		}
}
