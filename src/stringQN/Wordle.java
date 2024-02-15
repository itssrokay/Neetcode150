package stringQN;

import java.util.*;
import java.lang.*;
import java.io.*;

class Wordle
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        sc.nextLine();
        while(test-->0){
            String s=sc.nextLine();
            String t=sc.nextLine();
            String m="";

            for(int i=0;i<s.length();i++){
                if(s.charAt(i)==t.charAt(i)){
                    m+='G';
                }
                else m+='B';
            }
            System.out.println(m);

        }


    }
}

