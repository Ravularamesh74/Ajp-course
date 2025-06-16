public class circle {
    double radius;
    double area;
    double circumference;

    void setRadius(double r) {
        radius = r;
    }

    double getArea() {
        area = Math.PI * radius * radius;
        return area;
    }

    double getCircumference() {
        circumference = 2 * Math.PI * radius;
        return circumference;
    }

    public static void main(String[] args) {
        circle c = new circle();
        c.setRadius(5);
        System.out.println("Area of the circle: " + c.getArea());
        System.out.println("Circumference of the circle: " + c.getCircumference());
    }
}
