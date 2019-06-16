package test;

public class ClassB extends ClassA {

    public ClassB() {

        System.out.println("Constructor B");
    }

    public int decision(int n) {
        if (n==0) {
            System.out.println("Fals");
        }
        else {
            System.out.println("Adevarat");
        }
        return n*10;
    }
}
