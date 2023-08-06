package String;

import java.util.Scanner;

public class ignorepalindromeString {
    public String solution(String s) {
        String answer = "NO";
        s = s.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(s).reverse().toString();
        if(s.equals(tmp)) answer ="YES";
        return answer;
    }

    public static void main(String[] args) {
        ignorepalindromeString T = new ignorepalindromeString();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.print(T.solution(str));
    }
}
