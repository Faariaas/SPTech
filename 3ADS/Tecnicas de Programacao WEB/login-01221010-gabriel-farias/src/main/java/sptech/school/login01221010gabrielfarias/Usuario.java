package sptech.school.login01221010gabrielfarias;

public class Usuario {

    private String nome;
    private String usuario;
    private String senha;

    private Boolean autenticado;

    public Usuario(String nome, String usuario, String senha, Boolean autenticado) {
        this.nome = nome;
        this.usuario = usuario;
        this.senha = senha;
        this.autenticado = autenticado;
    }

    public Usuario() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Boolean getAutenticado() {
        return autenticado;
    }

    public void setAutenticado(Boolean autenticado) {
        this.autenticado = autenticado;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", usuario='" + usuario + '\'' +
                ", autenticado=" + autenticado +
                '}';
    }
}
