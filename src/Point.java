
/**
 * the point class
 * @author Evan 33%
 * @author Cam 33%
 * @author Tyler 33%
 * @version 2018.04.18
 */
public class Point {
    private int x;
    private int y;

    /**
     * O(1)
     * @param x the x value
     * @param y the y value
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int setX(int x) {
        return this.x = x;
    }

    public int setY(int y) {
        return this.y = y;
    }

    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (o instanceof Point) {
            return this.x == ((Point) o).getX() && this.y == ((Point) o).getY();
        }
        return false;
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }
}