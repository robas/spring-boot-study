package br.com.rede.sg.resource;

public class Route {
	private String url;
	private String serviceName;

	public String getRoute() {
		return url;
	}

	public void setRoute(String url) {
		this.url = url;
	}

	public Route(String url, String serviceName) {
		super();
		this.url = url;
		this.serviceName = serviceName;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	
}
