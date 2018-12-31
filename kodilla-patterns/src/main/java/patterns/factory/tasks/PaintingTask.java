package patterns.factory.tasks;

public class PaintingTask implements Task {

    private String taskName, color, whatToPaint, actualColor;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public void executeTask() {
        System.out.println("Execute: [" + taskName + "] - Start painting " + whatToPaint + " on " + color);

    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        boolean isTaskExecuted = actualColor.equals(color);
        if(isTaskExecuted) {
            System.out.println("Task [" + taskName + "] is completed.");
        } else {
            System.out.println("Task [" + taskName + "] is still realizing - actual color of [" + whatToPaint + "] is " + actualColor + ".");
        }
        return isTaskExecuted;
    }

    public void checkActualColor(String color) {

        this.actualColor = color;
    }
}
