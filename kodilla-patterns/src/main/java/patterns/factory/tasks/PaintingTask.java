package patterns.factory.tasks;

public class PaintingTask implements Task {

    private String taskName, color, whatToPaint, actualColor;
    boolean executingTask = false;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public void executeTask() {
        System.out.println("Execute: [" + taskName + "] - Start painting " + whatToPaint + " on " + color);
        this.executingTask = true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return executingTask;
    }

    public void checkActualColor(String color) {

        this.actualColor = color;
    }
}
