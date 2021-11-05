package br.com.via.relatorioapi.infrastructure.repository;

import br.com.via.relatorioapi.infrastructure.entity.MCREntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MCRRepository extends JpaRepository<MCREntity, Integer> {

    @Query(value = "SELECT * FROM MCR WHERE CD_MCR = :id",
            nativeQuery = true)
    MCREntity getMcrById(@Param("id") int id);

    @Query(value = "SELECT * FROM MCR WHERE DT_MCR_ICL > '2020-01-01'",
            nativeQuery = true)
    List<MCREntity> getMcr();

}
