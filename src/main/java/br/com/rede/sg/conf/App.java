package br.com.rede.sg.conf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"br.com.rede.sg.controller", "br.com.rede.sg.service"} )
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}
