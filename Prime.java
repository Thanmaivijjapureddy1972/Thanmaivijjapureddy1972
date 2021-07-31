import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int prime[]=new int[n+1];
for(int i=0;i<=n;i++)
{
prime[i]=1;
}
prime[1]=0;
for(int p=2;p*p<=n;p++)
{
if(prime[p]==1)
for(int i=p*p;i<=n;i=i+p)
{
if(prime[i]==1)
prime[i]=0;
}
}

if(prime[n]==1)
System.out.print("yes");
        else
            System.out.print("no");

    }
}
