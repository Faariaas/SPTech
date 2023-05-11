package sptech.school.projetocinema.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import sptech.school.projetocinema.domain.Filme;
import sptech.school.projetocinema.dto.FilmeResumoDto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface FilmeRepository extends JpaRepository<Filme, Long> {

    Optional<Filme> findByNome(String nome);

    List<Filme> findByDiretorNomeContainsIgnoreCase(String nome);

    List<Filme> findByDataLancamentoLessThanEqual(LocalDate data);

    List<Filme> findByIndicacaoOscarTrue();

    int countByIndicacaoOscarFalse();

    List<Filme> findByCustoProducaoGreaterThan(double custo);

    List<Filme> findTop5ByOrderByIdDesc();

    // indicacao oscar true
    // SELECT COUNT(*) FROM filme WHERE indicacao_oscar = true;
    int countByIndicacaoOscarTrue();

    @Query("SELECT COUNT(f) FROM Filme f WHERE f.indicacaoOscar")
    int contagemFilmesIndicados();

    @Query("SELECT AVG(f.custoProducao) FROM Filme f")
    BigDecimal mediaCustoProducao();

    @Query("SELECT COUNT(f) FROM Filme f WHERE f.indicacaoOscar AND f.diretor.nome iLike %:diretor%")
    int contagemFilmesIndicadosPorDiretor(String diretor);


    @Query("SELECT new sptech.school.projetocinema.dto.FilmeResumoDto(f.nome, f.diretor.nome) FROM Filme f")
    List<FilmeResumoDto> listagemResumo();

    @Modifying
    @Query("DELETE FROM Filme f WHERE f.id = :id")
    void deletaPorId(Long id);

    @Modifying
    @Query("UPDATE Filme f SET f.nome = :nome WHERE f.id = :id")
    void atualizaNomePorId(Long id, String nome);
}
