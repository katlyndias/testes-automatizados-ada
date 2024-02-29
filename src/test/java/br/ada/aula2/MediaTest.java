package br.ada.aula2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MediaTest {
    @Test
    public void recebeNotas() {
        //Arrange - Preparar
        Media media = new Media();

        //Act - Agir
        double mediaRecebida = media.calcularMedia(10.0, 6.0, 8.0);

        //Assertion - Validação / Asserção
        assertEquals(mediaRecebida, 8.0);
    }

}
