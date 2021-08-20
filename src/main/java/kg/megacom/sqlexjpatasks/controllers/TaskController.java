package kg.megacom.sqlexjpatasks.controllers;

import kg.megacom.sqlexjpatasks.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/task")
public class TaskController {
    @Autowired
    private TaskService taskService;

    @GetMapping("/exec/{task_num}")
    public Object execute(@PathVariable String task_num) {
        return taskService.execute(task_num);
    }
}
