package com.example.demo.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

public class ResponseHandler {
    public static ResponseEntity<Object> genereteResponse(String OUT_STAT, String OUT_MESS, Object OUT_DATA, HttpStatus status){
        Map<String, Object> res = new HashMap<String, Object>();
        res.put("OUT_STAT", OUT_STAT);
        res.put("OUT_MESS", OUT_MESS);
        res.put("OUT_DATA", OUT_DATA);
        return new ResponseEntity<Object>(res, status);
    }
}
