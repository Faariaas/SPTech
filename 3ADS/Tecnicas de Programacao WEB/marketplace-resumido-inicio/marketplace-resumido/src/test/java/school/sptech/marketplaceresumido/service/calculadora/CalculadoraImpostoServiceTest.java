package school.sptech.marketplaceresumido.service.calculadora;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraImpostoServiceTest {

    @Test
    @DisplayName("Quando acionado com 100 deve retornar valor correto")
    void CalcularImpostoQuandoAcionadoDeveRetornarCorretamente(){
        CalculadoraImpostoService service = new CalculadoraImpostoService();

        double resultadoEsperado = 18.0;
        double valorProduto = 100.0;

        double resultado = service.calcularImposto(valorProduto);

        assertEquals(resultadoEsperado, resultado);
    }
    @Test
    @DisplayName("quando acionado com valor nulo deveria lançar IllegalArgumentException")
    void quandoAcionadoValorNegativoDeveLancarExcecao(){

        CalculadoraImpostoService service = new CalculadoraImpostoService();
        String mensagemEsperada = "Valor nao pode ser negativo";

        double valorProduto = -10.0;

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> service.calcularImposto(valorProduto)
                );

        assertEquals(mensagemEsperada, exception.getMessage());
    }
    @Test
    @DisplayName("quando acionado com valor zero deveria lançar IllegalArgumentException")
    void quandoAcionadoValorNuloDeveLancarExcecao(){

        CalculadoraImpostoService service = new CalculadoraImpostoService();
        String mensagemEsperada = "Valor nao pode ser nulo";

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> service.calcularImposto(null)
        );

        assertEquals(mensagemEsperada, exception.getMessage());
    }
    @Test
    @DisplayName("quando acionado com valor nagativo deveria lançar IllegalArgumentException")
    void quandoAcionadoValorZeroDeveLancarExcecao(){

        CalculadoraImpostoService service = new CalculadoraImpostoService();
        String mensagemEsperada = "Valor nao pode ser zero";

        double valorProduto = 0.0;

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> service.calcularImposto(valorProduto)
        );

        assertEquals(mensagemEsperada, exception.getMessage());
    }


}