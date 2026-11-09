package cl.duoc.llanquihuetour.app;

import cl.duoc.llanquihuetour.model.Cliente;
import cl.duoc.llanquihuetour.model.Direccion;
/** Sistema LLanquihue tour para colaboraores y clientes
 * primero instanciamos las direcciones para los clientes
 * segundo instanciamos a los clientes
 * tercer lugar mostramos de manera legible por consola */

public class Main {

    public static void main (String[] args){
        // Instanciamos las direcciones de los clientes
        Direccion dir1 = new Direccion("Av Los Libertadores", "2401", "Llanquihue");
        Direccion dir2 = new Direccion("Hotel Llanquihue", "105", "Llanquihue");
        Direccion dir3 = new Direccion("Hotel Santiago", "1045", "Llanquihue");

        // Instanciamos los clientes
        // Pasamos: nombre, teléfono, el objeto dirección, rut, nacionalidad e idioma
        Cliente cliente1 = new Cliente("Daniel Madrid", "+56912345678", dir3, "17654321-K", "Chilena", "Español,Portugués e Ingles");
        Cliente cliente2 = new Cliente("João Silva", "+552199999999", dir2, "12345678-9", "Brasileña", "Portugués");
        Cliente cliente3 = new Cliente("Ana Rojas", "+54987654321", dir1, "19876543-2", "Argentina", "Español");

        // Mostramos por consola
        System.out.println("=== REGISTROS DE LLANQUIHUE TOUR ===");
        System.out.println(cliente1.toString());
        System.out.println(cliente2.toString());
        System.out.println(cliente3.toString());


    }


}

