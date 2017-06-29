package Entity;

/**
 * Created by Olivier on 29/06/2017.
 */
public class Map {
    private int minX;
    private int maxX;
    private int minY;
    private int maxY;

    public Map() {
        minX = 0;
        maxX = 19;
        minX = 0;
        maxY = 19;
    }

    public int getMinX() {
        return minX;
    }

    public void setMinX(int minX) {
        this.minX = minX;
    }

    public int getMaxX() {
        return maxX;
    }

    public void setMaxX(int maxX) {
        this.maxX = maxX;
    }

    public int getMinY() {
        return minY;
    }

    public void setMinY(int minY) {
        this.minY = minY;
    }

    public int getMaxY() {
        return maxY;
    }

    public void setMaxY(int maxY) {
        this.maxY = maxY;
    }
}
