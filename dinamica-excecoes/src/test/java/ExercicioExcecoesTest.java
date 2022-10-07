import com.mjv.ExercicioExcecoes;
import com.mjv.validations.LimiteExcedido;
import com.mjv.validations.ValorNegativo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ExercicioExcecoesTest {
    @DisplayName("Validando entradas")
    @Test
    public void testResultado() throws ValorNegativo, LimiteExcedido {
        ExercicioExcecoes excecao = new ExercicioExcecoes();
        Assertions.assertEquals(6.0,excecao.diferenca(1, 7));
    }
}
