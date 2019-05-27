package br.com.rede.sg.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ServiceService {
	private static int serviceCount = 0;
	private static List<br.com.rede.sg.resource.Service> services = new ArrayList<br.com.rede.sg.resource.Service>();

	static {
		services.add(
				new br.com.rede.sg.resource.Service(++serviceCount, "service-A", "repoA", "descrição do service A"));
		services.add(
				new br.com.rede.sg.resource.Service(++serviceCount, "service-B", "repoB", "descrição do service B"));
		services.add(
				new br.com.rede.sg.resource.Service(++serviceCount, "service-C", "repoC", "descrição do service C"));
	}

	public List<br.com.rede.sg.resource.Service> getServices() {
		return services;
	}

	public List<br.com.rede.sg.resource.Service> getServicesByName(String name) {
		List<br.com.rede.sg.resource.Service> returnedServices = new ArrayList<br.com.rede.sg.resource.Service>();

		for (br.com.rede.sg.resource.Service service : services) {
			if (service.getName() != null && service.getName().equals(name)) {
				returnedServices.add(service);
			}
		}
		return returnedServices;
	}

	public br.com.rede.sg.resource.Service addService(br.com.rede.sg.resource.Service service) {
		br.com.rede.sg.resource.Service createdService = new br.com.rede.sg.resource.Service(++serviceCount,
				service.getName(), service.getRepo(), service.getDesc());
		services.add(createdService);
		return createdService;
	}
}
