package Arrays;

import java.util.Scanner;

/**
 * A,B 두 사람이 가위 바위 보 게임을 한다. 비겼을 경우 D를 출력
 * 가위, 바위, 보의 정보 1: 가위, 2: 바위 3: 보
 */
public class BattleGame {
    public String solution(int n, int[] a, int[] b) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            if(a[i] == b[i]) answer+="D";
            else if(a[i] == 1 && b[i] == 3) answer +="A";
            else if(a[i] == 2 && b[i] == 1) answer +="A";
            else if(a[i] == 3 && b[i] == 2) answer +="A";
            else answer+= "B";
        }
        return answer;
    }

    public static void main(String[] args) {
        BattleGame T = new BattleGame();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = kb.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = kb.nextInt();
        }
        for(char x : T.solution(n, a, b).toCharArray()) System.out.println(x);
    }

}
