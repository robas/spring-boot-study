package br.com.rede.sg.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.rede.sg.resource.Route;
import br.com.rede.sg.resource.Repository;


@Service
public class RepositoryService {
	private static int repositoryCount = 0;
	private static List<Repository> repositories = new ArrayList<Repository>();

	static {
		List<Route> dep1 = new ArrayList<Route>();
		List<Route> dep2 = new ArrayList<Route>();
		List<Route> dep3 = new ArrayList<Route>();
		dep1.add(new Route("rota 1", "service 1"));
		dep1.add(new Route("rota 2", "service 1"));
		repositories.add(
				new Repository(++repositoryCount, "service-A", "repoA", "descrição do service A", dep1));
		dep2.add(new Route("rota 2", "service 1"));
		dep2.add(new Route("rota 3", "service 2"));
		repositories.add(
				new Repository(++repositoryCount, "service-B", "repoB", "descrição do service B", dep2));
		dep3.add(new Route("rota 3", "service 2"));
		dep3.add(new Route("rota 4", "service 2"));
		repositories.add(
				new Repository(++repositoryCount, "service-C", "repoC", "descrição do service C", dep3));
	}

	public List<Repository> getRepositories() {
		return repositories;
	}

	public List<Repository> getRepositoriesByName(String name) {
		List<Repository> returnedRepositories = new ArrayList<Repository>();

		for (Repository repository : repositories) {
			if (repository.getName() != null && repository.getName().equals(name)) {
				returnedRepositories.add(repository);
			}
		}
		return returnedRepositories;
	}

	public Repository addRepository(Repository repository) {
		Repository createdRepository = new Repository(++repositoryCount,
				repository.getName(), repository.getRepo(), repository.getDesc(), repository.getDeps());
		repositories.add(createdRepository);
		return createdRepository;
	}
}
