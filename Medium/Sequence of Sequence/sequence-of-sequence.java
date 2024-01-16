//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String input_line[] = read.readLine().trim().split("\\s+");
            int m = Integer.parseInt(input_line[0]);
            int n = Integer.parseInt(input_line[1]);
            
            Solution ob = new Solution();
            System.out.println(ob.numberSequence(m, n));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static int ans=0;
    static void fun(int m,int n,int i,int size){
        if(size==n){
            ans+=1;
            return;
        }
        if(i>m)return;
        //System.out.println(i+" "+size);
        fun(m,n,i*2,size+1);
        //System.out.println(i+" "+size);
        fun(m,n,i+1,size);
    }
    static int numberSequence(int m, int n)
    {
        // code here
        ans=0;
        fun(m,n,1,0);
        return ans;
    }
}
