package main.java.service;

public class TaskTimeInfo {
    private String taskId;
    private int earliestStart;
    private int earliestFinish;

    public TaskTimeInfo(String taskId, int earliestStart, int earliestFinish) {
        this.taskId = taskId;
        this.earliestStart = earliestStart;
        this.earliestFinish = earliestFinish;
    }

    public String getTaskId() {
        return taskId;
    }

    public int getEarliestStart() {
        return earliestStart;
    }

    public int getEarliestFinish() {
        return earliestFinish;
    }

    @Override
    public String toString() {
        return "TaskTimeInfo{" +
                "taskId='" + taskId + '\'' +
                ", ES=" + earliestStart +
                ", EF=" + earliestFinish +
                '}';
    }
}