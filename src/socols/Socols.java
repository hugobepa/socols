/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socols;

/**
            
            *Hacer si solo hay servidor
            * poner run socols
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
public class Socols {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conector c= new Conector();
        c.iniciar();
    }
    
}
