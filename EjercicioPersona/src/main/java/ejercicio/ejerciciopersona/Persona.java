package ejercicio.ejerciciopersona;
//import java.util.Random;

public class Persona {
    private String nombre;
    private int edad;
    private int cedula;
    private char sexo = 'M';
    private double peso;
    private double altura;
    
    
    public Persona(){
    }
    
    public Persona(String nombre, int edad, char sexo){
       this.nombre = nombre;
    this.edad = edad;
        this.sexo = sexo;
    }
    
    public Persona(String nombre, int edad, int cedula, char sexo, double peso, double altura){
    this.nombre = nombre;
    this.edad = edad;
    this.cedula = cedula;
    this.sexo = sexo;
    this.peso=peso;
    this.altura = altura;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCedula() {
        return cedula;
    }
  

    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    //METODOS QUE SE IMPLEMENTAN
        
    public String imprimir(){
     return "El nombre es: "+this.nombre+"\nLa edad es: "+this.edad+"\nLa cedula es: "+generaCedula()+"\nEl sexo es: "+this.sexo+"\nEl peso es: "+this.peso+"\nLa altura es: "+this.altura;
    }
    
    
    
    public void calcImc(){
    double imc = this.peso/(this.altura*this.altura);
    
    if (imc<18.5){
        System.out.println("Su peso es bajo");
    } else if (imc>=18.5 && imc<=24.9){
        System.out.println("Su peso es normal");
    } else if (imc>=25 && imc<=29.9){
        System.out.println("Se encuentra en sobrepeso");
    } else if (imc>=30){
    System.out.println("Se encuentra en obesidad");
    }
    }
    
    public boolean mayorDeEdad(){
        boolean verdad = false;
        if(this.edad>=18){
        verdad = true;
    }  
        return verdad;
    }
    public void comprobarSexo(){
        if (this.sexo!= 'M' && this.sexo != 'H'){
            this.sexo = 'I';
        }
    }
    
    public int generaCedula(){
        return this.cedula = (int)(Math.random()*999999999+100000000);
        /* OTRA FORMA DE HACERLO USANDO LA LIBERRIA:
        Random rand = new Random();
        int ced = rand.nextInt(99999999)
        */
    }
}
