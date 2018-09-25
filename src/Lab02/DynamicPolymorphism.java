package Lab02;

interface Shape {
    public double Area();
}

class Circle implements Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double Area() {
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
    public double Area() {
        return length * breadth;
    }
}

class DynamicPolymorphism {

}
