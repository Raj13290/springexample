/**
 * 
 */
package com.manish.spring.firstexample.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * @author rajesh
 *
 */
public class SummaryReportInterceptor extends HandlerInterceptorAdapter {

	/**
	 * 
	 */
	public SummaryReportInterceptor() {
		
	}
@Override
public boolean preHandle(HttpServletRequest request,
		HttpServletResponse response, Object handler) throws Exception {
	request.setAttribute("startTime-summary", System.currentTimeMillis());
	return true;
}

@Override
public void postHandle(HttpServletRequest request,
		HttpServletResponse response, Object handler,
		ModelAndView modelAndView) throws Exception {
	modelAndView.addObject("handlingTime-summary", System.currentTimeMillis()-(long)request.getAttribute("startTime-summary"));
}
}
