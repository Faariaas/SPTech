package sptech.school.projetobuscadoresdinamicos.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import sptech.school.projetobuscadoresdinamicos.Dominio.Diretor;

public interface DiretorRepository extends JpaRepository<Diretor, String> {
    boolean existsById(Long id);
}
