package com.aexp.exercises.udacity.graphqlapidemo;

import graphql.ErrorType;
import graphql.GraphQLError;
import graphql.language.SourceLocation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CityNotFoundException extends RuntimeException implements GraphQLError {

    private Map<String, Object> extensions = new HashMap<>();

    public CityNotFoundException(String message, String invalidCity) {
        super(message);
        extensions.put("invalidCity", invalidCity);
    }

    @Override
    public List<SourceLocation> getLocations() {return null; }

    @Override
    public Map<String, Object> getExtensions() {
        return extensions;
    }

    @Override
    public ErrorType getErrorType() {
        return ErrorType.DataFetchingException;
    }
}
