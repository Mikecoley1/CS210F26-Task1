public class Rectangle {
    private Point upperLeft;
    private Point upperRight;

    public Rectangle(Point, upper, Point lower) {
        upperLeft = upper;
        lowerRight = lower;
    }
    public Rectangle(Point upper, double w, double h) {
        upperLeft = upper;

        double newX = upper.getX() + w;
        double newY = upper.getY() - h;

        lowerRight = new Point(newX, newY);
    }
    public double getWidth() {
        return lowerRight.getX() - upperLeft.getX();
    }
    public double getHeight() {
        return upperLeft.getY() - lowerRight.getY();
    }
    public void setWidth(double width) {
        lowerRight.setX(upperLeft.getX() + width);
    }
    public void setHeight(double height) {
        lowerRight.setY(upperLeft.getY() - height);
    }
    public void display() {
        System.out.println("Upper Left: " + upperLeft);
        System.out.println("Lower Right: " + lowerRight);
        System.out.println("Width: " + getWidth());
        System.out.println("Height: " + getHeight());
    }

}