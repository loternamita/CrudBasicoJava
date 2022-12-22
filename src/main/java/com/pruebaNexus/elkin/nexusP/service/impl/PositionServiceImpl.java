package com.pruebaNexus.elkin.nexusP.service.impl;

import com.pruebaNexus.elkin.nexusP.repository.PositionRepository;
import com.pruebaNexus.elkin.nexusP.service.PositionService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.pruebaNexus.elkin.nexusP.dto.PositionDTO;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
@Service
@RequiredArgsConstructor
public class PositionServiceImpl implements PositionService {

    @Autowired
    private final PositionRepository positionRepository = null;

    @Override
    @Transactional(readOnly = true)
    public PositionDTO findOne(Long id) {
        log.debug("Request to get Position : {}", id);
        return positionRepository.findById(id).get();

    }

    @Override
    public PositionDTO crear(PositionDTO position) {

        return positionRepository.save(position);
    }

    @Override
    @Transactional(readOnly = true)
    public List<PositionDTO> findAll() {
        return positionRepository.findAll();
    }

    @Override
    public PositionDTO eliminar(Long id) {
        PositionDTO position = null;
        try {
            position = new PositionDTO();
            position.setId(id);
            positionRepository.deleteById(id);
        } catch (Exception e) {
            System.out.println("****** Ocurrio un error al eliminar a empleado con id: " + id + " error: " + e.getMessage());
        }

        return position;
    }

    @Override
    public PositionDTO editar(PositionDTO position, Long id) {
//        PositionDTO findById = new PositionDTO();
//        findById = positionRepository.findById(id).get();
        return positionRepository.save(position);
    }

}
