package com.senai.travel_management.services;

import com.senai.travel_management.dtos.ViajanteDto;
import com.senai.travel_management.entities.ViajanteEntity;
import com.senai.travel_management.repositories.ViagemRepository;
import com.senai.travel_management.repositories.ViajanteRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ViajanteService {

    private final ViajanteRepository viajanteRepository;
    private final ViagemRepository viagemRepository;

    public ViajanteService(ViajanteRepository viajanteRepository, ViagemRepository viagemRepository) {
        this.viajanteRepository = viajanteRepository;
        this.viagemRepository = viagemRepository;
    }

    //Lista de Viajantes
    List<ViajanteEntity> viajantes = new ArrayList<ViajanteEntity>();

    //Create
    public boolean criarViajante(ViajanteDto viajanteDto) {

        if (viajanteRepository.existsByEmail(viajanteDto.getEmail())) {
            return false;
        }

        ViajanteEntity viajante = new ViajanteEntity();
        viajante.setNome(viajanteDto.getNome());
        viajante.setEmail(viajanteDto.getEmail());
        viajanteRepository.save(viajante);
        return true;

    }

    //Read All
    public List<ViajanteDto> obterViajantes() {
        List<ViajanteEntity> viajantes = viajanteRepository.findAll();
        List<ViajanteDto> viajanteDto = new ArrayList<>();

        for (ViajanteEntity viajante : viajantes) {
            ViajanteDto dto = new ViajanteDto();
            dto.setNome(viajante.getNome());
            dto.setEmail(viajante.getEmail());
            viajanteDto.add(dto);
        }
        return viajanteDto;
    }
    //Read BY

    //Update

    //Delete
    public boolean excluirViajante(String email) {
        Optional<ViajanteEntity> optional = viajanteRepository.findByEmail(email);

        if (optional.isEmpty()) return false;

        //Verifica se há viagens vinculadas
        /*
        if (viagemRepository.existsByViajante(optional.get())) {
            return false;
        }
        */

        viajanteRepository.delete(optional.get());
        return true;
    }
}
