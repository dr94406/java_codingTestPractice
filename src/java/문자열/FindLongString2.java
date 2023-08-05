package 문자열;

import java.util.Scanner;

public class FindLongString2 {
    public String solution(String str) {
        String answer =  "";
        int m = Integer.MIN_VALUE;
        String[] s = str.split(" ");
        for(String x : s) {
            int len = x.length(); // 길이 구하는 변수
            if (len > m) { // 최대값 구하기
                m = len;
                answer = x;
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        FindLongString2 T = new FindLongString2();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));
    }
}
