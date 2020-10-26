import java.io.*;
import java.util.*;
class BitWise{
    
    // function to conver given N Gray to Binary
    public static int grayToBinary(int n) {
        int binary=0;
        for(;n>0;n=n>>1){
            binary = binary^n;
        }
        return binary;
    }
       
}

class GFG {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();//testcases
		while(t-->0){
		    int n = sc.nextInt();//initializing n
		    
		    BitWise obj = new BitWise();
		    
		    //calling grayToBinary() function
		    System.out.println(obj.grayToBinary(n));
		}
	}
}
