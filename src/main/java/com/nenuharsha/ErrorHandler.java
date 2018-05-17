package com.nenuharsha;

import com.nenuharsha.resources.ClientResource;
import com.nenuharsha.views.InvalidCode;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

public class ErrorHandler extends Exception implements ExceptionMapper<ErrorHandler> {

    @Override
    public Response toResponse(ErrorHandler errorHandler) {
        InvalidCode invalidCode = new InvalidCode();
        return Response.noContent().build();
    }
}
