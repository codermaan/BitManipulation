import java.io.*;
import java.util.*;

class BitManipulation {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.findPosition(N));
        }
    }
}
class Solution {
    static int findPosition(int N) {
        boolean pow2 = ((N>0)&((N&(N-1))==0)); //1 set bit means power of 2
        if(N<1 | !pow2) return -1;             //if not then return -1  
        return ((int)(Math.log(N)/Math.log(2))+1);
    }
};
