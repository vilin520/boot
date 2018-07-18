package com.moon.common.exception;

import javax.servlet.http.HttpServletRequest;

import com.moon.common.utils.JSONResult;

//@RestControllerAdvice
public class IMoocAjaxExceptionHandler {

//	@ExceptionHandler(value = Exception.class)
	public JSONResult defaultErrorHandler(HttpServletRequest req,
                                          Exception e) throws Exception {

		e.printStackTrace();
		return JSONResult.errorException(e.getMessage());
	}
}
