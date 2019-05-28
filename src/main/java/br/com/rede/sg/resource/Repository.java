package br.com.rede.sg.resource;

import java.util.List;

public class Repository {
	private long id;
	private String serviceName;
	private String url;
	private String desc;
	private List<Route> deps;
	

	public Repository(long id, String name, String repo, String desc, List<Route> deps) {
		super();
		this.id = id;
		this.serviceName = name;
		this.url = repo;
		this.desc = desc;
		this.deps = deps;
	}

	public List<Route> getDeps() {
		return deps;
	}

	public void setDeps(List<Route> deps) {
		this.deps = deps;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return serviceName;
	}

	public void setName(String name) {
		this.serviceName = name;
	}

	public String getRepo() {
		return url;
	}

	public void setRepo(String repo) {
		this.url = repo;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
