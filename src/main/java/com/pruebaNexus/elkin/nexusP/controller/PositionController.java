package com.pruebaNexus.elkin.nexusP.controller;

import com.pruebaNexus.elkin.nexusP.dto.PositionDTO;
import com.pruebaNexus.elkin.nexusP.service.PositionService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/position")
public class PositionController {
    
    @Autowired
    private final PositionService positionService = null;
    
    @GetMapping(value = "/{id}")
    public PositionDTO searchPositionId(@PathVariable("id") Long id) {
        log.info("REST request to get Position : {}", id);
        return positionService.findOne(id);
    }
    
    @PostMapping(value = {"/create"})
    public PositionDTO agregar(@RequestBody PositionDTO position) {
        return positionService.crear(position);
    }
    
    @GetMapping(value = "/all")
    public List<PositionDTO> listar() {
        return positionService.findAll();
    }
    
    @DeleteMapping(value = {"/delete/{id}"})
    //@ResponseStatus(HttpStatus.OK)
    public PositionDTO eliminar(@PathVariable long id) {
        return positionService.eliminar(id);
    }    
    
    @PutMapping(value = "/edit/{id}")
    public PositionDTO edita(@RequestBody PositionDTO position, @PathVariable("id") long id) {
        position.setId(id);
        return positionService.editar(position, id);
    }
    
}
