package br.com.rede.sg.resource;

public class Service {
	private long id;
	private String name;
	private String repo;
	private String desc;

	public Service(long id, String name, String repo, String desc) {
		super();
		this.id = id;
		this.name = name;
		this.repo = repo;
		this.desc = desc;
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
