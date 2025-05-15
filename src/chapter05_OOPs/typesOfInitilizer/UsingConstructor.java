package chapter05_OOPs.typesOfInitilizer;

public class UsingConstructor {
    String name;
    int age;

    // Parameterised Constructor
    UsingConstructor(String s, int i) {
        this.name = s;
        this.age = i;
    }

    // No-Argument Consttructor
    UsingConstructor() {
        name = "Manish";
        age = 24;
    }

    public static void main(String[] args) {
        UsingConstructor em1 = new UsingConstructor("ravi", 45);
        System.out.println(em1.name + " " + em1.age);

        // no-argument example
        UsingConstructor em2 = new UsingConstructor();
        System.out.println(em2.name + " " + em2.age);
    }
}
