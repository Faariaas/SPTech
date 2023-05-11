package sptech.school.projetobuscadoresdinamicos.Repositorio;


import org.springframework.data.jpa.repository.JpaRepository;
import sptech.school.projetobuscadoresdinamicos.Dominio.Filme;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface FilmeRepository extends JpaRepository<Filme, Long> {

    Optional<Filme> findByNome(String nome);

    List<Filme> findByDiretorNomeContainsIgnoreCase(String nome);

    List<Filme> findByDataLancamentoLessThanEqual(LocalDate data);

    List<Filme> findByIndicacaoOscarTrue();

    int countByIndicacaoOscarFalse();

    List<Filme> findByCustoProducaoGreaterThanEqual(double custo);
}
