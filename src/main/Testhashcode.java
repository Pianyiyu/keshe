package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;

public class Testhashcode {
    public static void main(String[] args) {
        A a1 = new A(1);
        A a2 = new A(1);
        B b = new B();
//        Vector<Integer> a;
//        ArrayList<Integer> b;
//        HashMap

        System.out.println(1<<4);
        System.out.println(1 << 30);
        System.out.println(a1.hashCode());
        System.out.println(a1.hashCode());
        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());
        System.out.println(a1.equals(a2));
        System.out.println(b.hashCode());
    }
}


class A {
    A(int a){
        this.a=a;
    }
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    int a;

//    @Override
//    public int hashCode() {
//        return a/1;
//    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;

        if (obj instanceof A) {
            A another = (A) obj;
            if (this.a == another.a) return true;
            else return false;
        }

        return false;
    }
}

class B {

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    int a;
}