package com.javaTechie.mvcexceptionhandling.SpringMVCExceptionHandling.Exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderError {

    private int errorCode;
    private String errorMessage;



}
