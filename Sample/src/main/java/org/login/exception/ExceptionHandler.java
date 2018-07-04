package org.login.exception;

import org.mule.api.MuleEvent;
import org.mule.api.exception.MessagingExceptionHandler;

public class ExceptionHandler implements MessagingExceptionHandler {

	@Override
	public MuleEvent handleException(Exception exception, MuleEvent event) {
		event.setFlowVariable("Exception", "Exception during login");
		return event;
	}

}
