import java.util.*;

class freedom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Count frequencies
            int count = 0;
            int count4 = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] == 6){
                    for(int j = i; j < n; j++){
                        if(arr[j] == 2){
                            count++;
                        }
                    }
                } else if (arr[i] == 4) {
                    count4++;
                }
            }

            // Calculate the number of pairs
            int ans = count;
            ans += nCr(count4, 2); // Using nCr function

            System.out.println(ans);
        }
    }

    // Function to calculate nCr
    static int nCr(int n, int r) {
        return r == 0 || r == n ? 1 : nCr(n - 1, r - 1) + nCr(n - 1, r);
    }
}
