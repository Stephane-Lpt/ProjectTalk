package api.projecttalk.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

/**
 * This class control requests related to the server
 * to access those resquests use /server then the request
 */
@RestController
public class ServerController {
	/**
	 * service of the server, automatically instanciated by Spring
	 */
	@Autowired
	private ServerService serverService;

	/**
	 * Request for a list of server instance by giving id as get parameter
	 * Multiple id parameters can be given separately
	 *
	 * @param ids must be given one by one as get parameter (ex: /server?id=1&id=2)
	 * @return ResponseEntity with the list of servers and the status OK
	 * @throws ResponseStatusException BAD_REQUEST if no id is provided
	 * @throws ResponseStatusException NOT_FOUND if no server is found with the given ids
	 */
	@GetMapping("/server")
	public ResponseEntity<List<Server>> getServersByIds(@RequestParam("id") List<String> ids) {
		//  at least one id is provided
		if (ids.isEmpty())
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "No id provided");

		ArrayList<Server> servers = new ArrayList<>();
		for (String id : ids)
			this.serverService.getServerById(id).ifPresent(servers::add);

		if (servers.isEmpty())
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No server found with the given ids");

		return new ResponseEntity<>(servers, HttpStatus.OK);
	}
}
