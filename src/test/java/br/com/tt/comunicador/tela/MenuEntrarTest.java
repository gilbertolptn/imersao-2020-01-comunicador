package br.com.tt.comunicador.tela;

import br.com.tt.comunicador.common.Util;
import br.com.tt.comunicador.model.Usuario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import testutils.UtilMock;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class) //JUNIT 5
//@RunWith(MockitoJUnitRunner.class) JUNIT 4
class MenuEntrarTest {

    @Mock
    Util util;

    @Test
    void deveriaEntrarComSucesso(){
//        MockitoAnnotations.initMocks(this);
        //Preparação - Arrange
        Mockito.when(util.read())
                .thenReturn("lptn")
                .thenReturn("Gilberto")
                .thenReturn("01/10/1999");

        //Ação - Act
        Usuario usuario =
                new MenuEntrar(util).entrar();

        //Verificação - Assert
        LocalDate nascimentoEsperado
        = LocalDate.of(1999, 10, 01);

        assertEquals("lptn",usuario.getUsername());
        assertEquals("Gilberto", usuario.getNome());
        assertEquals(nascimentoEsperado,usuario.getNascimento());

        Mockito.verify(util,
                Mockito.times(3)
        ).read();
    }

    @Test
    void deveriaFalharComUserAdminComSucesso(){
        Mockito.when(util.read())
                .thenReturn("admin");

        //Ação - Act
        Assertions.assertThrows(IllegalArgumentException.class,
        () -> new MenuEntrar(util).entrar());
        Mockito.verify(util).read();
    }
    @Test
    void deveriaSerIgualA3(){
        //Preparação
        //Ação
        int resultado = 2+1;
        //Verificação
        assertEquals(3, resultado);
    }

}