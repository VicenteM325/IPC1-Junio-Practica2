package src;
import java.util.Scanner;

public class PracticaPelis{

       public static void main(String args[]){
              PracticaPelis t = new PracticaPelis();
       }
              
              int opcion, contadorPelicula = 0, contadorCliente = 0, contadorPrestacion = 0;
              //opcion switch y peliculas
              int [] creacion = new int [30];
              int [] id = new int [30];
              String [] categoria = new String [30];
              String [] nombre = new String[30];
              String [] peliculasTerror = new String[6];
              String [] peliculasComedia = new String[6];
              String [] peliculasAccion = new String[6];
              String [] peliculasFantasia = new String[6];
              boolean [] disponible = new boolean[30];
              // Clientes
              String [] nombreCliente = new String[30];
              int [] idCliente = new int[30];
              int [] telefonoCliente = new int[30];
              boolean [] estadoCliente = new boolean [30];
              //Prestamo peliculas
              int [] diasPrestamo = new int [30];
              Scanner entrada = new Scanner(System.in);

       public PracticaPelis(){
              menu();
       }

       public void menu(){
              do{
                     System.out.println(" ---Menu de Opciones--- ");
                     System.out.println("1. Prestamo de Peliculas");
                     System.out.println("2. Devolución de Peliculas");
                     System.out.println("3. Mostrar las Peliculas");
                     System.out.println("4. Ingreso de Peliculas");
                     System.out.println("5. Orden de Peliculas");
                     System.out.println("6. Mostrar Clientes");
                     System.out.println("7. Ingreso de Clientes");
                     System.out.println("8. Reportes");
                     System.out.println("9. Salir");
                     System.out.print("Elija opción: ");
                     opcion = entrada.nextInt();

              switch (opcion) {
                case 1:
                     System.out.println("----------------PRESTAMO DE PELICULAS----------------");
                    // prestamoPeliculas(id, disponible); 
                       prestaPeliculas(id,idCliente, disponible, estadoCliente);
                       break;
                case 2:
                     System.out.println("----------------DEVOLUCION DE PELICULAS----------------");
                     devolucionPeliculas(nombreCliente, nombre, estadoCliente, disponible);
                       break;
                case 3:
                     System.out.println("-----------------PELICULAS EXISTENTES----------------");
                     mostrarPeliculas(id, nombre, creacion, categoria, disponible);
                       break;
                case 4:
                     System.out.println("----------------INGRESO DE PELICULAS-----------------");
                     ingresoPeliculas(id, nombre, creacion, categoria, disponible);
                       break;
                case 5:
                     System.out.println("----------------ORDEN DE PELICULAS-----------------");
                     imprimirOrden(nombre);
                       break;
                case 6:
                     System.out.println("----------------CLIENTES EXISTENTES-----------------");
                     mostrarUsuario(nombreCliente,idCliente,telefonoCliente,estadoCliente);
                       break;
                case 7:
                     System.out.println("----------------INGRESO DE CLIENTES-----------------");
                     crearUsuarios(nombreCliente,idCliente,telefonoCliente,estadoCliente);
                       break;
                case 8:
                     System.out.println("----------------REPORTES-----------------");
                       break;
                case 9:
                     System.out.println("----------------PROCESO FINALIZADO-----------------");
                       break;
              }
        }while(opcion != 9); 

        
    }
       //Metodo ingreso de peliculas nuevas
       public void ingresoPeliculas(int[] id, String[] nombre, int []creacion, String[] categoria, boolean[] disponible){
           int cantidad;
           System.out.print("Cuantas peliculas desea ingresar: ");
           cantidad = entrada.nextInt();
           for(int i = 0; i < cantidad; i++){
                  System.out.print("\nId generado [" + (contadorPelicula+1) + "] porfavor introzucalo: " );
                  id[contadorPelicula] = entrada.nextInt();
                  System.out.print("\nIngrese el nombre de la pelicula: ");
                  nombre[contadorPelicula] = entrada.next();
                  System.out.print("\nIngrese el año de la pelicula: ");
                  creacion[contadorPelicula] = entrada.nextInt();
                  System.out.print("\nIngrese la categoría de la pelicula: ");
                  categoria[contadorPelicula] = entrada.next();
                  disponible[contadorPelicula] = true;
                  contadorPelicula++;                   
           }
         
       }
       //Metodo mostrar todos los datos de las peliculas
       public void mostrarPeliculas(int[] id, String[] nombre, int []creacion, String[] categoria, boolean[] disponible){
              for(int i = 0; i < contadorPelicula; i++){
              
                  System.out.println("Id: " + id[i] +" |||  Nombre: " +  nombre[i] + " |||  Año: " + creacion[i] 
                                    + " |||  Categoria: " + categoria[i] + " |||  Disponibilidad: " + disponible[i]);   
                  
              }

       }
       //modulo para registrar usuarios
       public void crearUsuarios(String [] nombreCliente, int [] idCliente, int [] telefonoCliente, boolean []estadoCliente){

              int cantidad;
              System.out.print("Cuantos clientes desea registrar: ");
              cantidad = entrada.nextInt();
              for(int i = 0; i < cantidad; i++){
                  System.out.print("\nIngrese nombre cliente: " );
                  nombreCliente[contadorCliente] = entrada.next();
                  System.out.print("\nId generado [" + (contadorCliente+1) + "] por favor introduzcalo : ");
                  idCliente[contadorCliente] = entrada.nextInt();
                  System.out.print("\nIngrese el numero de telefono: ");
                  telefonoCliente[contadorCliente] = entrada.nextInt();
                  estadoCliente[contadorCliente]= true;
                  contadorCliente++;                   
           }               
       }
       //modulo para mostrar usuarios
       public void mostrarUsuario(String [] nombreCliente, int [] idCliente, int [] telefonoCliente, boolean []estadoCliente){
              for(int i = 0; i < contadorCliente; i++){
              
                  System.out.println("Nombre: " + nombreCliente[i] +" |||  Id: " +  idCliente[i] + " |||  Tel: " + telefonoCliente[i] 
                                    + " |||  Estado: " +  estadoCliente[i]);      
              }
       }
       public void prestaPeliculas(int [] id, int [] idCliente, boolean [] disponible, boolean[] estadoCliente){
              int pelicula, cliente;
              System.out.print("Ingrese id pelicula: ");
              pelicula = entrada.nextInt();
              System.out.print("Ingrese id Cliente: ");
              cliente = entrada.nextInt();
              System.out.print("Por cuantos días se alquilará: ");
              diasPrestamo[contadorPrestacion] = entrada.nextInt();
              for(int i = 0; i < id.length; i++){
                     for(int j = 0; j < idCliente.length; j++){
                         if(id[i] == pelicula & idCliente[j] == cliente){
                            System.out.println("Pelicula existente");
                            System.out.println("Cliente existente");
                            System.out.println("Alquiler exitoso");
                            disponible[i] = false;
                            estadoCliente[j] = false;
                            contadorPrestacion++;

                         } 
                     }
                   
              }
              System.out.println("El estado de la pelicula con id: " + pelicula + " se ha cambiado, al igual que el cliente con id: " + cliente);
              System.out.println("La pelicula se ha alquilado por " + diasPrestamo[contadorPrestacion] + " dias.");
       }

       public void devolucionPeliculas(String[] nombreCliente, String[] nombre, boolean[] estadoCliente,boolean[] disponible){
              int cliente, pelicula;
              System.out.print("Ingrese el id del cliente: ");
              cliente = entrada.nextInt();
              System.out.print("Ingrese el id de la pelicula: ");
              pelicula = entrada.nextInt();
              for(int i = 0; i < idCliente.length; i++){
                     for(int j=0; j < id.length; j++){
                            if(idCliente[i] == cliente  & id[j] == pelicula){
                            System.out.println(" El nombre del cliente es: " + nombreCliente[i] + " y el nombre de la pelicula es: " + nombre[j]);
                            estadoCliente[i] = true;
                            disponible[j] = true;
                            }
                     }
              }
              System.out.println("El estado del cliente y la pelicula ha cambiado.");
       }
}
 

