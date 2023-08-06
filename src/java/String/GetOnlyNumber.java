package String;

import java.util.Scanner;

public class GetOnlyNumber {
    public int solution(String s) {
        String answer= "";
        for (char x : s.toCharArray()) {
            if(Character.isDigit(x)) answer += x; // 숫자를 포함 시 더하여 반환.
        }
        return Integer.parseInt(answer); // String to Integer casting
    }

    public static void main(String[] args) {
        GetOnlyNumber T = new GetOnlyNumber();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));
    }
}
