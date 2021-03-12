package Ej4;

public class Producto {

    //Atributos
    private String nombre;
    private String marca;
    private float precioUnitario;
    private int stockActual;
    private String codigo;
    CodigoRandom codigoRandom;

    //Metodo constructor
    public Producto(String nombre, String marca, float precioUnitario, int stockActual, String codigo) {
        this.nombre = nombre;
        this.marca = marca;
        this.precioUnitario = precioUnitario;
        this.stockActual = stockActual;
        this.codigo = codigoRandom.generateRandomString(10);
    }

    //Getters & Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getStockActual() {
        return stockActual;
    }

    public void setStockActual(int stockActual) {
        this.stockActual = stockActual;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Producto: " + getNombre() + "Marca: " + getMarca() + "\nPrecio Unitario: " + getPrecioUnitario()
                + "Stock actual: " + getStockActual() + "\n\tCodigo: " + getCodigo();
    }
}
