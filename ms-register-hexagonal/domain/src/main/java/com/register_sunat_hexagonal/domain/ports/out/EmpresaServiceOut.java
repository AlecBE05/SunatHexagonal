package com.register_sunat_hexagonal.domain.ports.out;

import com.register_sunat_hexagonal.domain.aggregates.dto.EmpresaDto;

public interface EmpresaServiceOut {

    EmpresaDto crearEmpresaOut(String ruc);
}
