/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socolClient;

import socols.*;

/**
 *
 * @author hugo
 */
public class SocolClient {

    /**
     * Si hay servidor y cliente
     * 1. run Socols.java desde barra arriba
     * 2. selecionar SocolClient.java
     * 3. Abrir menu con Botton derecho raton selecionado SocolClient.java
     * 4. Escoger Run File o shift+F6
     * 5.escribir mensaje
     * 6. enter
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ConectorCliente c= new ConectorCliente();
        c.iniciar();
    }
    
}
