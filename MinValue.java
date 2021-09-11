package practice;

public class MinValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a[][]= {{4,5,8},{2,3,9},{1,9,7}};
       int min= a[0][0];
       for(int i=0;i<3;i++) {
    	   
    	   for(int j=0;j<3;j++) {
    		   
    		   System.out.print(a[i][j]);
    		   System.out.print("\t");
    		   if(a[i][j]< min) {
    			 min= a[i][j];
    			 }
    		   
    		   
    	   } System.out.println("");
    		   
    	   }System.out.print("your min number presents here =" +min);
       }
	}

