package br.com.rede.sg.resource;

import java.util.List;

public class Service {
	private long id;
	private String name;
	private String repo;
	private String desc;
	private List<String> deps;
	

	public Service(long id, String name, String repo, String desc, List<String> deps) {
		super();
		this.id = id;
		this.name = name;
		this.repo = repo;
		this.desc = desc;
		this.deps = deps;
	}

	public List<String> getDeps() {
		return deps;
	}

	public void setDeps(List<String> deps) {
		this.deps = deps;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRepo() {
		return repo;
	}

	public void setRepo(String repo) {
		this.repo = repo;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
