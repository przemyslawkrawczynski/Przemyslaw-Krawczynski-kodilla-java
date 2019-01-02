package patterns.factory.tasks;

public class DrivingTask implements Task {

    private String taskName, where, using;
    private boolean executingTask = false;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public void executeTask() {
        System.out.println("Execute: [" + taskName + "] - Start driving to " + where + " using " + using);
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

}
