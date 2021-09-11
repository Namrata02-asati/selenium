package practice;

public class ChildOverriding extends ParentOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParentOverriding n= new ChildOverriding();
		n.Parentcolour("white", 6);

	}
	
	public void  Parentcolour(String s, int height) {
		s="white";
		height= 6;
		System.out.println(s + height);
	}

}
