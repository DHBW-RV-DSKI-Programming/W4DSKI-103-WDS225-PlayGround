package main.java.de.dhbw.ravensburg;

abstract class TaskShape {
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class TaskCircle extends TaskShape {
    private double radius;

    public TaskCircle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }
}

class TaskRectangle extends TaskShape {
    private double width;
    private double height;

    public TaskRectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return width * height;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (width + height);
    }
}

abstract class TaskAnimal {
    protected String name;

    public TaskAnimal(String name) {
        this.name = name;
    }

    abstract void makeNoise();

    void showName() {
        System.out.println("Name des Tieres: " + name);
    }
}

class TaskDog extends TaskAnimal {
    public TaskDog(String name) {
        super(name);
    }

    @Override
    void makeNoise() {
        System.out.println("Wuff! Wuff!");
    }
}

public class TaskAbstract {

    public static void main(String[] args) {
        // Demonstration Shape
        System.out.println("=== Shape Beispiele ===");
        TaskShape circle = new TaskCircle(5.0);
        System.out.println("Kreis mit Radius 5:");
        System.out.println("Fläche: " + circle.calculateArea());
        System.out.println("Umfang: " + circle.calculatePerimeter());

        TaskRectangle rectangle = new TaskRectangle(4.0, 6.0);
        System.out.println("\nRechteck mit Breite 4 und Höhe 6:");
        System.out.println("Fläche: " + rectangle.calculateArea());
        System.out.println("Umfang: " + rectangle.calculatePerimeter());

        // Demonstration Animal
        System.out.println("\n=== Animal Beispiel ===");
        TaskDog dog = new TaskDog("Bello");
        dog.showName();
        dog.makeNoise();
    }

}
