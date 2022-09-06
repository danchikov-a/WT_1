package task2.service.impl;

import task2.model.Point;
import task2.model.Rectangle;
import task2.service.AreaService;

public class AreaServiceImpl implements AreaService {
    private final Rectangle topRectangle;
    private final Rectangle downRectangle;

    public AreaServiceImpl() {
        this.topRectangle = new Rectangle(new Point(-4, 0), 5, 8);
        this.downRectangle = new Rectangle(new Point(-6, -3), 3, 12);
    }

    public boolean isInArea(Point point) {
        int x = point.getX();
        int y = point.getY();

        boolean isInTopRect = isInRectangle(topRectangle.getLeftDownPoint(), x, y);
        boolean isInDownRect = isInRectangle(downRectangle.getLeftDownPoint(), x, y);


        return isInTopRect || isInDownRect;
    }

    private boolean isInRectangle(Point point, int x, int y) {
        int x1 = point.getX();
        int y1 = point.getY();

        return x >= x1 && x <= x1 + topRectangle.getWidth()
                && y >= y1 && y <= y1 + topRectangle.getHeight();
    }
}
