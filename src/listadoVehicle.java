
import java.util.ArrayList;
import java.util.List;

public class listadoVehicle {

    List listado;

    public listadoVehicle (){
        this.listado = new ArrayList();
    }

   public String agregar( vehicle v ){
        this.listado.add(v);
        return "Ingreso exitoso";
   }
}
