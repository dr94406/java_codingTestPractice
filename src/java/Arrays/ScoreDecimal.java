package Arrays;

import java.util.Scanner;

public class ScoreDecimal {
    public int solution(int n, int[] arr) {
        int answer = 0, cnt = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] == 1) {
                cnt++;
                answer += cnt;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        ScoreDecimal T = new ScoreDecimal();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(n,arr));
    }
}
