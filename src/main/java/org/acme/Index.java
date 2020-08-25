package org.acme;

import java.io.Serializable;

import javax.enterprise.inject.Model;

@Model
public class Index implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String input1 = null;
	private String output = null;
	private String password = null;
	public Object clicked() {
		
		System.out.println("pasword is " + password);
		/*FacesContext context = FacesContext.getCurrentInstance();
		String evaluateExpressionGet = context.getApplication().evaluateExpressionGet(context, "#{appl['blah']}", String.class);
		System.out.println(">>> " + evaluateExpressionGet);
		*/
		output = "Hello " + input1 + " @" + System.currentTimeMillis();
		return null;
	}
	
	public void setInput(String input) {
		System.out.println("SET TO : " + input);
		this.input1 = input;
	}

	public String getInput() {
		return input1;
	}

	public String getOutput() {
		return this.output;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}