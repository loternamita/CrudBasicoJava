package com.pruebaNexus.elkin.nexusP.repository;

import com.pruebaNexus.elkin.nexusP.dto.PositionDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PositionRepository extends JpaRepository<PositionDTO, Long>{
    
}
