package assignment6_3.line;

import assignment6_3.shape.Point;

import java.util.Objects;

public class StraightLine extends Line {
    private double slope;

    public StraightLine() {
        super();
    }

    public StraightLine(Point sp, double slope) {
        super(sp);
        this.slope = slope;
    }

    public StraightLine(int x, int y, double slope) {
        super(x, y);
        this.slope = slope;
    }

    public double getSlope() {
        return slope;
    }

    public void setSlope(double slope) {
        this.slope = slope;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        StraightLine that = (StraightLine) o;
        return Double.compare(that.slope, slope) == 0;
    }

    @Override
    public String toString() {
        return "StraightLine{" + "sp=" + sp +
                ", sslope=" + slope +
                '}';
    }



}
