package chapter05_OOPs.typesOfInitilizer;

/*In Java Object-Oriented Programming (OOP), initializing an object means creating an instance of a class and assigning values to its fields. Here are the main methods to initialize an object: */

// Type 1
class ReferenceVariable {
    String color;
    int age;

    public static void main(String[] args) {
        ReferenceVariable raju = new ReferenceVariable();
        raju.color = "black";
        raju.age = 23;
        System.out.println(raju.color + " " + raju.age);
    }
}
