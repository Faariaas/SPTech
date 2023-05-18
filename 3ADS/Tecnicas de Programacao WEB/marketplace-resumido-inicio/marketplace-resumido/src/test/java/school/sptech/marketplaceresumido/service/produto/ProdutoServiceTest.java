package school.sptech.marketplaceresumido.service.produto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.context.event.EventListenerMethodProcessor;
import school.sptech.marketplaceresumido.domain.Produto;
import school.sptech.marketplaceresumido.domain.data.ProdutoRepository;
import school.sptech.marketplaceresumido.domain.exception.EntidadeNaoEncontradaException;
import school.sptech.marketplaceresumido.service.produto.builder.ProdutoBuilder;
import school.sptech.marketplaceresumido.service.produto.dto.ProdutoConsultaDto;


import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class ProdutoServiceTest {

    @Mock
    private ProdutoRepository produtoRepository;

    @InjectMocks
    private ProdutoService service;

    @Test
    @DisplayName("Listar quando acionado deve retornar 3 itens")
    void listarQaundoAcionadoDeveRetornarObjetosValidos(){

        //given
        int resultadoEsperado = 3;
        List<Produto> produtos = ProdutoBuilder.criarListaProduto();

        //when
        Mockito.when(produtoRepository.findAll()).thenReturn(produtos);

        //then
        List<ProdutoConsultaDto> resultado = service.listar();

        //assert
        assertFalse(resultado.isEmpty());
        assertEquals(resultadoEsperado, resultado.size());

    }

    @Test
    @DisplayName("Listar quando acionado e nao houver registros deve retornar que esta vazia")
    void listaQuandoAcionadoSemRegistroDeveRetornarListaVazia(){

        int resultadoEsperado = 0;
        //when
        Mockito.when(produtoRepository.findAll()).thenReturn(List.of());

        //then
        List<ProdutoConsultaDto> resultado = service.listar();

        //assert
        assertTrue(resultado.isEmpty());
        assertEquals(resultadoEsperado, resultado.size());

    }

    @Test
    @DisplayName("BuscarPorId quando acionado com id invalido deve lancar EntidadeNaoEncontradaException")
    void buscarPorIdQuandoAcionadoComIdInvalidoDeveLancarExcecao(){

        //given
        final String mensagemEsperada = "Produto nao encontrado";

        //when
        Mockito.when(produtoRepository.findById(Mockito.anyLong())).thenReturn(Optional.empty());


        //then/assert
        EntidadeNaoEncontradaException exception =
        assertThrows(EntidadeNaoEncontradaException.class,
                () -> service.buscarPorId(1l)
                //colocar na referencia com long devese colocar o L ao final do numero
                );
        assertEquals(mensagemEsperada, exception.getMessage());
    }

}