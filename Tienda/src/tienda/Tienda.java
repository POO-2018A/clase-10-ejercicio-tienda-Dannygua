
package tienda;

public class Tienda {

   String nombre;
   String direccion;
   String ruc;

    public Tienda(String nombre, String direccion, String ruc) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ruc = ruc;
    }


    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getRuc() {
        return ruc;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }
}

