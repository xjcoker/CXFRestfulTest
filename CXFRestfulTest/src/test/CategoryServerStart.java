package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;

public class CategoryServerStart {
	public static void main(String[] args) {
		CategoryService categoryService = new CategoryService();
		JAXRSServerFactoryBean restServer = new JAXRSServerFactoryBean();
		restServer.setAddress("http://localhost:9000");
		restServer.setServiceBean(categoryService);
		restServer.setResourceClasses(Category.class);
		restServer.create();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			br.readLine();
		} catch (IOException e) {

		}
		System.out.println("Server Stopped");
		System.exit(0);

	}
}
