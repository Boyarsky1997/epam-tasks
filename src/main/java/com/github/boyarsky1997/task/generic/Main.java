package com.github.boyarsky1997.task.generic;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Droid> droids1 = new PriorityQueue<>();

        droids1.add(0.1, new Droid("roman1"));
        droids1.add(0.4, new Droid("roma2"));
        droids1.add(0.3, new Droid("roman3"));
        droids1.add(0.5, new Droid("roman4"));
        Droid droid = droids1.get();
        Droid droid1 = droids1.get();
        Droid droid2 = droids1.get();
        Droid droid3 = droids1.get();
        Droid droid4 = droids1.get();
        Droid droid5 = droids1.get();
        System.out.println(droid);
        System.out.println(droid1);
        System.out.println(droid2);
        System.out.println(droid3);
        System.out.println(droid4);
        System.out.println(droid5);



    }
}
