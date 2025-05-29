package com.example.demo.soap;

import com.example.demo.entity.Branch;
import com.example.demo.entity.Cargo;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.time.LocalDateTime;

@WebService(targetNamespace = "http://soap.demo.example.com/")
public interface CargoSoapService {

    @WebMethod
    Cargo createCargo(@WebParam(name = "barcode") String barcode,
                      @WebParam(name = "name") String name,
                      @WebParam(name = "status") String status,
                      @WebParam(name = "branch_from") Branch branchFrom,
                      @WebParam(name = "branch_to") Branch branchTo);

}

