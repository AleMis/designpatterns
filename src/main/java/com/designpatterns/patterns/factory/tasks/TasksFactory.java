package com.designpatterns.patterns.factory.tasks;

public class TasksFactory {

    private static final String SHOPPING_TASK = "Shopping Task";
    private static final String PAINTING_TASK = "Painting Task";
    private static final String DRIVING_TASK = "Driving Task";

    public Task createTask(final String task) {
        switch(task) {
            case SHOPPING_TASK:
                return new ShoppingTask("Do shopping","Buy milk", 2);
            case PAINTING_TASK:
                return new PaintingTask("Do painting", "Blue", "Room");
            case DRIVING_TASK:
                return new DrivingTask("Driving", "To shop", "Car");
            default:
                return null;
        }
    }
}
