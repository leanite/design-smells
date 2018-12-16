package modularization.broken.after;

public class Demo {
    public static void main(String[] args) {
        Point pointA = new Point(0, 5);
        Point pointB = new Point(3, 8);

        System.out.println(pointA.calculateDistanceTo(pointB));
    }
}
