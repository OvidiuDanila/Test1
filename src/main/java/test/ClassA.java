package test;

public class ClassA {

    public ClassA() {

        System.out.println("Constructor A");

        }

    public int decision(int n) {
        if (n==0) {
            System.out.println("A-Fals");
        }
        else {
            System.out.println("A-Adevarat");
        }
        return n*20;
    }

    public static void main(String[] args) {

        ClassA ex = new ClassA();
        System.out.println("Nimic");
        int x=7;
        System.out.println(ex.decision(x));
    }
}
