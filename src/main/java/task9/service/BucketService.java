package task9.service;

import task9.model.Ball;

import java.util.List;

public interface BucketService {
    int calculateBallsWeight(List<Ball> balls);
    int countBlueBallsAmount(List<Ball> balls);
}
