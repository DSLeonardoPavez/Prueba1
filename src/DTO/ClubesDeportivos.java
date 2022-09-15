
package DTO;

public class ClubesDeportivos {
    
    private String codigo;
    private String nombre;
    private String lema;
    private int valors;
    private String color;
    
    public ClubesDeportivos(){
        this.codigo = "";
        this.nombre = "";
        this.lema = "";
        this.valors = 0;
        this.color = "";
    }

    public ClubesDeportivos(String codigo, String nombre, String lema, int valors, String color) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.lema = lema;
        this.valors = valors;
        this.color = color;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLema() {
        return lema;
    }

    public void setLema(String lema) {
        this.lema = lema;
    }

    public int getValors() {
        return valors;
    }

    public void setValors(int valors) {
        this.valors = valors;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    
    
}
