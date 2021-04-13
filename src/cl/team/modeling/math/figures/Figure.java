package cl.team.modeling.math.figures;

/**
 * @author Andrés Farías (a.farias@globant.com)
 */
public interface Figure {

    /**
     * This method is responsible to determine the perimeter of this figure.
     *
     * @return the perimeter of the figure.
     */
    double getPerimeter();

    double getArea();

    void move(Point finalPoint);
}
