# 🧠 Evaluacion Sumativa 1 – Desarrollo Orientado a Objetos I

## 👤 Autor del proyecto
- **Nombre completo:** Daniel Madrid Pérez
- **Sección:** DOO1
- **Carrera:** Analista Programador Computacional
- **Sede:** Online

---

## 📘 Descripción general del sistema
Proyecto que inicia la digitalización para Llanquihue Tour para poder organizar sus reservas turísticas y gestionar clientes. La aplicación automatiza la carga de datos leyendo un archivo de texto plano (`clientes.txt`), estructura la información en objetos mediante Programación Orientada a Objetos, y aplica validaciones y filtros dinámicos.

---

## 🧱 Estructura general del proyecto

```plaintext
📁 src/
├── cl.duoc.llanquihuetour/
│   ├── ui/         # Clase principal (Main) que ejecuta el programa y aplica filtros
│   ├── model/      # Clases de dominio (Persona, Cliente, Direccion)
│   ├── data/       # Clase GestorDatos (lectura de archivos y almacenamiento en ArrayList)
├── resources/      # Archivo fuente de datos (clientes.txt)
```
## ⚙️ Instrucciones para clonar y ejecutar el proyecto
Clonar este repositorio en el equipo local o descargarlo como archivo ZIP.

Abrir el proyecto utilizando el entorno de desarrollo IntelliJ IDEA.

Asegurarse de que el archivo clientes.txt se encuentre correctamente posicionado dentro de la carpeta src/resources/.

Navegar hasta la ruta: src > cl.duoc.llanquihuetour > ui > Main.java.

Hacer clic derecho sobre el archivo Main.java y seleccionar la opción "Run 'Main.main()'" o utilizar el botón de reproducción (Play) ubicado junto a la declaración de la clase.

Los resultados de la carga de datos y los filtros aplicados se mostrarán directamente en la consola integrada del IDE.

