/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ques1;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author cclab
 */
public class ques1 {

    /**
     * @param args the command line arguments
     */
    static boolean number(char c)
    {
        if(c=='0'||c=='1'||c=='2'||c=='3'||c=='4'||c=='5'||c=='6'||c=='7'||c=='8'||c=='9')
        {
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        String s;
        int n=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string:");
        s=sc.nextLine();
        Stack<Integer> s1 = new Stack();
        for(int i=s.length()-1;i>=0;i--)
        {
            if(number(s.charAt(i)))
            {
                s1.push(Integer.parseInt(String.valueOf(s.charAt(i))));
            }
        }
        for(int i=0;i<s.length();i++)
        {
            int a,b;
                if(s.charAt(i)=='+')
                {
                     a=s1.pop();
                     b=s1.pop();
                    s1.push(a+b);
                }
                 if(s.charAt(i)=='-')
                {
                     a=s1.pop();
                     b=s1.pop();
                    s1.push(a-b);
                }
                 if(s.charAt(i)=='*')
                {
                     a=s1.pop();
                     b=s1.pop();
                    s1.push(a*b);
                }
                 if(s.charAt(i)=='/')
                {
                     a=s1.pop();
                     b=s1.pop();
                    s1.push(a/b);
                }   
        }
        System.out.println("total"+s1.get(0));
        
    }
    
}
