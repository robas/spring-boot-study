package br.com.rede.sg.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ServiceService {
	private static int serviceCount = 0;
	private static List<br.com.rede.sg.resource.Service> services = new ArrayList<br.com.rede.sg.resource.Service>();

	static {
		List<String> dep1 = new ArrayList<String>();
		List<String> dep2 = new ArrayList<String>();
		List<String> dep3 = new ArrayList<String>();
		dep1.add("rota 1");
		dep1.add("rota 2");
		services.add(
				new br.com.rede.sg.resource.Service(++serviceCount, "service-A", "repoA", "descrição do service A", dep1));
		dep2.add("rota 2");
		dep2.add("rota 3");
		services.add(
				new br.com.rede.sg.resource.Service(++serviceCount, "service-B", "repoB", "descrição do service B", dep2));
		dep3.add("rota 3");
		dep3.add("rota 4");
		services.add(
				new br.com.rede.sg.resource.Service(++serviceCount, "service-C", "repoC", "descrição do service C", dep3));
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
				service.getName(), service.getRepo(), service.getDesc(), service.getDeps());
		services.add(createdService);
		return createdService;
	}
}
