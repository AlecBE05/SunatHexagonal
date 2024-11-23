package com.register_sunat_hexagonal.infraestructure.rest;

import com.register_sunat_hexagonal.domain.aggregates.response.ResponseSunat;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "client-sunat", url = "https://api.apis.net.pe/v2/sunat/ruc/")
public interface SunatClient {

    @GetMapping("/full")
    ResponseSunat getEmpresaSunat(@RequestParam("numero") String numero,
                                  @RequestHeader("Authorization") String Authorization);
}
