
//overloading
package practice;

public class ParentClass {
	
	public void getData(int a) {
		a=5;
		System.out.println(a);
	}
    public void getData(String b) {
    	b="Namrata";
    	System.out.println(b);
    }
    public void getData(int c, String d) {
    	c= 10;
    	d="Asati";
    	System.out.println(c + d);
    }
}
