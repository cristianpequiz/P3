
package com.mycompany.banco;
import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {
        
        Usuario usuario= new Usuario();
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresar el id: ");
        usuario.setId(leer.nextInt());
        System.out.println("Ingresar el dni: ");
        usuario.setDni(leer.nextLong());
        System.out.println("Ingresar el saldo actual: ");
        
        usuario.setSaldo(leer.nextDouble());
        
        System.out.println(usuario.getSaldo());
        
        int opcion;
        opcion=0;
        
        do{
        System.out.println("..........");    
        System.out.println("0_Para ingresar monto al saldo");
        System.out.println("1_Para retirar monto del saldo"); 
        System.out.println("2_Para extraccion rapida"); 
        System.out.println("3_Para consultar saldo");
        System.out.println("4_Para consultar datos");
        System.out.println("5_Para ingresar nuevo usuario");
        System.out.println("6_Para salir");
        opcion=leer.nextInt();
        
        switch (opcion){
            case 0: System.out.println("Ingresa la cantidad que quieres agregar a: "+usuario.getSaldo()+"$");
            
            usuario.ingresar(leer.nextDouble(),usuario);
            
            break;
            case 1: System.out.println("Ingresar la cantidad que quieres retirar");
            usuario.retirar((int) leer.nextDouble(), usuario);
            break;
            case 2: System.out.println("Ingresar la cantidad a extraer, no puede ser mayor al 20%");
            usuario.extraccionRapida(leer.nextInt(), usuario);
            break;
            case 3: usuario.consultarSaldo(usuario);
            break;
            case 4: usuario.consultarDatos(usuario);
            break; 
            case 5: System.out.println("Adios!");
            default : System.out.println("Numero incorrecto");
            Banco.servicioUsuario();
            break;
            case 6:
        }
            } while (opcion!=6);
        
    }
    
    public static void servicioUsuario(){
            Scanner leer = new Scanner(System.in);
        
        Usuario usuario= new Usuario();
        
        System.out.println("Ingresar el id: ");
        usuario.setId(leer.nextInt());
        System.out.println("Ingresar el dni: ");
        usuario.setDni(leer.nextLong());
        System.out.println("Ingresar el saldo actual: ");
        
        usuario.setSaldo(leer.nextDouble());
        }
    
}