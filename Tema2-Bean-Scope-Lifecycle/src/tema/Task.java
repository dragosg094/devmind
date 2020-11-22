package tema;

import java.util.Random;

public class Task {

    private String taskName;
    private Integer taskId = 0;
    private Integer executionTime;
    private Integer numberOfTasks = 0;


    private Random random = new Random();

    public void run() {
        try {
            Thread.sleep(executionTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private Integer generateId() {
        numberOfTasks++;
        taskId++;
        taskName = "Task" + taskId;
        executionTime = random.nextInt(19) + 1;
        System.out.println("The task ID is: "+taskId);
        return taskId;
    }

    private void performDestruction() {
        System.out.println(taskName);
        numberOfTasks--;
    }
}
