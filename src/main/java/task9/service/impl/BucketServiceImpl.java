package task9.service.impl;

import task9.enums.Color;
import task9.model.Ball;
import task9.service.BucketService;

import java.util.List;

public class BucketServiceImpl implements BucketService {
    @Override
    public int calculateBallsWeight(List<Ball> balls) {
        return balls.stream()
                .mapToInt(Ball::getWeight)
                .sum();
    }

    @Override
    public int countBlueBallsAmount(List<Ball> balls) {
        return (int) balls.stream().filter(ball -> ball.getColor() == Color.BLUE).count();
    }
}
