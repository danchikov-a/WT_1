package task9;

import task9.enums.Color;
import task9.model.Ball;
import task9.model.Bucket;
import task9.service.BucketService;
import task9.service.impl.BucketServiceImpl;

import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Ball> balls = List.of(
                new Ball(15, Color.BLUE),
                new Ball(25, Color.BLUE),
                new Ball(35, Color.GREEN)
        );
        Bucket bucket = new Bucket(balls);
        BucketService bucketService = new BucketServiceImpl();


        System.out.printf("Weight: %d. Blue balls amount: %d.",
                bucketService.calculateBallsWeight(bucket.getBalls()),
                bucketService.countBlueBallsAmount(bucket.getBalls()));
    }
}
