/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.efsdokmdfjkln;

import org.junit.jupiter.api.Test;
import com.example.banquinho.service.serCli;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author amanda
 */
public class CliTest {
    private serCli sercli = new serCli();
    int addcli;
    Long cpf;
    String nome;
    
    @Test
    public void testCriarCliente() {
        cpf = 12312312312L;
        nome = "Beatriz";
        addcli = sercli.Addcliente(cpf, nome);
        assertEquals(addcli, 0);
    }
    
     @Test
    public void testNomeNulo() {
    cpf = 12312312333L;
    nome = "";
    addcli = sercli.Addcliente(cpf, nome);
    assertNotEquals(addcli, 0);
    assertEquals(addcli, 1);
    }
    
    @Test
    public void testErroNome() {
    cpf = 12312312333L;
    nome = "Bea00";
    addcli = sercli.Addcliente(cpf, nome);
    assertNotEquals(addcli, 0);
    assertEquals(addcli, 2);
    }
    
    @Test
    public void testErroCpf() {
    cpf = 12312L;
    nome = "Bea";
    addcli = sercli.Addcliente(cpf, nome);
    assertNotEquals(addcli, 0);
    assertEquals(addcli, 3);
}
    
}
