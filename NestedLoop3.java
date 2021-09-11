package practice;

public class NestedLoop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 0;
		for(int i=1;i<=9;i++) {
			if(i<=5) { k++;}
			else 
				k--;
			for(int j=1;j<=9;j++) {
				
						if(j<=6-k || j>=4+k) {
					System.out.print(j);
				  System.out.print("\t");
				}
					else
					System.out.print("\t");
						
			}
				System.out.println("");
			

	}

}
}

