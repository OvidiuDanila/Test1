package test;

public class ClassB extends ClassA {

    public ClassB() {

        System.out.println("Constructor B");
    }

    @Override
    public int decision(int n) {
        if (n==0) {
            System.out.println("B-Fals");
        }
        else {
            System.out.println("B-Adevarat");
        }
        return n*10;
    }
}
