/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean(name="login", eager = true)
@SessionScoped
public class login implements Serializable {
	private String username, password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
	
	
	
	
	public String Login() {
		String username = this.username;
		String password = this.password;
		{
			this.username = username;
			this.password = password;
			if(username.equals("admin")&&password.equals("admin")) {
				return"loginsucces";
			}else {
				return"loginfailed";
			}
		}
		
	}
	
	
	

}
