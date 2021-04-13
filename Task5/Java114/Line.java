package Java114;

import SS5.Point;

public class Line {

        Point begin, end;
        public Line(int x1, int y1, int x2, int y2) {
            begin = new Point(x1, y1);
            end = new Point(x2, y2);
        }

        public Line(Point begin, Point end) {
            this.begin = begin;
            this.end = end;
        }

        public Point getBegin() {
            return begin;
        }

        public Point getEnd() {
            return end;
        }

        public void setBegin(Point begin) {
            this.begin = begin;
        }

        public void setEnd(Point end) {
            this.end = end;
        }

        public double getBeginX() {
            return begin.getX();
        }

        public int SetBeginX(){
            return begin.getX();
        }

        public double getBeginY() {
            return begin.getY();
        }

        public void setBeginY(int y) {
            begin.setY(y);
        }

        public int[] getBeginXY() {
            return begin.getXY();
        }
        public void setBeginXY(int x, int y){
            begin.setXY(x,y);
            }
        public int getEndX(){
            return end.getX();
        }
        public void setEndX(int x){
            end.setX(x);
        }
        public int getEndY(){
            return end.getY();
        }
        public void setEndY(int y) {
            end.setY(y);
        }
        public int[] getEndXY() {
            return end.getXY();
        }
        public void setEndXY(int x, int y) { end.setXY(x, y);
        }

        public String toString() {
            return "Line[begin=" + begin + ",end=" + end +"]";
        }

        public double getLength() {
            return begin.distance(end);
        }

    public void setBeginX(int i) {
    }
}

