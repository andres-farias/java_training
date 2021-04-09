package cl.team.modeling.math;

import cl.team.modeling.math.figures.Circle;
import cl.team.modeling.math.figures.Line;
import cl.team.modeling.math.figures.Point2D;

/**
 * @author Andrés Farías (a.farias@globant.com)
 */
public class Program {

    public static void main(String[] args) {

        Point2D myPoint = new Point2D(1, 1);
        System.out.println("Mi punto: (" + myPoint.getAbscissa() + ", " + myPoint.getOrdered() + ")");

        Point2D endPoint = new Point2D(2, 2);

        Line line = new Line(myPoint, endPoint);
        System.out.println("Mi linea: (" + line.getStartPoint() + ", " + line.getEndPoint() + ")");
        System.out.println("Largo de mi linea: (" + line.getLength()+")");

        Circle circle = new Circle(new Point2D(0,0), 1);
        System.out.printf("Circle perimeter = " + circle.getPerimeter());
    }
}
