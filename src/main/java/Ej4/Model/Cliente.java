package Ej4.Model;

import Ej4.CodigoRandom;

import java.util.Date;

public abstract class Cliente {

    //Atributos de clase.
    private String nombre;
    private String apellido;
    private Date fechaNacimiento; //En formato de tipo date, uso de día, mes y año obligatorio.
    private String telefono;
    private String dni;
    private String codigo;
    private float descuento;
    private CodigoRandom codigoRandom;


    //Metodo constructor
    public Cliente(String nombre, String apellido, Date fechaNacimiento, String telefono, String dni, String codigo, float descuento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.dni = dni;
        this.codigo = codigoRandom.generateRandomString(10);
        this.descuento = descuento;
    }

    //Getters & Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    //toString
    @Override
    public String toString() {
        return "Cliente: " +
                "nombre: " + getNombre() + '\'' +
                ", apellido: " + getApellido() + '\'' +
                ", fechaNacimiento: " + getFechaNacimiento() +
                ", telefono: " + getTelefono() + '\'' +
                ", dni: " + getDni() + '\'' +
                ", codigo: " + getCodigo() + '\'' +
                ", descuento: " + getDescuento();
    }
}
