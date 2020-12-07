public class car extends vehicle {

     int kilometraje;
     int añoFabricacion;

    public car (String marca,
                String modelo,
                String tipoCombustible,
                String motor,
                String color,
                int ruedas,
                int kilometraje,
                int añoFabricacion){

       super (marca, modelo, tipoCombustible, motor, color, ruedas);
       this.kilometraje=kilometraje;
       this.añoFabricacion=añoFabricacion;

    }

    @Override
    public String toString() {
        return "car{" +
                "kilometraje=" + kilometraje +
                ", añoFabricacion=" + añoFabricacion +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tipoCombustible='" + tipoCombustible + '\'' +
                ", motor='" + motor + '\'' +
                ", color='" + color + '\'' +
                ", ruedas=" + ruedas +
                '}';
    }
}
