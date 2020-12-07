public class bike extends vehicle {

   int manilla;
   String asiento;
   int pedales;
   int cadena;

    public bike(String marca, String modelo, String color, String asiento, int ruedas, int manilla, int pedales, int cadena) {
        super(marca, modelo, color, ruedas);
        this.manilla = manilla;
        this.asiento = asiento;
        this.pedales = pedales;
        this.cadena = cadena;
    }

    @Override
    public String toString() {
        return "bike{" +
                "manilla=" + manilla +
                ", asiento='" + asiento + '\'' +
                ", pedales=" + pedales +
                ", cadena=" + cadena +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", ruedas=" + ruedas +
                '}';
    }
}
