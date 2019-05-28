package br.com.rede.sg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.rede.sg.resource.Repository;
import br.com.rede.sg.service.RepositoryService;

@RestController
public class RepositoryController {
	@Autowired
	private RepositoryService repositoryService;

	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome =)";
	}
	
	@GetMapping("/services")
	public List<Repository> getServices() {
		return repositoryService.getRepositories();
	}
	
	@GetMapping("/services/{name}")
	public List<Repository> getService(@PathVariable String name ) {
		return repositoryService.getRepositoriesByName(name);
	}
	
	@PostMapping("/services")
	public Repository addService(@RequestBody Repository service) {
		return repositoryService.addRepository(service);
	}
	
}
