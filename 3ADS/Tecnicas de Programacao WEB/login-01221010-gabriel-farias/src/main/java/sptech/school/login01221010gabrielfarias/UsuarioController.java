package sptech.school.login01221010gabrielfarias;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    private List<Usuario> usuarios;

    public UsuarioController() {
        this.usuarios = new ArrayList<>();
    }

    @GetMapping("/cadastrados")
    public List<Usuario> list(){
        return usuarios;
    }

    @PostMapping("/cadastro")
    public Usuario cadastrar(@RequestBody Usuario newUsuario) {
        usuarios.add(newUsuario);
        return newUsuario;
    }

    @PostMapping("/autenticacao/{usuario}/{senha}")
    public String autenticar(@PathVariable String usuario, @PathVariable String senha) {
        for(Usuario u : usuarios){
            if (u.getUsuario().equals(usuario) && u.getSenha().equals(senha)){
                u.setAutenticado(true);
                return "Nome: " + u.getNome() + "\n" +
                        "Usuario: " + u.getUsuario() + " Autenticado com sucesso";
            }
        }
        return null;
    }

    @DeleteMapping("/autenticacao/{usuario}")
    public String logoof(@PathVariable String usuario) {
        for(Usuario u : usuarios){
            if (u.getUsuario().equals(usuario) && u.getAutenticado()==true){
                u.setAutenticado(false);
                return "Logoff do usuário " +u.getUsuario()+ " concluído";
            } else if (u.getUsuario().equals(usuario) && u.getAutenticado() == false) {
                return "Usuário " + u.getUsuario() + " NÃO está autenticado";
            } else {
                return "Usuário Z " + usuario + " não encontrado";
            }
        }
        return null;
    }
}
