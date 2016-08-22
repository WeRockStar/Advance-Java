package interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TaskSorter {
    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task(1, "Run away killer rabbit", 4));
        tasks.add(new Task(2, "Keep pokemon at Siam paragon", 1));
        tasks.add(new Task(3, "Evolve pokemon", 3));

        // for (Task t : tasks) System.out.println(t);
        tasks.forEach(System.out::println);
        Collections.sort(tasks);
        System.out.println("===========================");
        tasks.forEach(System.out::println);
    }
}
