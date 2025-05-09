package net.javaguides.ems.backend.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


//This has been created ,if user cannot find the Id in DB then exception we will be thrown
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException  extends RuntimeException{
    public  ResourceNotFoundException(String message){
        super((message));
    }
}
