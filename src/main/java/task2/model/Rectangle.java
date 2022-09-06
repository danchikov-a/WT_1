package task2.model;

public class Rectangle {
    private final Point leftDownPoint;
    private final int height;
    private final int width;

    public Rectangle(Point leftDownPoint, int height, int width) {
        this.leftDownPoint = leftDownPoint;
        this.height = height;
        this.width = width;
    }

    public Point getLeftDownPoint() {
        return leftDownPoint;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
