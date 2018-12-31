package patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskTestSuite {

    @Test
    public void testShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task shoppingTask = taskFactory.createTask(TaskFactory.SHOPPING_TASK);
        shoppingTask.executeTask();
        ((ShoppingTask) shoppingTask).buy(4);
        boolean isExecuted = shoppingTask.isTaskExecuted();

        //Then
        Assert.assertEquals(false, isExecuted);
        System.out.println("");
    }


    @Test
    public void testDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task drivingTask = taskFactory.createTask(TaskFactory.DRIVING_TASK);
        drivingTask.executeTask();
        ((DrivingTask) drivingTask).setActualPosition("Poznań");
        boolean isExecuted = drivingTask.isTaskExecuted();

        // Then
        Assert.assertEquals(false, isExecuted);
        System.out.println("");
    }

    @Test
    public void testPaintingTask() {
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task paintingTask = taskFactory.createTask(TaskFactory.PAINTING_TASK);
        paintingTask.executeTask();
        ((PaintingTask) paintingTask).checkActualColor("Black");
        boolean isExecuted = paintingTask.isTaskExecuted();

        //Then
        Assert.assertEquals(true, isExecuted);
    }
}
