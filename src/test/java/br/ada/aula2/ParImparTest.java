package br.ada.aula2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParImparTest{

    @Test
    public void numeroDeveSerPar() {
        ParImpar parImpar = new ParImpar();
        boolean par = parImpar.verificaParImpar(4);
        assertTrue(par);

    }

    @Test
    public void numeroDeveSerImpar() {
        ParImpar parImpar = new ParImpar();
        boolean impar = parImpar.verificaParImpar(3);
        assertFalse(impar);
    }

    @Test
    public void zeroDeveSerImpar() {
        ParImpar parImpar = new ParImpar();
        boolean par = parImpar.verificaParImpar(0);
        assertTrue(par);
    }

}
