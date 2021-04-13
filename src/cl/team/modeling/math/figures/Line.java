package cl.team.modeling.math.figures;

/**
 * @author Andrés Farías (a.farias@globant.com)
 */
public class Line implements Figure {

    private Point startPoint;
    private Point endPoint;

    public Line(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public double getLength() {

        double x = endPoint.getX() - startPoint.getX();
        double y = endPoint.getY() - startPoint.getY();
        return Math.sqrt(x * x + y * y);
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }

    public void setEndPoint(Point endPoint) {
        this.endPoint = endPoint;
    }

    @Override
    public double getPerimeter() {
        return this.getLength();
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public void move(Point finalPoint) {
        this.startPoint.move(finalPoint);
        this.endPoint.setX(endPoint.getX() + finalPoint.getX());
        this.endPoint.setY(endPoint.getY() + finalPoint.getY());
    }
}
