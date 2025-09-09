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
    boolean addcli;
    long checkcpf;
    Boolean checknome;
    String cpf;
    String nome;
    
    @Test
    public void testCriarCliente() {
        cpf = "12312312312";
        nome = "Beatriz";
        checknome = sercli.checkName(nome);
        assertTrue(checknome);
        checkcpf = sercli.checkCpf(cpf);
        assertNotEquals(checkcpf, 0); 
        addcli = sercli.Addcliente(checkcpf, nome);
        assertTrue(addcli);
    }
    
    @Test
    public void testErroCliente() {
    cpf = "123";
    nome = "Bea021";
    checknome = sercli.checkName(nome);
    assertFalse(checknome);
    checkcpf = sercli.checkCpf(cpf);
    assertEquals(checkcpf, 0);
}
}
