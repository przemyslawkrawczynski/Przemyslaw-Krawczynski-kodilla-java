package patterns.factory.tasks;

public class DrivingTask implements Task {

    private String taskName, where, using;
    private String actualPosition;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public void executeTask() {
        System.out.println("Execute: [" + taskName + "] - Start driving to " + where + " using " + using);
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        boolean isTaskExecuted = actualPosition.equals(where);
        String result;
        if (isTaskExecuted) {
            result = "Task [" + taskName + "] is completed";
        } else {
            result = "Task [" + taskName + "] is still realizing";
        }
        System.out.println(result);
        return isTaskExecuted;
    }

    public void setActualPosition(String actualPosition) {
        System.out.println("Your actual position - [" + actualPosition + "]");
        this.actualPosition = actualPosition;
    }
}
