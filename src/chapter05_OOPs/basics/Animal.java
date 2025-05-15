package chapter05_OOPs.basics;

class Animal {
    public void run() {
        System.out.println("i am running");
    }

    public static void main(String[] args) {
        Animal tuffy = new Animal();
        tuffy.run();
        tuffy.eat();

        Bird angad = new Bird();
        angad.fly();
        // we can't call the animal class method with the Bird class object angad.run()
        // will give you error

    }

    public void eat() {
        System.out.println("i am Eating");
    }
}

// This is another class we made but to run this class method we have create a
// new method with Bird Class
class Bird {
    void fly() {
        System.out.println("i am flying");
    }
}