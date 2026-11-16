package cl.duoc.llanquihuetour.ui;

import cl.duoc.llanquihuetour.model.Cliente;
import cl.duoc.llanquihuetour.model.Direccion;
import cl.duoc.llanquihuetour.data.GestorDatos;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;

/** Sistema LLanquihue tour para colaboraores y clientes:
 * <p> Primero Configuramos la ruta del archivo en eñ path</p>
 * <p> Segundo LLamamos a la clase gestor dato con su metodo para cargar la lista </p>
 * <p> tercero imprimimos la lista y despues filtramos por nacionalidad  </p>
 * <p> Tambien se manejan excepciones </p>
 */


public class Main {

    public static void main (String[] args){
        //Ruta para el archivo
        Path ruta = Path.of("src","resources","clientes.txt");
        GestorDatos gestor = new GestorDatos();
        //Cargamos la lista
        try {
            ArrayList<Cliente> listaClientes = gestor.cargarLista(ruta);
            System.out.println("Numero de Clientes Agendados :" + listaClientes.size());

            //Imprime todos los clientes
            for (Cliente cliente : listaClientes) {
                System.out.println(cliente);
            }

            //Filtro de nacionalidad
            System.out.println("=== Clientes con Nacionalidad Chilena ===");
            boolean hayChilenos = false;
            int contador = 0;

            for (Cliente clienteActual : listaClientes) {
                if (clienteActual.getNacionalidad().equalsIgnoreCase("Chileno") ||
                        clienteActual.getNacionalidad().equalsIgnoreCase("Chilena")) {

                    System.out.println(clienteActual);
                    hayChilenos = true;
                    contador++;
                }
            }

            //Verificación si el filtro no encontró a nadie
            if (hayChilenos) {
                System.out.println("Total de clientes con nacionalidad chilena N°" + contador);
            }else {
                System.out.println("No se encontraron clientes con nacionalidad chilena");
            }

        } catch (IOException e) {
            System.err.println("No se pudo leer el archivo " + ruta.toAbsolutePath());
            System.err.println(e.getMessage());
        }






    }


}

