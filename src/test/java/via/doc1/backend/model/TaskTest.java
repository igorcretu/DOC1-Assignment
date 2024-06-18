package via.doc1.backend.model;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TaskTest {
    private Task testTask;

    @BeforeEach
    public void setUp() {
        String taskId = "Task1";
        String taskName = "Tough task";
        String taskDesc = "Cleanup the mess";
        testTask = new Task(taskId, taskName, taskDesc);
    }

    @Test
    public void getTest_sameTask_true()
    {
        assertTrue(testTask.getId().equals("Task1"));
        assertTrue(testTask.getName().equals("Tough task"));
        assertTrue(testTask.getDescription().equals("Cleanup the mess"));
    }

    @Test
    public void setterTest() {
        String newTaskId = "Task2";
        String newTaskName = "Easy task";
        String newTaskDesc = "Do nothing";
        testTask.setId(newTaskId);
        testTask.setName(newTaskName);
        testTask.setDescription(newTaskDesc);
        assertTrue(testTask.getId().equals(newTaskId));
        assertTrue(testTask.getName().equals(newTaskName));
        assertTrue(testTask.getDescription().equals(newTaskDesc));
    }

    @Test
    public void equalsTest_sameObjects_expectedTrue() {
        assertTrue(testTask.equals(testTask));
    }

    @Test
    public void equalsTest_sameTasks_expectedTrue() {
        Task testTask1 = new Task(testTask.getId(), testTask.getName(), testTask.getDescription());
        assertTrue(testTask.equals(testTask1));
    }

    @Test
    public void equalsTest_differentTasks_expectedFalse() {
        String taskId2 = "Task2";
        String taskName2 = "Easy task";
        String taskDesc2 = "Do nothing";
        Task testTask2 = new Task(taskId2, taskName2, taskDesc2);
        assertTrue(!testTask.equals(testTask2));
    }

    @Test
    public void equalsTest_null_expectedFalse() {
        assertTrue(!testTask.equals(null));
    }
}
