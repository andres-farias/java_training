package cl.team.modeling.math;

import cl.team.modeling.math.figures.Circle;
import cl.team.modeling.math.figures.Line;
import cl.team.modeling.math.figures.Point;

/**
 * @author Andrés Farías (a.farias@globant.com)
 */
public class Program {

    public static void main(String[] args) {

        Point myPoint = new Point(1, 1);
        System.out.println("Mi punto: (" + myPoint.getX() + ", " + myPoint.getY() + ")");

        Point endPoint = new Point(2, 2);

        Line line = new Line(myPoint, endPoint);
        System.out.println("Mi linea: (" + line.getStartPoint() + ", " + line.getEndPoint() + ")");
        System.out.println("Largo de mi linea: (" + line.getLength()+")");

        Circle circle = new Circle(new Point(0,0), 1);
        System.out.println("Circle perimeter = " + circle.getPerimeter());
        System.out.println("Circle area = " + circle.getArea());

        myPoint.move(new Point(3, 3));
        System.out.println("Point Located at = " + myPoint.toString());
    }
}
