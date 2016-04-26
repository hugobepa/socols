/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socolClient;

/**
            poner run socols
            abrir terminal
            $telnet address puerto
            $telnet 127.0.0.1 9000
            enter
            se conecta+espera
            enter
            adios mundo
            deberia salir: 
             $ telnet 127.0.0.1 9000
                Trying 127.0.0.1...
                Connected to 127.0.0.1.
                Escape character is '^]'.


                adios mundo
             Connection closed by foreign host.

            */

import socols.*;
import java.net.*;
import java.io.*;

public class ConectorCliente {
    
    
    Socket cliente;
    int puerto= 9000;
    String ip="127.0.0.1";
    PrintStream salida;
    BufferedReader entrada, teclado;
    
    public void iniciar()
    {
        try {
            
            cliente = new Socket(ip,puerto);
            
            
            entrada= new BufferedReader( new InputStreamReader(cliente.getInputStream()));
            teclado= new BufferedReader( new InputStreamReader(System.in));
            System.out.println("Escribe mensaje:");
            String tec =teclado.readLine();
            System.out.println("Cliente: "+tec);
            salida = new PrintStream(cliente.getOutputStream());
            salida.println(tec);
            String msg=entrada.readLine();
            System.out.println(msg);
            
                    
            entrada.close();
             salida.close();
             teclado.close();
              cliente.close();
        } catch (Exception e) {
        };
        
    }
    
    
}
