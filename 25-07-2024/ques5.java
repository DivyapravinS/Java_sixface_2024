/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ques5;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author cclab
 */
public class ques5 {

    /**
     * @param args the command line arguments
     */
    static boolean prime(int n)
    {
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        // TODO code application logic here
       int n;
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
       n=sc.nextInt();
       int[] a = new int[n];
       int v=0;
        System.out.println("enter the array elements:");
       for(int i=0;i<n;i++)
       {
           a[i]=sc.nextInt();
           if(prime(a[i]))
           {
               v++;
           }
       }
       int[] b = new int[v];
       int j=0;
       for(int i=0;i<a.length;i++)
       {
           if(prime(a[i]))
           {
               b[j++]=a[i];
           }
       }
       Arrays.sort(b);
       int sum=0;
       for(int i=1;i<b.length;i++)
       {
           sum+=b[i];
       }
        System.out.println("Sum of prime numbers without first:"+sum);
    }
    
}
