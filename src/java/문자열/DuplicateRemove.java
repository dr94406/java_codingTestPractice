package 문자열;

import java.util.Scanner;

public class DuplicateRemove {
    public String solution(String str) {
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
//            System.out.println(str.charAt(i)+ " " + i+ " " + str.indexOf(str.charAt(i)));
            if(str.indexOf(str.charAt(i)) == i) answer+=str.charAt(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        DuplicateRemove T = new DuplicateRemove();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));

    }
}
