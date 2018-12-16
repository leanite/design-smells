package modularization.broken.before;

public class Demo {
    public static void main(String[] args) {
        Point pointA = new Point(0, 5);
        Point pointB = new Point(3, 8);

        double distance =
                Math.sqrt(Math.pow(pointB.getX() - pointA.getX(), 2) + Math.pow(pointB.getY() - pointA.getY(), 2));

        System.out.println(distance);
    }
}
