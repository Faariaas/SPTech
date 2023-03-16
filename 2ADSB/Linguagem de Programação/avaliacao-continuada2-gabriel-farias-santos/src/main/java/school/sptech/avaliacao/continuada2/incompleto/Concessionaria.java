package school.sptech.avaliacao.continuada2.incompleto;

/*

 Substitua os valores abaixo com seus dados:

 RA: {INSIRA SEU RA}
 NOME: {INSIRA SEU NOME}
 TURMA: {INSIRA SUA TURMA}
  
 ATENÇÃO!!!
 RESOLVA OS ERROS DE COMPILAÇÃO ANTES DE RODAR QUALQUER TESTE

 */
public class Concessionaria {
    private String nome;
    private Integer quantidadeVendas;
    private Integer quantidadeDesontosAplicados;
    private Double totalVendido;

    public String getNome() {
        return nome;
    }

    public Integer getQuantidadeVendas() {
        return quantidadeVendas;
    }

    public Integer getQuantidadeDesontosAplicados() {
        return quantidadeDesontosAplicados;
    }

    public Double getTotalVendido() {
        return totalVendido;
    }

    public Concessionaria(String nome) {
        this.nome = nome;
        this.quantidadeVendas = 0;
        this.quantidadeDesontosAplicados = 0;
        this.totalVendido = 0.0;
    }
    
    public void aumentarEstoque(Veiculo veiculo, Integer quantidade){
        if(veiculo == null || quantidade == null || quantidade <= 0){
            return;
        }else
    if(veiculo != null || quantidade != null || quantidade >0){
        veiculo.setQuantidadeEstoque(quantidade);
    }
}
    public void realizarVenda(Veiculo veiculo){
//        if(veiculo ==null || veiculo.getQuantidadeEstoque() <=0 || veiculo.getValorTabela()<=0){
//        }else{
//            veiculo.setQuantidadeEstoque(quantidadeVendas-1);
//            totalVendido+=veiculo.getValorTabela();
//            quantidadeVendas++;
//        }
        if(veiculo != null && veiculo.getQuantidadeEstoque()>0 && veiculo.getValorTabela()>0 && veiculo.getValorTabela() !=null){
            veiculo.setQuantidadeEstoque(quantidadeVendas-1);
            totalVendido+=veiculo.getValorTabela();
            quantidadeVendas++;
        }else {
            return;
        }
    }
    
    public void realizarVenda(Veiculo veiculo, Double porcentagemDesconto){
        int valorDesconto;
        int valorFinal;
        if (veiculo == null){
            return;
        }
        if(veiculo.getQuantidadeEstoque()<=0){
            return;
        }
        if(veiculo.getValorTabela()<=0 || veiculo.getValorTabela()==null){
            return;
        }
        if(quantidadeDesontosAplicados == null){
            return;
        }
        if(quantidadeDesontosAplicados <=0){
            return;
        }else{
            veiculo.setQuantidadeEstoque(quantidadeVendas);
            valorDesconto = veiculo.getValorTabela()*(porcentagemDesconto/100.0);
            valorFinal = veiculo.getValorTabela()-valorDesconto;
            totalVendido += valorDesconto+valorFinal;
            quantidadeVendas++;
            quantidadeDesontosAplicados++;
        }
    }
    
    public void getPercentualVendasComDesconto(){
        Double valor;
        
        
    }
    
    
}
