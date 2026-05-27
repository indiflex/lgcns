package com.lgcns;

import java.math.BigDecimal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello %s, %03d세, %.2fcm%n", "Jadexx", 33, 179.5);
        System.out.println("Hello Jade!!");
        System.out.println("Hello" + " " + "Jade!!");
        StringBuilder sb = new StringBuilder();
        sb.append("Hello").append(" ").append("World");
        System.out.println(sb.toString());
//        String name = new String("Jade");
//        String nick = new String("Jade");
        String name = "Jade";
        String nick = "Jade";
        System.out.println("name = " + name);
        System.out.println("name==nick:" + (name == nick) + ", " + name.equals(nick));

        System.out.printf("%f%n", 0.1 + 0.2);

        float f = 0.99999998f;
        double d = 0.99999998;
        System.out.println("f, d = " + f + ", " + d);

        String sql = "select * from User\n       where id = 1";
        System.out.println("sql = " + sql);
        String sql2 = """
                select * from User
                 where id = 1""";
        System.out.println("sql2 = " + sql2);
//        sb.append("select * from User");
//        sb.append(" where id = 1");
        String sql3 = """
                 select * from User
                         where id = %d
                """;
        System.out.println("sql3 = " + sql3.formatted(10));

        System.out.println(0.1 + 0.2);
        BigDecimal bd1 = BigDecimal.valueOf(0.1);
        BigDecimal bd2 = BigDecimal.valueOf(0.2);
        System.out.println(bd1.add(bd2));

        // i++ <==> i += 1 <==> i = i + 1
        OuterLoop:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("i = %d, j = %d%n", i, j);
                if (i == 1 && j == 1) break OuterLoop;
            }
        }

        int month = 4;
        String season = switch (month) {
            case 12, 1, 2 -> "겨울";
            case 3, 4, 5 -> {
                System.out.println("Spring!!");
                yield "봄";
            }
            case 6, 7, 8 -> {
                System.out.println("Summer!!");
                yield "여름";
            }
            default -> "가을";
        };
        System.out.println("season = " + season);

    } // end of main()
}
