package chapter05_OOPs.typesOfInitilizer;

public class UsingMethod {
    String color;
    int age;

    void input(String c, int a) {
        color = c;
        age = a;
    }

    void print() {
        System.out.println(color + " " + age);
    }

    public static void main(String[] args) {
        UsingMethod kaju = new UsingMethod();
        kaju.input("rass", 122);
        kaju.print();
    }
}
