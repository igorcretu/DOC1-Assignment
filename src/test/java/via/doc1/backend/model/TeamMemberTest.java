package via.doc1.backend.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TeamMemberTest {
    private TeamMember testTeamMember;

    @BeforeEach
    public void setUp() {
        String memberId = "Member1";
        String memberName = "Johnny";
        String memberEmail = "johnny@gmail.com";
        Task task1 = new Task("Task1", "Task1 Description", "Task1 Status");
        Task task2 = new Task("Task2", "Task2 Description", "Task2 Status");
        List<Task> tasks = List.of(task1, task2);
        testTeamMember = new TeamMember(memberId, memberName, memberEmail, tasks);
    }

    @Test
    public void getTeamMember_Test() {
        assertEquals("Member1", testTeamMember.getId());
        assertEquals("Johnny", testTeamMember.getName());
        assertEquals("johnny@gmail.com", testTeamMember.getEmail());
    }

    @Test
    public void setTestTeamMember_Test() {
        String id = "Member2";
        String name = "Jane";
        String email = "jane@gmail.com";
        testTeamMember.setId(id);
        testTeamMember.setName(name);
        testTeamMember.setEmail(email);
        assertEquals(id, testTeamMember.getId());
        assertEquals(name, testTeamMember.getName());
        assertEquals(email, testTeamMember.getEmail());
    }

    @Test
    public void setTasks_getTasks_Test() {
        Task task3 = new Task("Task3", "Task3 Description", "Task3 Status");
        Task task4 = new Task("Task4", "Task4 Description", "Task4 Status");
        List<Task> tasks = List.of(task3, task4);
        testTeamMember.setTasks(tasks);
        assertEquals(tasks, testTeamMember.getTasks());
    }
}
