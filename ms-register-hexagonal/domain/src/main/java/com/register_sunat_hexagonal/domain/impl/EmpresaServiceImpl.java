package com.register_sunat_hexagonal.domain.impl;

import com.register_sunat_hexagonal.domain.aggregates.dto.EmpresaDto;
import com.register_sunat_hexagonal.domain.ports.in.EmpresaServiceIn;
import com.register_sunat_hexagonal.domain.ports.out.EmpresaServiceOut;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmpresaServiceImpl implements EmpresaServiceIn {

    private final EmpresaServiceOut empresaServiceOut;

    @Override
    public EmpresaDto crearEmpresaIn(String ruc) {
        return empresaServiceOut.crearEmpresaOut(ruc);
    }
}
