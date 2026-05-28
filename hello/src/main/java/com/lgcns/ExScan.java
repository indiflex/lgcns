package com.lgcns;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class ExScan {
    private static final int LEN = 3;

    public static void main(String[] args) {
        int totScore = 0;
        int bestScore = 0;
        String bestMember = "";
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < LEN; i++) {
            try {
                System.out.print("이름과 점수는? ");
                String name = sc.next();
                int score = sc.nextInt();
                if (score > bestScore) {
                    bestMember = name;
                    bestScore = score;
                }
                totScore += score;
            } catch (Exception e) {
                sc.nextLine(); // clear scanner
                System.out.println("입력형식이 잘못되었습니다. usage) 홍길동 80");
                i--;
                continue;
            }
        }

        double avg = BigDecimal.valueOf(totScore).divide(BigDecimal.valueOf(LEN), RoundingMode.HALF_UP).doubleValue();
        System.out.printf("총점은 %d점, 평균은 %.2f점, 최고 득점자는 %s이며 학점은 %c 입니다.", totScore, avg, bestMember, grade(bestScore));
        sc.close();
    }

    private static char grade(int score) {
        return switch (score / 10) {
            case 9 -> 'A';
            case 8 -> 'B';
            case 7 -> 'C';
            default -> 'D';
        };
    }
}
