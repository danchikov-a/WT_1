package task3.service;

import task3.model.InputData;

import java.util.Map;

public interface InputService {
    Map<Integer, Double> calculate(InputData inputData);
}
