import java.util.*;

import main.java.graph.ProjectGraph;
import main.java.model.Task;

public class Main {
    public static void main(String[] args) {
        ProjectGraph graph = new ProjectGraph();

        graph.addTask("A", "要件定義", 3);
        graph.addTask("B", "画面設計", 5);
        graph.addTask("C", "DB設計", 4);
        graph.addTask("D", "実装", 6);

        graph.addDependency("A", "B");
        graph.addDependency("A", "C");
        graph.addDependency("B", "D");
        graph.addDependency("C", "D");

        for (Task task : graph.getAllTasks()) {
            System.out.println(task);
            System.out.println("  先行タスク: " + task.getPredecessors());
            System.out.println("  後続タスク: " + task.getSuccessors());
        }
    }
}
