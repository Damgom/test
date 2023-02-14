import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_1105 {
    public static void main(String[] args) throws IOException {
        /**
         * @Boj_1105 팔
         * @greedy
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String left = st.nextToken();
        String right = st.nextToken();
        int count = 0;
        if (left.length() == right.length()) {
            for (int i = 0; i < left.length(); i++) {
                if (left.charAt(i) != right.charAt(i)) {
                    break;
                }else if (left.charAt(i) - '0' == 8) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
