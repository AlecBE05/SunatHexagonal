package com.register_sunat_hexagonal.infraestructure.dao;

import com.register_sunat_hexagonal.infraestructure.entity.EmpresaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaReposirtory extends JpaRepository<EmpresaEntity,Long> {
}
