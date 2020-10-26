import java.io.*;
import java.util.*;

class Gray{
    
    //  Function to find the gray code of given number N
    public static int greyConverter(int n) {
        
        return (n^(n>>1));
        
    }
    
}
class BitWise {
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();//testcases
		while(t-->0){
		    int n = sc.nextInt();//initializing n
		    
		    Gray obj = new Gray();
		    
		    //calling greyConverter() method
		    System.out.println(obj.greyConverter(n));
		}
	}
}
