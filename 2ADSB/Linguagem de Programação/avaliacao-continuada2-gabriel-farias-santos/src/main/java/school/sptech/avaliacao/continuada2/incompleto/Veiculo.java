package school.sptech.avaliacao.continuada2.incompleto;

/*

 Substitua os valores abaixo com seus dados:

 RA: {INSIRA SEU RA}
 NOME: {INSIRA SEU NOME}
 TURMA: {INSIRA SUA TURMA}

 ATENÇÃO!!!
 RESOLVA OS ERROS DE COMPILAÇÃO ANTES DE RODAR QUALQUER TESTE

 */
public class Veiculo {
    private Integer id;
    private String modelo;
    private Double valorTabela;
    private Integer quantidadeEstoque;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getValorTabela() {
        return valorTabela;
    }

    public void setValorTabela(Double valorTabela) {
        this.valorTabela = valorTabela;
    }

    public Integer getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(Integer quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public Veiculo(Integer id, String modelo) {
        this.id = id;
        this.modelo = modelo;
        this.valorTabela = 0.0;
        this.quantidadeEstoque = 0;
    }
    
    
}
