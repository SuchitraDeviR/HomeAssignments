package homeassignment.week1;

public class IsPrime {

	public static void main(String[] args) {
		int n=121;
		boolean flag=true;
		for (int i = 2; i < n-1; i++) {
				 
		        // if N is perfectly divisible by i
		        // flag is set to 0 i.e false
		        if (n % i == 0) {
		            flag = false;
		            break;
		        }
		    }
		 
		    if (flag) {
		        System.out.println(n + " is a Prime Number");
		    }
		    else {
		    	System.out.println(n + " is not a Prime Number");
		    }	
	}
}
