package Data;

import Model.Point;

public class CoordinatesDataSet {

    public final static float BIAS = 1;

    private final static float MAX_COORDS = 1;
    private final static float MIN_COORDS = -1;

    private Point[] points;

    // Initialize points with some random x, y values and determine the label for those points
    public CoordinatesDataSet(int inDataSetSize){
        points = new Point[inDataSetSize];
        for (int i = 0; i < points.length; i++) {
            float x = (float)(Math.random()*((MAX_COORDS - MIN_COORDS)+1) + MIN_COORDS);
            float y = (float)(Math.random()*((MAX_COORDS - MIN_COORDS)+1) + MIN_COORDS);
            points[i] = new Point(x,y,f(x)<y ? 1 : -1);
        }
    }

    public static float f(float x){
        return (float)0.9*x + 6;
    }

    public Point[] getPoints() {
        return points;
    }

    public void setPoints(Point[] points) {
        this.points = points;
    }


}
