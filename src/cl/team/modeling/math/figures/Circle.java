package cl.team.modeling.math.figures;

import java.util.Objects;

/**
 * This class aims to provide an abstraction of a circle.
 *
 * @author Andrés Farías (a.farias@globant.com)
 */
public class Circle {

    /**
     * This is the center of the circle
     */
    private Point2D center;

    /**
     * This is the radius of the circle
     */
    private double radius;

    public Circle() {
        this.center = new Point2D(0, 0);
        this.radius = 0;
    }

    public Circle(Point2D center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    /**
     * This method is responsible to calculate the perimeter of this circle.
     *
     * @return The perimeter of this circle.
     */
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
