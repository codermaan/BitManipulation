import java.io.*;
import java.util.*;
class Sparse{
    // Function to check if the given number is sparse or not
    public static boolean isSparse(int n){
        if((n&(n>>1))==0)
            return true;
        else
            return false;
    }   
}
class BitWise {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		//testcases
		int t = sc.nextInt();
		
		while(t-->0){
		    int n = sc.nextInt();
		    Sparse obj = new Sparse();
		    //printing 1 if isSparse returns true
		    if(obj.isSparse(n)){
		        System.out.println("1");
		    } else {
                System.out.println("0");
		    }
		}
	}
}  
