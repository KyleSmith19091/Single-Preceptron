package Model;

public class Point {

    private float x;
    private float y;
    private int label;
    private String guessValue;

    public Point(float x, float y, int label) {
        this.x = x;
        this.y = y;
        this.label = label;
    }

    public float getX() { return x; }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getLabel() {
        return label;
    }

    public void setLabel(int label) {
        this.label = label;
    }

    public String getGuessValue() {
        return guessValue;
    }

    public void setGuessValue(String guessValue) {
        this.guessValue = guessValue;
    }
}
