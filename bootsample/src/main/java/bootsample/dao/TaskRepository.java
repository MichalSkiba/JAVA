package bootsample.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import bootsample.model.Task;

public interface TaskRepository extends JpaRepository<Task, Integer>{

}
