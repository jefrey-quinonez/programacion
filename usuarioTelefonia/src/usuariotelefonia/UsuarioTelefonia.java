/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuariotelefonia;

import java.io.*;
import java.util.*;
public class UsuarioTelefonia {

    /**
     elaborar un programa para un usuario de telefonia movil, con las siguientes opciones:
     * 1: consultar saldo (saldo lempiras, datos navegacion, mensajes de texto,credito.)
     * 2: ttransferir saldo en lps.
     * 3: pedir saldo.
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
      String numeroCelular = "96482022";
      double datosNavegacion=800;
        double saldoDisponible = 500;
        double mensajesTexto=50;
        double dineroEnviad0=0;
        double credito=0; 
        int resp = 0;
        double monto=0;
        double resultado=0;
        double prestamo=0;
        
        while(resp != -1){
            System.out.println("---- Bienvenido a tigo---- ");
            System.out.println(" 1. Consulta de saldo  "); 
            System.out.println(" 2. mandar saldo lps ");
            System.out.println(" 3. Pedir saldo");
            System.out.println("-1. Salir ");
            System.out.println(" Que desea realizar... ? ");
            resp = entrada.nextInt(); 
            
            switch(resp){
                case 1:
                    System.out.println("");
                    System.out.println("----------------------------------------");
                    System.out.println("numero de telefono "+numeroCelular);
                    System.out.println("----------------------------------------");
                    System.out.println("Saldo disponible...   "+saldoDisponible+ "lps");
                    System.out.println("----------------------------------------");
                    System.out.println("datos de navegacion....  "+datosNavegacion+"mgb");
                    System.out.println("----------------------------------------");
                    System.out.println("mensajes de texto....  "+mensajesTexto);
                    System.out.println("----------------------------------------");
                    System.out.println("credito...  "+credito+ "lps");
                    System.out.println("----------------------------------------");

                    break;
                case 2: 
                    System.out.println("");
                        System.out.println("NUMERO DEL QUE TRASFIERE #"+numeroCelular);
                    System.out.println("Saldo disponible...   "+saldoDisponible);
                    System.out.println("Ingrese el monto a transferir... ");
                    monto = entrada.nextDouble();
                    
                    if((saldoDisponible-monto)> 0){
                        
                        saldoDisponible -= monto;
                        resultado = saldoDisponible - monto;
                        
                    }else{
                        System.err.println("No se puede transferir, monto mayor al disponible");
                        resp = 0;
                    }
                    break;
                case 3: 
                    System.out.println("----------------------------------------");
                    System.out.println("numero de celular #"+numeroCelular);
                    System.out.println("Ingrese el monto requerido... ");
                    prestamo = entrada.nextDouble();
                    
                    saldoDisponible +=prestamo;
                    credito +=prestamo;

                    break;
                default: 
                        resp = 0;
            }
            System.out.println("");
            System.out.println(" ===================================================  "); 
            System.out.println(" Presione -1 para salir, 0 para volver al menu ");
            resp = entrada.nextInt();
            
        }
        
    }
    
}
