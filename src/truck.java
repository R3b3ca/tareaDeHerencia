public class truck extends vehicle {

int capacidadCarga;
int aceleracion;
String turnLeft;
String turnRight;

public truck (String marca,
              String modelo,
              String tipoCombustible,
              String motor,
              String color,
              int ruedas,
              int capacidadCarga,
              int aceleracion,
              String turnLeft,
              String turnRight ){
  super(marca, modelo, tipoCombustible, motor, color, ruedas);

this.capacidadCarga =capacidadCarga;
this.aceleracion=aceleracion;
this.turnLeft=turnLeft;
this.turnRight=turnRight;
}

  @Override
  public String toString() {
    return "truck{" +
            "capacidadCarga=" + capacidadCarga +
            ", aceleracion=" + aceleracion +
            ", turnLeft='" + turnLeft + '\'' +
            ", turnRight='" + turnRight + '\'' +
            ", marca='" + marca + '\'' +
            ", modelo='" + modelo + '\'' +
            ", tipoCombustible='" + tipoCombustible + '\'' +
            ", motor='" + motor + '\'' +
            ", color='" + color + '\'' +
            ", ruedas=" + ruedas +
            '}';
  }
}
