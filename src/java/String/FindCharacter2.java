package String;

import java.util.Scanner;

import static java.lang.Character.*;

public class FindCharacter2 {
    public int solution(String str, char t) {
        int answer = 0;
        str = str.toUpperCase();
        t = toUpperCase(t);
        for(char x : str.toCharArray()){
            if(x == t) answer ++;
        }
        return answer;
    }

    public static void main(String[] args) {
        FindCharacter2 T = new FindCharacter2();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        System.out.print(T.solution(str, c));
    }
}
