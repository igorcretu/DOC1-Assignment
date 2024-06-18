package via.doc1.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import via.doc1.backend.model.TeamMember;
import via.doc1.backend.services.TeamService;
import via.doc1.backend.model.Task;

@RestController
public class TeamController {
    private TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @GetMapping("/members/{memberId}/tasks/{taskId}")
    public Task getTaskDetails(@PathVariable String memberId,
                               @PathVariable String taskId) {
        return teamService.getTask(memberId, taskId);
    }

    @GetMapping("/members/{memberId}")
    public TeamMember getMemberDetails(@PathVariable String memberId) {
        return teamService.getTeamMember2(memberId);
    }
}

