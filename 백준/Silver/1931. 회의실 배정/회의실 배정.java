import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] time = new int[n][2];
        for(int i = 0; i < n; i ++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            time[i][0] = Integer.parseInt(st.nextToken());
            time[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(time, (o1, o2) -> {
            if(o1[1] == o2[1]) {
                return o1[0] - o2[0];
            }
            return o1[1] - o2[1];
        });

        int count = 0;
        int endTime = 0;
        for(int i = 0; i < time.length; i++) {
            if(endTime <= time[i][0]) {
                endTime = time[i][1];
                count++;
            }
        }
        System.out.println(count);
    }
}