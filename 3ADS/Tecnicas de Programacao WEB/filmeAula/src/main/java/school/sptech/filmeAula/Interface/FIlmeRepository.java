package school.sptech.filmeAula.Interface;

import org.springframework.data.jpa.repository.JpaRepository;
import school.sptech.filmeAula.Filme;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface FIlmeRepository extends JpaRepository<Filme, Long> {

    Optional<Filme> findByNome(String nome);

    List<Filme> findByDiretorIgnoreCase(String nomeDiretor);

    List<Filme> findByDataLancamentoLessThanEqual(LocalDate data);

    List<Filme> findByIndicacaoOscarTrue();

    int countByIndicacaoOscarFalse();

    List<Filme> findByCustoProducaoGreaterThanEqual(double custo);
}
