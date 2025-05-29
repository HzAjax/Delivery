package com.example.demo.configuration;

import com.example.demo.soap.CargoSoapServiceImpl;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import jakarta.xml.ws.Endpoint;

@Configuration
public class CxfConfig {

    @Bean
    public Endpoint endpoint(Bus bus, CargoSoapServiceImpl cargoSoapServiceImpl) {
        EndpointImpl endpoint = new EndpointImpl(bus, cargoSoapServiceImpl);
        endpoint.publish("/cargo"); // Доступен по /services/cargo
        return endpoint;
    }
}
