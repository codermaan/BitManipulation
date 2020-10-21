import java.util.*;
import java.lang.*;
import java.io.*;
public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();//taking testcases
		while(t-->0){
			int n=sc.nextInt();//input n
			System.out.println(getFirstSetBitPos(n));//calling method
		}
	}
class BitWise {
public static int getFirstSetBitPos(int n){
    if(n<=0) return 0;
    return (int)((Math.log10(n & -n))/Math.log10(2))+1;
}	
}
