package com.pruebaNexus.elkin.nexusP.service;

import com.pruebaNexus.elkin.nexusP.dto.PositionDTO;
import java.util.List;

public interface PositionService {

    PositionDTO findOne(Long id);

    PositionDTO crear(PositionDTO position);

    List<PositionDTO> findAll();

    PositionDTO eliminar(Long id);

    PositionDTO editar(PositionDTO position, Long id);
}
