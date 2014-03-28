package com.polo.strut;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class UserForm extends ActionForm {

	private String userName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		
		ActionErrors errors = new ActionErrors();
		if (getUserName() == null || "".equals(getUserName())) {
			errors.add("common.name.err", new ActionMessage(
					"error.common.name.required"));
			
		}
		
		return errors;
	}

	@Override
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		setUserName("");
	}
	
}
