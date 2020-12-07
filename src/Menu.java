import java.util.Scanner;

public class Menu {

    private Scanner herencia = new Scanner (System.in);

    private int contador= 0;
    public void menu () {
        System.out.println(" ingrese opcion\n1:Car\n2:Truck\n3:Bike");

        switch (herencia.nextInt()) {

            case 1:
                herencia.nextLine();
                car C = new car(auto(),auto(), auto(),auto(),auto(),Cauto(),Cauto(),Cauto());
                System.out.println(C.toString());
                break;

            case 2:
                herencia.nextLine();
                truck d = new truck(auto(),auto(),auto(),auto(),auto(),camion(),camion(),camion(),giros(),giros());
                System.out.println(d.toString());
                break;

            case 3:
                herencia.nextLine();
                bike e = new bike( bicicleta1(), bicicleta1(),bicicleta1(),bicicleta1(),bicicleta(),bicicleta(),bicicleta(),bicicleta());
                System.out.println(e.toString());
                break;

            case 4:
                System.out.println(" Salir del sistema, hasta pronto");
                break;

            default:
                System.out.println("Numero incorrecto, ingrese nuevamente");
                menu();
                break;

        }

    }

    private String bicicleta1() {
        String[] otrosAtributos = {"marca",  "modelo", "color", "asiento"};
        System.out.println(" Ingrese " + otrosAtributos[contador] + ":" );
        contador++;
        if (contador>= otrosAtributos.length){contador=0;}
        return herencia.nextLine();
    }

    private int bicicleta() {
        String[] otrosAtributos = {"ruedas", "manilla", "pedales", "cadena"};
        System.out.println(" Ingrese " + otrosAtributos[contador] + ":" );
        contador++;
        if (contador>= otrosAtributos.length){contador=0;}
        return herencia.nextInt();
    }

    private String giros() {
        String[] otrosAtributos = {"turn left", " turn right"};
        System.out.println(" Ingrese " + otrosAtributos[contador] + ":" );
        contador++;
        if (contador>= otrosAtributos.length){contador=0;}
        return herencia.next();
    }

    private int camion() {
        String[] otrosAtributos = {"ruedas", "capacidad de carga", "aceleracion"};
        System.out.println(" Ingrese " + otrosAtributos[contador] + ":" );
        contador++;
        if (contador>= otrosAtributos.length){contador=0;}
        return herencia.nextInt();
    }

    private int Cauto() {
        String[] otrosAtributos = {"ruedas","kilometraje","año de Fabricacion" };
        System.out.println(" Ingrese " + otrosAtributos[contador] + ":" );
        contador++;
        if (contador>= otrosAtributos.length){contador=0;}
        return herencia.nextInt();
    }

    private String auto() {

        String[] otrosAtributos = {"Marca", " Modelo", "Tipo combistible", "Motor", "Color"};
        System.out.println(" Ingrese " + otrosAtributos[contador] + ":" );
        contador++;
        if (contador>= otrosAtributos.length){contador=0;}
        return herencia.nextLine();

    }
}
