package com.lgcns;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello %s, %03d세, %.2fcm%n", "Jadexx", 33, 179.5);
        System.out.println("Jade!!");
//        String name = new String("Jade");
//        String nick = new String("Jade");
        String name = "Jade";
        String nick = "Jade";
        System.out.println("name = " + name);
        System.out.println("name==nick:" + (name == nick) + ", " + name.equals(nick));

        System.out.printf("%f%n", 0.1 + 0.2);
        System.out.println(0.1 + 0.2);

        float f = 0.99999998f;
        double d = 0.99999998;
        System.out.println("f, d = " + f + ", " + d);

    }
}
