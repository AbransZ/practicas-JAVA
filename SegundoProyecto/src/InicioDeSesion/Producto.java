
package InicioDeSesion;


public class Producto {
    private int Codigo;
    private String Nombre;
    private int Cantidad;
    private String Talla;
    private double PRecioUnitario;
    private double PrecioTotal;
    private int estado;

    public Producto() {
        this.Codigo=0;
        this.Nombre="";
        this.Cantidad=0;
        this.Talla="";
        this.PRecioUnitario=0;
        this.PrecioTotal=0;
        this.estado=0;
    }

    public Producto(int Codigo, String Nombre, int Cantidad,String Talla, double PRecioUnitario, double PrecioTotal, int estado) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Cantidad = Cantidad;
        this.Talla=Talla;
        this.PRecioUnitario = PRecioUnitario;
        this.PrecioTotal = PrecioTotal;
        this.estado = estado;
    }
    

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getTalla() {
        return Talla;
    }

    public void setTalla(String Talla) {
        this.Talla = Talla;
    }

    public double getPRecioUnitario() {
        return PRecioUnitario;
    }

    public void setPRecioUnitario(double PRecioUnitario) {
        this.PRecioUnitario = PRecioUnitario;
    }

    public double getPrecioTotal() {
        return PrecioTotal;
    }

    public void setPrecioTotal(double PrecioTotal) {
        this.PrecioTotal = PrecioTotal;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "CabeceraTabla{" + "Codigo=" + Codigo + ", Nombre=" + Nombre + ", Cantidad=" + Cantidad +", Talla="+ Talla + ", PRecioUnitario=" + PRecioUnitario + ", PrecioTotal=" + PrecioTotal + ", estado=" + estado + '}';
    }
    
    
    
}
