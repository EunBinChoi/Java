package assignment6_3.line;

import assignment6_3.shape.Point;

import java.util.Objects;

public class LineSegment extends Line implements LineSegmentControl {
    private Point ep;

    public LineSegment(){
        super();
        this.ep = new Point();
    }

    public LineSegment(Point sp, Point ep) {
        super(sp);
        this.ep = ep;
    }

    public LineSegment(int x1, int y1, int x2, int y2){
        super(x1, y1);
        this.ep = new Point(x2, y2);
    }

    public Point getEp() {
        return ep;
    }

    public void setEp(Point ep) {
        this.ep = ep;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        LineSegment that = (LineSegment) o;
        return Objects.equals(ep, that.ep);
    }

    @Override
    public String toString() {
        return "LineSegment{" +
                "sp=" + sp +
                ", ep=" + ep +
                '}';
    }

    @Override
    public double calcDistance() {
        return Math.sqrt(Math.pow((ep.getX() - sp.getX()), 2) + Math.pow((ep.getY() - sp.getY()), 2));
    }
}
