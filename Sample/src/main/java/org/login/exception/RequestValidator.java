package org.login.exception;

import org.mule.api.MuleEvent;
import org.mule.extension.validation.api.ValidationResult;
import org.mule.extension.validation.api.Validator;
import org.mule.extension.validation.internal.ImmutableValidationResult;

public class RequestValidator implements Validator {

	@Override
	public ValidationResult validate(MuleEvent event) {
		try {
			String payload = event.getMessage().getPayloadAsString();
			System.out.println("payload::::" + payload);
			if (null == payload || payload.indexOf("error") >= 0)
				return ImmutableValidationResult.error("Invalid request...");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ImmutableValidationResult.ok();
	}

}
