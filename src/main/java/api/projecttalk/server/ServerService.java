package api.projecttalk.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Service for the server, used to manage the server's data before sending it to the database
 */
@Service
public class ServerService {
	@Autowired
	private ServerRepository serverRepository;

	public Optional<Server> getServerById(String id) {
		return this.serverRepository.findById(id);
	}
}
