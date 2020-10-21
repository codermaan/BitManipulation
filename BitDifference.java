import java.util.*;
import java.lang.*;
import java.io.*;
class CountBitFlip{ 
    // Function to count number of bits to 
    // be flipped to convert A to B
    public static int countBitsFlip(int a, int b){
        int p = a^b;
        int count = 0;
        while(p>0){
            if((p&1)!=0){
                count++;
            }
            p>>=1;
        }
        return count;
    }   
}
class BitWise {   
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();//testcases
		int m, n;
		long ans = 0; // initialise ans to 0
		while(t-->0) {		    
		    //input m and n
		    m = sc.nextInt();
		    n = sc.nextInt();
		    CountBitFlip obj = new CountBitFlip();
		    System.out.println(obj.countBitsFlip(m, n));
		}
	}
}
