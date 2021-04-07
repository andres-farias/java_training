package cl.team.modeling.math;

/**
 * @author Andrés Farías (a.farias@globant.com)
 */
public class Point2D {

    private double radius;

    private double theta;

    public Point2D(double x, double y) {
        this.radius = Math.sqrt(x*x + y*y);
        this.theta = Math.atan(y/x);
    }

    public double getAbscissa() {
        return Math.cos(this.theta)*this.radius;
    }

    public double getOrdered() {
        return Math.sin(this.theta) * this.radius;
    }
}
