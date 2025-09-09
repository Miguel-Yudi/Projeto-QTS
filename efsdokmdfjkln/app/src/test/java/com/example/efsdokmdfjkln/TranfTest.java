/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.efsdokmdfjkln;

import com.example.banquinho.service.serCli;
import org.junit.jupiter.api.BeforeEach;
import com.example.banquinho.service.serCon;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author amanda
 */
public class TranfTest {
     private serCon sercon;
    private serCli sercli;
    
    @BeforeEach
    void setUp() {
        sercli = new serCli();
        sercon = new serCon();
        sercli.Addcliente(12312312312L, "Miguel");
        sercon.Addconta(0);
        sercon.Deposito(0, 150);
        sercli.Addcliente(32132132121L, "Marcos");
        sercon.Addconta(1);
    }
    @Test
    void testTransferencia() {
        double[] retorno = sercon.transferencia(0, 1, 50);
        assertEquals(100, retorno[0]);
        assertEquals(50, retorno[1]);
    }
    
    @Test
    void testeSaldoIndisponivel() {
        double[] retorno = sercon.transferencia(0, 1, 200);
        assertNull(retorno);
    }
}

