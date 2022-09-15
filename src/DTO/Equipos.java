
package DTO;

public class Equipos {
    
    private String codigo;
    private String nombreclub;
    private String nombrefun;
    private String lema;
    private int valors;
    private String color;
    private String fundacion;
    private String pais;
    
    public Equipos(){
        this.codigo = "";
        this.nombreclub = "";
        this.nombrefun = "";
        this.lema = "";
        this.valors = 0;
        this.color = "";
        this.fundacion = "";
        this.pais = "";
    }

    public Equipos(String codigo, String nombreclub, String nombrefun, String lema, int valors, String color, String fundacion, String pais) {
        this.codigo = codigo;
        this.nombreclub = nombreclub;
        this.nombrefun = nombrefun;
        this.lema = lema;
        this.valors = valors;
        this.color = color;
        this.fundacion = fundacion;
        this.pais = pais;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreclub() {
        return nombreclub;
    }

    public void setNombreclub(String nombreclub) {
        this.nombreclub = nombreclub;
    }

    public String getNombrefun() {
        return nombrefun;
    }

    public void setNombrefun(String nombrefun) {
        this.nombrefun = nombrefun;
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

    public String getFundacion() {
        return fundacion;
    }

    public void setFundacion(String fundacion) {
        this.fundacion = fundacion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
}
