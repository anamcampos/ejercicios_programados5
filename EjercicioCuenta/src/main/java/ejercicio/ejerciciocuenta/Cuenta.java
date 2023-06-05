package ejercicio.ejerciciocuenta;

public class Cuenta {
    private String titular;
    private double cantidad;
    //Para acceder a todos los metodos sin ocupar argumentos
    public Cuenta(){
        
    }
    public Cuenta(String titular, double cantidad){
        this.titular = titular;
        this.cantidad = cantidad;
    }

   
    public String getTitular() {
        return titular;
    }

   
    public void setTitular(String titular) {
        this.titular = titular;
    }

    
    public double getCantidad() {
        return cantidad;
    }

   
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    public String imprimir(){
    return "El titular es: "+this.titular+"\nLa cantidad dentro de su cuenta es: "+this.cantidad;
    }
    
    //Metodos para ingresa y retirar de la cuenta
    public double ingresar(double cant){
    double total = this.cantidad + cant;
    this.cantidad = total;
    return total;
    }
    
    public double retirar(double cant){
    double retiro = this.cantidad - cant;
    if (retiro<0){
    retiro = 0;
    this.cantidad = 0;
    }
    this.cantidad = retiro;
    return retiro;
    }
    
}
