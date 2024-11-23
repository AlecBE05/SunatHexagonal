package com.register_sunat_hexagonal.domain.ports.in;

import com.register_sunat_hexagonal.domain.aggregates.dto.EmpresaDto;

public interface EmpresaServiceIn {

    EmpresaDto crearEmpresaIn(String ruc);
}
