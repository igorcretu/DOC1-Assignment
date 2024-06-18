package via.doc1.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import via.doc1.backend.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, String> {
}
