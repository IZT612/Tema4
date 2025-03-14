package parteCRUD.ejercicio4;
import java.util.Scanner;

/**
 * Clase principal que maneja la interacción con el usuario para gestionar discos.
 * Permite al usuario crear discos, listarlos y borrarlos.
 */
public class Main {

    /**
     * Método principal que maneja el flujo del programa.
     * Permite al usuario elegir entre diferentes opciones para gestionar discos.
     *
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Disco disco = null;

        int codigo;
        String autor;
        String titulo;
        int duracion;
        String genero;
        int opcion;

        do {
            // Presentación del menú al usuario
            System.out.println("Escoge una opción.");
            System.out.println("1. Listado");
            System.out.println("2. Nuevo disco");
            System.out.println("3. Borrar disco");
            System.out.println("4. Salir");
            opcion = sc.nextInt();
            sc.nextLine();
            System.out.println();

            // Elección de la opción
            switch (opcion) {
                case 1 -> {
                    // Mostrar listado de discos
                    DiscoCRUD.listado();
                }

                case 2 -> {
                    // Crear nuevo disco
                    System.out.println("Introduzca el código");
                    codigo = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Introduzca el autor");
                    autor = sc.nextLine();
                    System.out.println("Introduzca el titulo");
                    titulo = sc.nextLine();
                    System.out.println();
                    System.out.println("¿Quiere seguir introduciendo datos?");
                    System.out.println("1. Sí");
                    System.out.println("2. No");
                    opcion = sc.nextInt();
                    sc.nextLine();
                    System.out.println();
                    switch (opcion) {
                        case 1 -> {
                            // Ingresar más datos
                            System.out.println("Introduzca el género");
                            genero = sc.nextLine();
                            System.out.println("Introduzca la duración");
                            duracion = sc.nextInt();
                            sc.nextLine();

                            // Crear el disco con todos los datos
                            disco = new Disco(codigo, autor, titulo, genero, duracion);
                        }

                        case 2 -> {
                            // Crear el disco sin género ni duración
                            disco = new Disco(codigo, autor, titulo);
                        }
                    }

                    // Añadir el disco a la base de datos
                    DiscoCRUD.crearDisco(disco);
                }

                case 3 -> {
                    // Borrar un disco por código
                    System.out.println("Introduzca el código del disco");
                    codigo = sc.nextInt();
                    sc.nextLine();
                    disco = new Disco(codigo, null, null);
                    if (DiscoCRUD.borrarDisco(disco)) {
                        System.out.println("Se ha borrado correctamente");
                    } else {
                        System.out.println("Ha ocurrido algún error");
                    }
                }
            }

            System.out.println();

        } while (opcion != 4); // Continuar hasta que el usuario seleccione salir

        sc.close(); // Cerrar el scanner
    }

}
