package cl.team.modeling.math.figures;

/**
 * @author Andrés Farías (a.farias@globant.com)
 */
public class Line {

    private Point2D inicio;
    private Point2D fin;

    public Line(Point2D inicio, Point2D fin) {
        this.inicio = inicio;
        this.fin = fin;
    }

    public Point2D getInicio() {
        return inicio;
    }

    public Point2D getFin() {
        return fin;
    }

    public double getLargo() {

        double x = fin.getAbscissa() - inicio.getAbscissa();
        double y = fin.getOrdered() - inicio.getOrdered();
        return Math.sqrt(x * x + y * y);
    }
}
