package patterns.factory.tasks;

public final class ShoppingTask implements Task{

    private String taskName, whatToBuy;
    private double quantity, actualAmount;
    private boolean executingTask = false;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    public String getWhatToBuy() {
        return whatToBuy;
    }

    public double getQuantity() {
        return quantity;
    }

    @Override
    public void executeTask() {
        this.executingTask = true;

    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if (quantity <= actualAmount) {
            executingTask = false;
            System.out.println("Task [" + taskName + "] All " + whatToBuy + " were bought - Task realized");
        } else {
            double rest = quantity - actualAmount;
            System.out.println("Task [" + taskName + "] is still realizing. Left [" + rest +"] " + whatToBuy + " to buy.");

        }
        return executingTask;
    }

    public void buy(double amount) {
        System.out.println(amount + " " + whatToBuy + " were bought.");
        this.actualAmount = amount;
    }
}
