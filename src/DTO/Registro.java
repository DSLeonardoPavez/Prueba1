
package DTO;

public class Registro {
    private int id;
    private String nombre;
    private String email;
    private String cotrasena;
    
    public Registro(){
    this.id = 0;
    this.nombre = "";
    this.email = "";
    this.cotrasena = "";
            
    } 

    public Registro(int id, String nombre, String email, String cotrasena) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.cotrasena = cotrasena;
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

    public String getCotrasena() {
        return cotrasena;
    }

    public void setCotrasena(String cotrasena) {
        this.cotrasena = cotrasena;
    }
    
    
    
    
    
    
    
    
}
