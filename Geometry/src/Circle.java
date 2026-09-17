public class Circle {
    private double radius;
    private Point center;

    public Circle() {
        this.radius = 1;
        this.center = new Point();
    }

    public Circle(double radius) {
        this.radius = radius;
        this.center = new Point();
    }

    public Circle(double radius, Point center) {
        this.radius = radius;
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }
    public Point getCenter() {
        return center;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setCenter(Point center) {
        this.center = center;
    }




    public double getCircumference(){
        return 2 * Math.PI * radius;
//        return 0.0;   // This will make compiler happy
    }

    public double getArea(){
        return Math.PI * radius * radius;
//        return 0.0;   // This will make compiler happy
    }

    public boolean isInside(Point p){
        double xDifference = p.getX() - center.getX();
        double yDifference = p.getY() - center.getY();

        double distance = Math.sqrt(
                xDifference * xDifference +
                yDifference * yDifference
        );
//        return distance <= radius;
        //This is a trap!
        return distance <= radius;   // This will make compiler happy
    }

    public String toString() {
        return "radius: " + radius + "; center: " + center;
    }

}


