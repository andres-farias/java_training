package cl.team.modeling.math;

import cl.team.modeling.math.figures.Line;
import cl.team.modeling.math.figures.Point2D;

import java.awt.*;

/**
 * @author Andrés Farías (a.farias@globant.com)
 */
public class Program {

    public static void main(String[] args) {

        Point2D myPoint = new Point2D(1, 1);
        System.out.println("Mi punto: (" + myPoint.getAbscissa() + ", " + myPoint.getOrdered() + ")");

        Point2D endPoint = new Point2D(2, 2);

        Line line = new Line(myPoint, endPoint);
        System.out.println("Mi linea: (" + line.getInicio() + ", " + line.getFin() + ")");
        System.out.println("Largo de mi linea: (" + line.getLargo()+")");

    }
}
