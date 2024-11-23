package com.register_sunat_hexagonal.application.controller;


import com.register_sunat_hexagonal.domain.aggregates.dto.EmpresaDto;
import com.register_sunat_hexagonal.domain.ports.in.EmpresaServiceIn;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api/empresa")
@RequiredArgsConstructor
public class EmpresaController {

    private final EmpresaServiceIn empresaServiceIn;

    @PostMapping("/{ruc}")
    public ResponseEntity<EmpresaDto> crearEmpresa(
            @PathVariable("ruc") String ruc
    ){
        return ResponseEntity.ok(empresaServiceIn.crearEmpresaIn(ruc));
    }
}
