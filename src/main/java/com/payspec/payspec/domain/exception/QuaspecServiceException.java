package com.payspec.payspec.domain.exception;

public class QuaspecServiceException extends RuntimeException {

	private final QuaspecError error;

	public QuaspecServiceException(QuaspecError quaspecError) {
		this.error = quaspecError;
	}

	public QuaspecError getError() {
        return error;
    }

}
