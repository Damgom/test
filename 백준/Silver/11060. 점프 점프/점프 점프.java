import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n+1];
        long[] dp = new long[1101];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            dp[i] = Integer.MAX_VALUE;
        }
        dp[1] = 0;
        for (int i = 1; i <= n; i++) {
            if (dp[i] >= Integer.MAX_VALUE) {
                continue;
            }
            for (int j = 1; j <= arr[i]; j++) {
                dp[i+j] = Math.min(dp[i+j], dp[i]+1);
            }
        }
        long result;
        if (dp[n] >= Integer.MAX_VALUE) {
            result = -1;
        } else {
            result = dp[n];
        }
        System.out.println(result);
    }
}
