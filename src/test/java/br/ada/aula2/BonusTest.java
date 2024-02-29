package br.ada.aula2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BonusTest {

    @Test
    public void deveReceber5PorcentoBonus() {
        //Arrange - Preparar
        Bonus bonus = new Bonus();

        //Act - Agir
        double bonusRecebido = bonus.calcularBonus(21, 6, 1000);

        //Assertion - Validação / Asserção
        assertEquals(bonusRecebido, 50);
    }

    @Test
    public void deveReceber10PorcentoBonus() {
        Bonus bonus = new Bonus();
        double bonusRecebido = bonus.calcularBonus(31, 12, 1000);
        assertEquals(bonusRecebido, 100);
    }

    @Test
    public void naoRecebeBonus() {
        Bonus bonus = new Bonus();
        double bonusRecebido = bonus.calcularBonus(19, 5, 1000);
        assertEquals(bonusRecebido, 0);
    }
}
