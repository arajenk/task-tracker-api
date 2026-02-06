package com.arajen.tasktrackerapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController // This makes it a web controller (your new "Scanner")
@RequestMapping("/api/tasks") // All URLs start with http://localhost:8080/api/tasks
public class TaskController {

    @Autowired // Spring automatically connects the Repository to this Controller
    private TaskRepository taskRepository;

    // Replaces your choice == 1 (Enter new task)
    @PostMapping
    public Task addTask(@RequestBody Task task) {
        // Your logic for saving the task using the new Repository
        return taskRepository.save(task);
    }

    // Replaces your choice == 6 (List all tasks)
    @GetMapping
    public List<Task> getAllTasks() {
        // Your logic for getting all tasks from the database
        return taskRepository.findAll();
    }

    // Replaces your choice == 3 (Delete a task)
    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Integer id) {
        // Your logic for deleting a task by its ID
        taskRepository.deleteById(id);
    }
    // Replaces your choice == 2 (Update description) and choice == 4/5 (Update status)
    @PutMapping("/{id}")
    public Task updateTask(@PathVariable Integer id, @RequestBody Task updatedTaskDetails) {
        // Find the existing task by ID (your old loop logic)
        Task existingTask = taskRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Task not found for this id :: " + id));

        // Update the fields with the new details
        existingTask.setDescription(updatedTaskDetails.getDescription());
        existingTask.setStatus(updatedTaskDetails.getStatus());

        // Save the updated task back to the database
        return taskRepository.save(existingTask);
    }

}
