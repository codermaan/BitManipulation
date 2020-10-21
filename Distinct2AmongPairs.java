import java.util.*;
import java.lang.*;
import java.io.*;
class BitManipulation
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine();
            String[] S = s.split(" ");
            int[] v = new int[2 * n + 2];
            for(int i = 0; i < 2 * n + 2; i++)
            {
                v[i] = Integer.parseInt(S[i]);
            }
            Solution ob = new Solution();
            int[] ans = ob.singleNumber(v);
            for(int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}
class Solution
{
    public int[] singleNumber(int[] nums)
    {
        int xor = 0;
        for(int i=0; i<nums.length; i++){
            xor = xor ^ nums[i];
        }
        // & of a number and its 2's complement 
        //gives rightmost set bit
        xor = xor & -xor;
        int sum[] = new int[2];
        
        for(int i=0; i<nums.length; i++){
            if((nums[i]&xor)>0){
                sum[0]=sum[0]^nums[i];
            }
            else
                sum[1]=sum[1]^nums[i];
        }
        //for ascending order list
        if(sum[1]<sum[0]){
            int temp = sum[0];
            sum[0] = sum[1];
            sum[1] = temp;
        }
        return sum;
    }
}
