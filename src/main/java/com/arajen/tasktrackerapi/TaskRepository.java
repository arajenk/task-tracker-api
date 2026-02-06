package com.arajen.tasktrackerapi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {
    // That's it. No code needed inside!
    // You now have access to .save(), .findAll(), .deleteById() etc.
}
