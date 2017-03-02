package course.Daniel.Java.Geometry;

/**
 * Created by Jakars on 28/02/2017.
 */
public class Point {
    public int x;
    public int y;

    public Point() {
    }

    public Point (int x, int y){
        this.x = x;
        this.y = y;
    }

    public Point (Point p){
        this.x = p.x;
        this.y = p.y;
    }
}
