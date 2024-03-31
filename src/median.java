import java.util.Arrays;
import java.util.Scanner;

public class median {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int op=0;
            Arrays.sort(arr);
            int median;
            if(n%2!=0){
                median=arr[n/2];
            }
            else median=(arr[n/2]+arr[(n/2)-1])/2;
            int newMedian;
            int[] temp =new int[n];
            

        }
    }
}
