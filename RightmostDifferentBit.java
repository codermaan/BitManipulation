import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;
public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc=new Scanner(System.in);
		//input number of testcases
		int t=sc.nextInt();
		int m,n;
		while(t-->0) {
		    m = sc.nextInt();
		    n = sc.nextInt();
		    System.out.println(posOfRightMostDiffBit(m, n));
		}
	}
class Bitwise{
              /*  function to find position of rightmost different bit
              *   m, n : Integers to find rightmost different bits
              */ 
      public static int posOfRightMostDiffBit(int m, int n) {
          if(m==n)return -1;
          int p = m^n;
          return (int)((Math.log10(p & -p))/Math.log10(2))+1;
      }
}
