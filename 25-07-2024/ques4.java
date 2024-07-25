/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ques4;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author cclab
 */
public class ques4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size:");
        n=sc.nextInt();
        int[] a = new int[n];
        System.out.println("enter the array elements:");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        char[] c = new char[n];
         int[] a1 = new int[n];
        for(int i=0;i<n;i++)
        {
            a1[i]=a[i];
        }
        Arrays.sort(a1);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[i]==a1[j])
                {
                    c[i]=(char)(97+j);
                }
            }
        }
        System.out.println("Converted array:");
        for(int i=0;i<n;i++)
        {
            System.out.println(c[i]);
        }
    }
    
}
