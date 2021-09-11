package practice;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "madam";
		String w = "";
		// System.out.println(s.charAt(3));

		for (int i = s.length()-1; i>= 0; i--) {

			w = w + s.charAt(i);
			}

		System.out.println(w);
		
		
		System.out.println(s);
		

		if(s.equals(w)) {
			
			System.out.println("Palindrome");
		}
  
		else
		    System.out.println("Not palindrome");

	}
}
