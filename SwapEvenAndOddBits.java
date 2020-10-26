import java.io.*;
import java.util.*;
class Swap{
    
    // Function to swap odd and even bits
    public static int swapBits(int n) {
	    int evenBits = n & (0xaaaaaaaa); //0xaaaaaaaa --> 32 bit hexadecimal no with 1 at even positions 
	    int oddBits = n & (0x55555555);  //0x55555555 --> 32 bit hexadecimal no with 1 at odd positions
	    evenBits>>=1;                    //Right shift even bits by 1 position
	    oddBits<<=1;                     //Left shift odd bits by 1 position
	    return (evenBits|oddBits);
	}
    
}
class BitWise{

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();//testcases
		while(t-->0){
		    int n = sc.nextInt();//taking n
		    
		    Swap obj = new Swap();
		    
		    //calling swapBits() method of class
		    //Swap
		    System.out.println(obj.swapBits(n));
		}
	}
}
