package cl.team.modeling.math.figures;

/**
 * @author Andrés Farías (a.farias@globant.com)
 */
public class Line {

    private Point2D startPoint;
    private Point2D endPoint;

    public Line(Point2D startPoint, Point2D endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public Point2D getStartPoint() {
        return startPoint;
    }

    public Point2D getEndPoint() {
        return endPoint;
    }

    public double getLength() {

        double x = endPoint.getAbscissa() - startPoint.getAbscissa();
        double y = endPoint.getOrdered() - startPoint.getOrdered();
        return Math.sqrt(x * x + y * y);
    }

    public void setStartPoint(Point2D startPoint) {
        this.startPoint = startPoint;
    }

    public void setEndPoint(Point2D endPoint) {
        this.endPoint = endPoint;
    }
}
