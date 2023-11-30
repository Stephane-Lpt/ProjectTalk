package api.projecttalk.server;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Repository for the server, used to communicate with the database
 */
@Repository
public interface ServerRepository extends MongoRepository<Server, String> {
	/**
	 * Get a server corresponding to the given id
	 *
	 * @param id id of the server
	 * @return the server related to the id given
	 */
	Optional<Server> findById(String id);
}
