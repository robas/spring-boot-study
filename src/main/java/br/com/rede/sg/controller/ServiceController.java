package br.com.rede.sg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.rede.sg.resource.Service;
import br.com.rede.sg.service.ServiceService;

@RestController
public class ServiceController {
	@Autowired
	private ServiceService serviceService;

	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome =)";
	}
	
	@GetMapping("/services")
	public List<Service> getServices() {
		return serviceService.getServices();
	}
	
	@GetMapping("/services/{name}")
	public List<Service> getService(@PathVariable String name ) {
		return serviceService.getServicesByName(name);
	}
	
	@PostMapping("/services")
	public Service addService(@RequestBody Service service) {
		return serviceService.addService(service);
	}
	
}
