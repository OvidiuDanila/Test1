package test;

public class ClassA {

    public ClassA() {
        System.out.println("Constructor A");
    }

    public static void main(String[] args) {

        ClassA a = new ClassA(70);
        System.out.println("Nimic");
        int n=3;
        System.out.println(a.decision(n));
    }
}
