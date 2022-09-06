package task2.controller;

import task2.model.Point;
import task2.service.AreaService;
import task2.service.impl.AreaServiceImpl;

import java.util.Scanner;

public class InputController {
    private static final String INPUT_X_TEXT = "Input x";
    private static final String INPUT_Y_TEXT = "Input y";
    private static final String MESSAGE_IF_POINT_IN_RECT = "TRUE";
    private static final String MESSAGE_IF_POINT_ISNT_IN_RECT = "FALSE";

    private final AreaService areaService;

    public InputController() {
        this.areaService = new AreaServiceImpl();
    }

    public Point inputData() {
        int x = input(INPUT_X_TEXT);
        int y = input(INPUT_Y_TEXT);

        return new Point(x ,y);
    }

    private int input(String text) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(text);
        return scanner.nextInt();
    }

    public String getResult(Point point) {
        return areaService.isInArea(point) ? MESSAGE_IF_POINT_IN_RECT : MESSAGE_IF_POINT_ISNT_IN_RECT;
    }
}
