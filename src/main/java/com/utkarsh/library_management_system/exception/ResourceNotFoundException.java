package com.utkarsh.library_management_system.exception;

public class ResourceNotFoundException extends RuntimeException {
  public ResourceNotFoundException(String entity, Long id) {

    super(entity + " not found with id "+id);
  }
  public ResourceNotFoundException(String message) {
    super(message);
  }
}
