package patterns.factory.tasks;

public final class TaskFactory {
    public final static String SHOPPING_TASK = "ST";
    public final static String DRIVING_TASK = "DT";
    public final static String PAINTING_TASK = "PT";

    public final Task createTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING_TASK:
                return new ShoppingTask("Buying Socks", "Socks", 5);
            case DRIVING_TASK:
                return new DrivingTask("Drive to Warsaw", "Warsaw", "Car");
            case PAINTING_TASK:
                return new PaintingTask("Paint fence","Black", "Fence" );
            default:
                return null;
        }
    }
}
