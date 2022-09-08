package task3.service.impl;

import task3.model.InputData;
import task3.service.InputService;

import java.util.LinkedHashMap;
import java.util.Map;

public class InputServiceImpl implements InputService {
    public Map<Integer, Double> calculate(InputData inputData) {
        int a = inputData.getA();
        int b = inputData.getB();
        int h = inputData.getH();

        Map<Integer, Double> resultMap = new LinkedHashMap<>();

        resultMap.put(a, Math.tan(a));

        if ((a < b && h > 0) || (a > b && h < 0)) {
            if(h > 0) {
                for (int i = a + h; i < b; i += h) {
                    resultMap.put(i, Math.tan(i));
                }
            } else {
                for (int i = a + h; i > b; i += h) {
                    resultMap.put(i, Math.tan(i));
                }
            }
        }

        resultMap.put(b, Math.tan(b));

        return resultMap;
    }
}
