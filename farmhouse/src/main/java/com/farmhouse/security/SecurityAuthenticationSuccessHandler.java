package com.farmhouse.security;

import java.io.IOException;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

public class SecurityAuthenticationSuccessHandler implements
		AuthenticationSuccessHandler {


	public SecurityAuthenticationSuccessHandler() {
		System.out.println("Security Authentication Success Handler!");
	}

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request,
			HttpServletResponse response, Authentication authentication)
			throws IOException, ServletException {
		
		  

		Set<String> roles = AuthorityUtils.authorityListToSet(authentication
				.getAuthorities());

		System.out.println("#ROLES : " + roles.size());

		if (roles.contains("ROLE_ADMIN")) {
			
			System.out.println("ROLE: USER FOUND, REDIRECTING.....");
			response.sendRedirect("student/studentview/");
			
		}
		
        
	}
}