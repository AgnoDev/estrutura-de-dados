package com.projeto.no;

public class Main {

    public static void main(String[] args) {
        No no1 = new No("Nó 1");
        No no2 = new No("Nó 2");
        no1.setProximoNo(no2); // no1 aponta pro no3
        No no3 = new No("Nó 3");
        no2.setProximoNo(no3); // no2 aponta pro no3
        No no4 = new No("Nó 4");
        no3.setProximoNo(no4); // no3 aponta pro no4
                                // no1>no2>no3>no4>null

        System.out.println(no1);
        System.out.println(no2);
        System.out.println("------------------");
        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println("------------------");
        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());


    }
}
