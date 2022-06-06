package assignment6_3.line;

import assignment6_3.shape.Point;

import java.util.Objects;

public class Line {
    protected Point sp;
    public Line(){
        this.sp = new Point();
    }
    public Line(Point sp) {
        this.sp = sp;
    }
    public Line(int x, int y){
        this.sp = new Point(x, y);
    }

    public Point getSp() {
        return sp;
    }

    public void setSp(Point sp) {
        this.sp = sp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return Objects.equals(sp, line.sp);
    }

    @Override
    public String toString() {
        return "Line{" +
                "sp=" + sp +
                '}';
    }
}
