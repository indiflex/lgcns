package com.lgcns;

enum Status {
    READY {
        public void apply() {
            System.out.println("ready");
        }
    }, DOING {
        public void apply() {
            System.out.println("doing");
        }
    }, DONE {
        public void apply() {
            System.out.println("done");
        }
    };

    public abstract void apply();
}

record Usr(int id, String name) {
}

class Usr2 {
    private int id;
    private String name;

    public Usr2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }
}

public class Enums {
    public static void main(String[] args) {
        Status sts = Status.READY;
        System.out.println("sts = " + sts);
        sts.apply();

        Usr u = new Usr(1, "Hong");
        System.out.println(u.id() + u.name());
    }
}
