package com.userstable.controlador;

import java.io.IOException;
import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

public class UsersTable extends MVCPortlet {

	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {

		try {
			List<User> usersList = UserLocalServiceUtil.getUsers(0, UserLocalServiceUtil.getUsersCount());

			renderRequest.setAttribute("usuarios", usersList);

			include("/html/userstable/view.jsp", renderRequest, renderResponse);

		} catch (

		SystemException e)

		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
