
package tienda;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int numeroproductos ;
        int numeroproductosviejos;
        int op;
        int productosnuevos;
        boolean verificador = false ;
        
        Scanner scan= new Scanner(System.in);
        System.out.println("####Datos de la tienda#### \n");
        System.out.print("Nombre: ");
        String nombre = scan.nextLine();
        System.out.print("Direccion: ");
        String direccion = scan.nextLine();
        System.out.print("RUC: ");
        String ruc = scan.nextLine();
        
        System.out.println("\n");
        System.out.println("####Productos#### \n");
        System.out.print("Ingrese el numero de productos: ");
        numeroproductos = scan.nextInt();
        numeroproductosviejos = numeroproductos;
        Productos[] datos = new Productos[100];
        String [] productos = new String [100];

         for(int j=0; j<numeroproductos; j++){
            System.out.println("\n"); 
            System.out.print("Ingrese el nombre del producto " + (j+1) +" : ");
            productos[j]=scan.next();
            scan.nextLine();
            System.out.println("\n");
            System.out.println("Producto " + (j+1) +" : "  + productos[j]);
            System.out.print("Marca: ");
            String marca = scan.nextLine();
            System.out.print("Codigo: ");
            String codigo = scan.nextLine();
            System.out.print("Tipo: ");
            String tipo = scan.nextLine();
            System.out.print("Precio: ");
            double precio = scan.nextInt();
            datos [j]= new Productos(marca,codigo,tipo,precio);
        }      

        do {
            System.out.println("\n");
            System.out.println("####Menu####");
            System.out.println("Ingrese una opcion \n");
            System.out.println("1. Ingresar nuevo producto");
            System.out.println("2. Visualizar lista de productos");
            System.out.println("3. Salir");
            op = scan.nextInt();

            switch (op) {

                case 1: {
                      if (verificador == false){
                      
                          numeroproductos++;
                          verificador = true;
                      
                      }else{
                          numeroproductos++;
                          numeroproductosviejos++;
                      }
                  
                    cambiar(numeroproductos,datos,productos,numeroproductosviejos);

                    break;
                }

                case 2: {
                   
                    mostrar(numeroproductos,datos,productos);
                    
                    break;
                }

                case 3: {

                    System.out.println("Adios");

                    break;
                }

                default: {
                    System.out.println("Opcion no valida");
                }
            }
        }while ( op !=3);

    }
    
    public static void mostrar (int numeroproductos, Productos[] datos, String [] productos){
        System.out.println("\n");
        System.out.println("####Informacion de los productos que ofrece la tienda####\n");

        for (int k=0; k<numeroproductos; k++){
            System.out.println("Producto "+ (k+1) + " : "+ productos[k]);
            System.out.println("Marca: " + datos[k].getMarca());
            System.out.println("Codigo: "  + datos[k].getCodigo());
            System.out.println("Tipo: " + datos[k].getTipo());
            System.out.println("Precio: " +  datos[k].getPrecio());
            System.out.println("\n");

        }

}
    
    public static void cambiar (int numeroproductos, Productos[] datos, String [] productos, int numeroproductosviejos ){
        
        Scanner scan= new Scanner(System.in);
        System.out.println("\n");
           
        System.out.println("####Productos#### \n");
        for(int j=numeroproductosviejos ; j<numeroproductos; j++){
            System.out.print("Ingrese el nombre del producto "+ (j+1)+ " : ");
            productos[j]=scan.next();
            scan.nextLine();
            System.out.println("\n");
            System.out.println("Producto " + (j+1) + ": " + productos[j]);
            System.out.print("Marca: ");
            String marca = scan.nextLine();
            System.out.print("Codigo: ");
            String codigo = scan.nextLine();
            System.out.print("Tipo: ");
            String tipo = scan.nextLine();
            System.out.print("Precio: ");
            double precio = scan.nextInt();
            datos [j]= new Productos(marca,codigo,tipo,precio);
        }      
    }
}

