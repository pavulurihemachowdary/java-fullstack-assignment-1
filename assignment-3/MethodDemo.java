class Parent {
    void display() {
        System.out.println("Parent's display method");
    }

    void print(String message) {
        System.out.println("Parent's print method: " + message);
    }
}

class Child extends Parent {
    @Override
    void display() {
        System.out.println("Child's display method");
    }

    void print(int number) {
        System.out.println("Child's print method: " + number);
    }
}

public class MethodDemo {
    public static void main(String[] args) {
        Parent obj1 = new Parent();
        obj1.display();  // Output: Parent's display method
        obj1.print("Hello");  // Output: Parent's print method: Hello

        Child obj2 = new Child();
        obj2.display();  // Output: Child's display method
        obj2.print(10);  // Output: Child's print method: 10
    }
}
