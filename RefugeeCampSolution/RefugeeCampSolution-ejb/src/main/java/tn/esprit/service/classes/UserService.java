package tn.esprit.service.classes;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;

import tn.esprit.persistence.User;
import tn.esprit.service.interfaces.IRemoteUser;

@Stateless
public class UserService implements IRemoteUser {

	@PersistenceContext
	EntityManager em;
	static javax.ws.rs.client.Client c = ClientBuilder.newClient();
	// set the appropriate URL
	static String getUrl = "http://localhost:44318/api/AccountApi/";

	@Override
	public User checkLogin(String token) {
		User cl = c.target(getUrl).request().header("Jtoken", token).accept(MediaType.APPLICATION_JSON).get(User.class);
		return cl;
	}

}
