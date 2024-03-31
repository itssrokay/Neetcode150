package stringQN;
import java.util.*;
import java.lang.*;
import java.io.*;

public class pawri {


        public static void main (String[] args) throws java.lang.Exception
        {
            // your code goes here
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            sc.nextLine();
            char[] p={'p','a','r','t','y'};
            char[] te={'p','a','w','r','i'};

            while(t-- >0){
                String s=sc.nextLine();
                String result=s.replaceAll("party","pawri");
                char[] ch=s.toCharArray();
                for(int i=0;i<ch.length;i++){
                    if(s.length()<5){
                        break;
                    }
                    int k=i;
                    for(int j=0;j<5;j++){
                        if(ch[k]==p[j]){
                            if(j==4){
                                for(int z=i;z<i+5;z++){
                                    ch[z]=te[z-i];
                                }
                            }
                            k++;
                        }
                        else break;

                    }
                }
                System.out.println(new String(ch));
                System.out.println(result);
            }

        }

}
