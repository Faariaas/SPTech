package com.sptech.atividade.com.testes;

/**
 *
 * @author miniguiti
 */
public class Hospital {

    private String nome;
    private Integer QuantidadeDePagamentos;
    private Integer QuantidadeDeHoraExtra;

    public Hospital(String nome) {
        this.nome = nome;
        this.QuantidadeDePagamentos = 0;
        this.QuantidadeDeHoraExtra = 0;
    }

    public String getNome() {
        return nome;
    }

    public Integer getQuantidadeDePagamentos() {
        return QuantidadeDePagamentos;
    }

    public Integer getQuantidadeDeHoraExtra() {
        return QuantidadeDeHoraExtra;
    }

    public void realizarPagamento(Medico medico, Double valorPago) {
        if (medico == null) {
            return;
        }

        if (valorPago == null) {
            return;
        }

        if (medico.getAtivo() == false ){
            return;
        }
        if(valorPago <= 0 ){
            return;
        } 
        if (medico.getAtivo() == true && valorPago > 0){
            
            medico.setSalario(valorPago);
            
            QuantidadeDePagamentos++;
            
        }
    }

    public void realizarPagamento(Medico medico, Double valorPago, Double HoraExtra) {
        if (medico == null || valorPago == null || valorPago <= 0 || medico.getAtivo() == false || (HoraExtra == null || HoraExtra <= 0)){
            return;
        }else {
            medico.setSalario(valorPago + HoraExtra);
            QuantidadeDePagamentos++;
            QuantidadeDeHoraExtra++;
        }
//        if (medico == null) {
//            return;
//        }
//
//        if (valorPago == null) {
//            return;
//        }
//
//        if (medico.getAtivo() == false){
//            return;
//        }
//        if( valorPago <= 0.0 ){
//            return;
//        }
//        if(HoraExtra == null || HoraExtra <= 0.0){
//            return;
//        } 
//        if(medico.getAtivo() == true && HoraExtra != null && HoraExtra > 0.0){
//            medico.setSalario(valorPago + HoraExtra);
//            QuantidadeDePagamentos++;
//            QuantidadeDeHoraExtra++;
//        }
        
    }

    public void desligarMedico(Medico medico) {
        if (medico == null) {
            return;
        }

        if (medico.getAtivo() != true) {
            return;
        } else {
            medico.setAtivo(false);
        }
    }

}
