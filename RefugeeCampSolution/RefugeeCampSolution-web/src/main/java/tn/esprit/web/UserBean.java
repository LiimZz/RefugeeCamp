package tn.esprit.web;

import java.io.IOException;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.Cookie;
import javax.ws.rs.Path;

import tn.esprit.persistence.User;
import tn.esprit.service.interfaces.IRemoteUser;

@ManagedBean(name="userBean")
@SessionScoped
@Path("/user")
public class UserBean {
	@EJB
	private IRemoteUser remoteUser;
	private User user;

	@PostConstruct
	public void init() throws IOException{
		user = new User();
		getCnctdUser();
	}

	public User getCnctdUser() throws IOException {
		user = new User();
		ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();

		Map<String, Object> cookies = FacesContext.getCurrentInstance().getExternalContext().getRequestCookieMap();
		Cookie cookie = (Cookie) cookies.get("token");
		if (cookie.getValue().equals("")) {
			externalContext.redirect("http://localhost:44318/Account/Login");
		}
		user = remoteUser.checkLogin(cookie.getValue());
		return user;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
