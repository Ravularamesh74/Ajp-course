public class rectangle {
    double area;
    double length;
    double width;
    double getArea(){
        return area = length * width;
    }
    double getLength(){
        return length = Math.sqrt(area / width);
    }
    double getWidth(){
        return width = Math.sqrt(area / length);
    }

    public static void main(String[] args) {
        rectangle rect = new rectangle();
        rect.area = 5;
        rect.length = 6;

        double areaa = rect.getArea();
        System.out.println("Area: " + areaa);

        double width = rect.getWidth();
        System.out.println("Width: " + width);
    }
}