package assignment6_3.line;

import assignment6_3.shape.Point;

import java.util.Objects;

public class Curve extends Line {
    private double curveDeg;

    public Curve(){
        super();
    }
    public Curve(Point sp, double curveDeg) {
        super(sp);
        this.curveDeg = curveDeg;
    }

    public Curve(int x, int y, double curveDeg) {
        super(x, y);
        this.curveDeg = curveDeg;
    }

    public double getCurveDeg() {
        return curveDeg;
    }

    public void setCurveDeg(double curveDeg) {
        this.curveDeg = curveDeg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Curve curve = (Curve) o;
        return Double.compare(curve.curveDeg, curveDeg) == 0;
    }

    @Override
    public String toString() {
        return "Curve{" + "sp=" + sp +
                ", curveDeg=" + curveDeg +
                '}';
    }



}
