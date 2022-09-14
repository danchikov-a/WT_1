package task9.model;

import java.util.List;

public class Bucket {
    private final List<Ball> balls;

    public Bucket(List<Ball> balls) {
        this.balls = balls;
    }

    public List<Ball> getBalls() {
        return balls;
    }
}
