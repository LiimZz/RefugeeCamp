package tn.esprit.web;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/refugee")
public class RestActivator extends Application {
	private Set<Class<?>> resources = new HashSet<Class<?>>();

	@Override
	public Set<Class<?>> getClasses() {
		return resources;
	}
}
