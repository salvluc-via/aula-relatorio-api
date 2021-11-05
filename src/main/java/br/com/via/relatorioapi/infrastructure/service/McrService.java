package br.com.via.relatorioapi.infrastructure.service;

import br.com.via.relatorioapi.adapter.dto.MCRDto;
import br.com.via.relatorioapi.adapter.exception.DataNotFoundException;
import br.com.via.relatorioapi.adapter.exception.DatabaseException;
import br.com.via.relatorioapi.infrastructure.entity.MCREntity;
import br.com.via.relatorioapi.infrastructure.repository.MCRRepository;
import lombok.SneakyThrows;
import org.hibernate.HibernateException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class McrService {

    MCRRepository mcrRepository;

    McrService(MCRRepository mcrRepository){
        this.mcrRepository = mcrRepository;
    }

    public List<MCRDto> getMcr() {
        List<MCREntity> mcrsEntity = mcrRepository.getMcr();
        List<MCRDto> mcrsModel = new ArrayList<>();

        for(MCREntity mcr : mcrsEntity)
            mcrsModel.add(new MCRDto(mcr));

        return mcrsModel;
    }

    @SneakyThrows
    public MCRDto getMcrById(int id) {
        return new MCRDto(mcrRepository.findById(id)
                .orElseThrow(() -> new DataNotFoundException(id)));
    }

    @SneakyThrows
    public MCRDto postMcr(MCRDto request) {
        try {
            MCREntity entity = new MCREntity(request);
            return new MCRDto(mcrRepository.save(entity));
        } catch (Exception e){
            throw new DatabaseException(e.getMessage());
        }
    }

    @SneakyThrows
    public MCRDto patchMcr(int id, MCRDto request) {

        try{
            MCREntity entity = mcrRepository.findById(id)
                    .orElseThrow(() -> new DataNotFoundException(id));

            // mapper

            return new MCRDto(mcrRepository.save(new MCREntity(request)));

        } catch (Exception e){
            throw new DatabaseException(e.getMessage());
        }
    }

    public void deleteById(int id) {
        mcrRepository.deleteById(id);
    }
}
