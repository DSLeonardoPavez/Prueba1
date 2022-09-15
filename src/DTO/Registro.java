package DTO;

import java.util.Date;
public class Registro {
    private int id;
    private String nombre;
    private String email;
    private String usuario;
    private String cotrasena;
    private int rut;
    private char DV;
    private Date Fechanacimiento;
    private int telefono;
    private int edad;
    private String Descripcion;
    
    public Registro(){
    this.id = 0;
    this.nombre = "manito Gonzales";
    this.email = "";
    this.usuario = "";
    this.cotrasena = "";
    this.rut = 0;
    this.DV = 0;
    this.Fechanacimiento = new Date();
    this.telefono = 0;
    this.edad = 0;
    this.Descripcion = "";
    } 
  
  
    public Registro(int id, String nombre, String email, String usuario, String cotrasena, int rut, char DV, Date Fechanacimiento, int telefono, int edad, String Descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.usuario = usuario;
        this.cotrasena = cotrasena;
        this.rut = rut;
        this.DV = DV;
        this.Fechanacimiento = Fechanacimiento;
        this.telefono = telefono;
        this.edad = edad;
        this.Descripcion = Descripcion;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }



    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        StringBuilder sb = new StringBuilder();
        sb.append(usuario);
        
        if(sb.length() > 3){
            this.usuario = usuario;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        for (int i = 0; email.length()>= i; i++) {
            if(email.charAt(i)=='@'){
            this.email = email;
            }
        }
        
    }

    public String getCotrasena() {
        return cotrasena;
    }

    public void setCotrasena(String cotrasena) {
        int a=1234567890;
        String b="ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        for (int i = 0; cotrasena.length()>= i; i++) {
            if(cotrasena.charAt(i)==a){
            this.email = email;
            }
        }
        
        
        this.cotrasena = cotrasena;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public char getDV() {
        return DV;
    }

    public void setDV(char DV) {
        this.DV = DV;
    }

    public Date getFechanacimiento() {
        return Fechanacimiento;
    }

    public void setFechanacimiento(Date Fechanacimiento) {
        this.Fechanacimiento = Fechanacimiento;
    }

  

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono)
    {
        StringBuilder sb = new StringBuilder();
        sb.append(telefono);
        /*char a,b;
        a =sb.charAt(0);
        b =sb.charAt(1);*/
        if(sb.length() > 7)/* && (a=='5') && (b=='6') */ {
            this.telefono = telefono;
        }
    }
    
     public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad>17){
        this.edad = edad;
        }
    }
    
    @Override
    public String toString(){
        return this.Descripcion + this.id +
                " " + this.nombre + " " + this.email
                + " " + this.cotrasena;
    }
    
    
    
    
}
