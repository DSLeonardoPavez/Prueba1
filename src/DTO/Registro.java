
package DTO;

public class Registro {
    private int id;
    private String nombre;
    private String email;
    private String usuario;
    private String cotrasena;
    private int rut;
    private char DV;
    private String Fechanacimiento;
    private int telefono;
    
    public Registro(){
    this.id = 0;
    this.nombre = "";
    this.email = "";
    this.usuario = "";
    this.cotrasena = "";
    this.rut = 0;
    this.DV = 1;
    this.Fechanacimiento = "";
    this.telefono = 1;
    } 
  
    public Registro(int id, String nombre, String email, String usuario, String cotrasena, int rut, char DV, String Fechanacimiento, int telefono) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.usuario = usuario;
        this.cotrasena = cotrasena;
        this.rut = rut;
        this.DV = DV;
        this.Fechanacimiento = Fechanacimiento;
        this.telefono = telefono;
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
        this.email = email;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCotrasena() {
        return cotrasena;
    }

    public void setCotrasena(String cotrasena) {
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

    public String getFechanacimiento() {
        return Fechanacimiento;
    }

    public void setFechanacimiento(String Fechanacimiento) {
        this.Fechanacimiento = Fechanacimiento;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    
    
    

    
}
