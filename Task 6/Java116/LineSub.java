package Java116;

import SS5.Point;

public class LineSub extends Point {
    Point end;

    public LineSub(int xl, int yl, int x2, int y2) {
        super(xl, yl);
        this.end = new Point(x2, y2);
    }

    public LineSub(Point begin, Point end) {
        super(begin.getX(), begin.getY());
        this.end = end;
    }

    public Point getBegin() {
        return this;
    }

    public Point getEnd() {
        return end;
    }

    public void setBegin(Point begin) {
        super.setX(begin.getX());
        super.setY(begin.getY());
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public int getBeginX() {
        return super.getX();
    }

    public void setBeginX(int x) {
        super.setX(x);
    }

    public int getBeginY() {
        return super.getY();
    }

    public void setBeginY(int y) {
        super.setY(y);

    }
    public int[] getBeginXY() {
        return super.getXY();
    }
    public void setBeginXY(int x, int y) {
        super.setXY(x, y);
    }
    public int getEndX() {
        return end.getX();
    }
    public void setEndX(int x) {
        end.setX(x);
    }
    public int getEndY() {
        return end.getY();
    }
    public void setEndY(int y) {
        end.setY(y);
    }
    public int[] getEndXY() {
        return end.getXY();
    }
    public void setEndXY(int x, int y) {
        end.setXY(x, y);
    }

    public String toString() {
        return "LineSub[begin=" + super.toString() + ",end=" + end + "]";
    }

    public double getLength() {
        return super.distance(end);
    }
}
