package practice;

public class NestedLoop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=1;
		for(int i=0;i<5;i++) {
			
			//System.out.println(i +"i");
		
			for(int j=1;j<5-i; j++) {
				
				System.out.print(k);
				k++;
				System.out.print("\t");
		}System.out.println("");
		
		
		}

	}

}
