package Lab02;

interface Shape {
    public double area();
}

class Circle implements Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.pow(radius, 2) * Math.PI;
    }
}


class Rectangle implements Shape {

    private double length, breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double area() {
        return length * breadth;
    }
}

class Triangle implements Shape {

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double area() {
        double s = (sideA + sideB + sideC) / 2;
        return Math.pow(s * (s - sideA) * (s - sideB) * (s - sideC), 0.5);
    }
}

class DynamicPolymorphism {
    public static void main(String[] args) {
        Shape shape;

        shape = new Circle(10);
        System.out.println("Area of circle: " + shape.area());

        shape = new Rectangle(10, 20);
        System.out.println("Area of rectangle: " + shape.area());

        shape = new Triangle(3, 4, 5);
        System.out.println("Area of triangle: " + shape.area());
    }
}
