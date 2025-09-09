/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.efsdokmdfjkln;

import com.example.banquinho.service.serCon;
import com.example.banquinho.entity.Conta;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class conTest {

    @Test
    public void testVerConta() {
        serCon service = new serCon();
        int idCliente = 0;
        service.Addconta(idCliente);

        Conta conta = service.idInf(0);

        assertNotNull(conta, "Conta should not be null");
        assertEquals(0, conta.getNumber(), "Account number should be 1");
        assertEquals(idCliente, conta.getIdCliente(), "Owner id should match");
        assertEquals(0.0, conta.getSaldo(), "Initial balance should be 0.0");
    }

    @Test
    public void testVerContaInvalida() {
        serCon service = new serCon();
        Conta conta = service.idInf(-1);
        assertNull(conta, "Conta should be null for an invalid account id");
    }
}
