package com.nautilus.station.interceptor;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class SessionInterceptor extends HandlerInterceptorAdapter{

	private static final Logger logger = LoggerFactory.getLogger(SessionInterceptor.class);
	
	@Override
	public boolean preHandle( HttpServletRequest request
							, HttpServletResponse response
							, Object handler) throws Exception {
		
		long time = System.currentTimeMillis(); 
		SimpleDateFormat dayTime = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		String now = dayTime.format(new Date(time));
		
		logger.info( "☏SessionInterceptor time : " + now
				    +"☏getRequestURI : " + request.getRequestURI()
				);
		
		
		
		
		return super.preHandle(request, response, handler);
	}
}
