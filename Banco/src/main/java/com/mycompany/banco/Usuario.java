    
package com.mycompany.banco;
    
public class Usuario {
    
    private int id;
    private long dni;
    private double saldo;
    
    public Usuario() {
    }
    
    public Usuario(int id, long dni, double saldo) {
        this.id = id;
        this.dni = dni;
        this.saldo = saldo;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public long getDni() {
        return dni;
    }
    
    public void setDni(long dni) {
        this.dni = dni;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    //metodo para ingresar dinero
    public void ingresar(double monto,Usuario usuario){
    
        double saldoActual=usuario.getSaldo();
        saldoActual=saldoActual+monto;
        usuario.setSaldo(saldoActual);
        System.out.println("Se a ingresado un monto y el saldo actual es de "+usuario.getSaldo()+"$");
       
    }
    
    //metodo para retirar
    public void retirar(int monto,Usuario usuario){
    
        double saldoActual=usuario.getSaldo();
        saldoActual=saldoActual-monto;
        if (saldoActual<=0){
        System.out.println("El monto a retirar es mayor al sueldo actual");
        }
        else{
        usuario.setSaldo(saldoActual); 
        System.out.println("Se retiro un monto y el saldo actual es de "+usuario.getSaldo()+"$");
        }
            
        
    }
            
    //metodo extraccion rapida
    public void extraccionRapida(int monto,Usuario usuario){
        double porcentaje;
        double sueldoActual;
        porcentaje=usuario.getSaldo()*0.2;
    
        if (monto>porcentaje){
        System.out.println("El monto a retirar es mayor al 20%");
        
        } else {
            sueldoActual=usuario.getSaldo();
            sueldoActual=sueldoActual-monto;
            usuario.setSaldo(sueldoActual);
            System.out.println("Se retiro un monto y el saldo actual es de "+usuario.getSaldo()+"$");
        
        }
        
    
    }
    
    //metodo para consultar saldo
    public void consultarSaldo(Usuario usuario){
    
        System.out.println("Su saldo actual es de "+usuario.getSaldo()+"$");
    
    }
    
    //metodo para consultar datos
    public void consultarDatos(Usuario usuario){
   
        System.out.println("Id del usuario: "+usuario.getId());
        System.out.println("DNI del usuario: "+usuario.getDni());
        System.out.println("Saldo del usuario: "+usuario.getSaldo()+"$");
        
    }
      
}   
    