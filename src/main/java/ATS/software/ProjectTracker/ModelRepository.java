package ATS.software.ProjectTracker;

import org.springframework.data.repository.CrudRepository;
import ATS.software.ProjectTracker.User;;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface ModelRepository extends CrudRepository<Model, Integer> {

}