package com.designpatterns.patterns.factory.tasks;

import org.junit.Test;

import static org.junit.Assert.*;

public class TasksFactoryTest {

    private static final String SHOPPING_TASK = "Shopping Task";
    private static final String PAINTING_TASK = "Painting Task";
    private static final String DRIVING_TASK = "Driving Task";

    @Test
    public void testShoppingTask() {
        //Given
        TasksFactory factory = new TasksFactory();

        //When
        Task task = factory.createTask(SHOPPING_TASK);
        task.executeTask();

        //Then
        assertEquals("Do shopping", task.getTaskName());
        assertEquals(true, task.isTaskExecuted());
    }

    @Test
    public void testPaintingTask() {
        //Given
        TasksFactory factory = new TasksFactory();

        //When
        Task task = factory.createTask(PAINTING_TASK);
        task.executeTask();

        //Then
        assertEquals("Do painting", task.getTaskName());
        assertEquals(true, task.isTaskExecuted());
    }

    @Test
    public void testDrivingTask() {
        //Given
        TasksFactory factory = new TasksFactory();

        //When
        Task task = factory.createTask(DRIVING_TASK);
        task.executeTask();

        //Then
        assertEquals("Driving", task.getTaskName());
        assertEquals(true, task.isTaskExecuted());
    }
}