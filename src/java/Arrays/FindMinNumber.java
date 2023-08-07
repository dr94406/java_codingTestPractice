package Arrays;

import java.util.Scanner;

public class FindMinNumber {
    public int solution(int n) {
        int answer = 0;
        int[] check = new int[n+1];
        for (int i = 2; i <= n; i++) {
            if(check[i] == 0){
                answer++;
                for(int j = i; j <= n; j=j+i) check[j] = 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        FindMinNumber T = new FindMinNumber();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(T.solution(n));
    }
}
