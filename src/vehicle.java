public class vehicle {

    protected String marca;
    protected String modelo;
    protected String tipoCombustible;
    protected String motor;
    protected String color;
    protected int ruedas;

    public vehicle (String marca, String modelo, String tipoCombustible, String motor, String color, int ruedas) {

    this.marca=marca;
    this.modelo=modelo;
    this.tipoCombustible=tipoCombustible;
    this.motor=motor;
    this.color=color;
    this.ruedas=ruedas;

}
    public vehicle (String marca, String modelo,  String color, int ruedas) {

        this.marca=marca;
        this.modelo=modelo;
        this.color=color;
        this.ruedas=ruedas;

    }

 }
