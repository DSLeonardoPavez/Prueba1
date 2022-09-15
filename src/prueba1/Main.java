package prueba1;
import DTO.Equipos;
import DTO.Registro;
import java.util.Date;
        
public class Main {

    public static void main(String[] args) {
        
        System.out.println("Ingreso de Registro");
        Registro re = new Registro();
        re.setId(1000);
        re.setNombre("manito Gonzales");
        re.setEmail("leonardo.pavezq@gmail.com");
        re.setUsuario("Leonardo");
        re.setCotrasena("leo12345");
        re.setRut(123456789);
        re.setDV('K');
        re.setFechanacimiento(new Date());
        re.setTelefono(569419194);
        re.setEdad(19);
        
        System.out.println("Registro Usuario: "+ re.getDescripcion());
        
        System.out.println("Ingreso de Equipos");
        Equipos eq = new Equipos();
        eq.setCodigo("SHA1002");
        eq.setNombreclub("Los Manquitos");
        eq.setNombrefun("donwe");
        eq.setLema("Morimos como hombres o vivimos como cobardes");
        eq.setValors(1200);
        eq.setColor("Magenta");
        eq.setFundacion("weboneitor");
        eq.setPais("Isla Tiki Tiki");
        
        
        
    }
    
}
