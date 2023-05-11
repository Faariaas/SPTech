package school.sptech.videojogosatividade.reposritorio;

import org.springframework.data.jpa.repository.JpaRepository;
import school.sptech.videojogosatividade.entidades.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, String> {
}
