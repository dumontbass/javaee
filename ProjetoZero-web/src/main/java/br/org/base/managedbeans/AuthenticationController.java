/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.base.managedbeans;


import br.org.base.auth.AuthenticationBean;
import br.org.base.model.User;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

/**
 *
 * @author guilherme
 */
@SessionScoped
public class AuthenticationController {
    
    @Inject
    AuthenticationBean authenticationFacade;
    private boolean authenticated;
    private User user;

    public String login() {
        authenticationFacade.setUser(getUser());
        boolean authResult = authenticationFacade.login();

        if (authResult) {
            this.authenticated = true;

            setUser(authenticationFacade.getUser());

            return "SUCCESS_LOGIN";
        } else {
            this.authenticated = false;
            setUser(null);
            return "BAD_LOGIN";
        }

    }

    public boolean isAuthenticated() {
        return authenticated;
    }

    public void setAuthenticated(boolean authenticated) {
        this.authenticated = authenticated;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    
    
}
