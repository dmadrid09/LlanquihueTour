package cl.duoc.llanquihuetour.data;

import cl.duoc.llanquihuetour.model.Cliente;
import cl.duoc.llanquihuetour.model.Direccion;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class GestorDatos {

    public ArrayList<Cliente> cargarLista(Path ruta) throws IOException {
        ArrayList<Cliente> listaClientes = new ArrayList();

        try (BufferedReader lector = Files.newBufferedReader(ruta, StandardCharsets.UTF_8)) {
            String linea;
            int contador = 0;

            while ((linea = lector.readLine()) != null) {
                contador++;
                if (linea.isBlank()) {
                    continue;
                }
                String[] campos = linea.split(";", -1);
                if (campos.length != 8) {
                    System.out.println(" cliente con flata de datos " + " numero cliente: " + contador + " no se agendo ");

                }
                try {
                    String nombre = campos[0].trim();
                    String rut = campos[1].trim();
                    String telefono = campos[2].trim();
                    String calle = campos[3].trim();
                    String numero = campos[4].trim();
                    String comuna = campos[5].trim();
                    String nacionalidad = campos[6].trim();
                    String idioma = campos[7].trim();

                    Direccion direccion = new Direccion(calle, numero, comuna);
                    Cliente cliente = new Cliente(nombre, telefono, direccion, rut, nacionalidad, idioma);

                    listaClientes.add(cliente);

                } catch (IllegalArgumentException e) {
                    System.err.println(" No se llenaron todos los datos " + "linea faltante " + contador + e.getMessage());

                }


            }


        }
        return listaClientes;
    }
}