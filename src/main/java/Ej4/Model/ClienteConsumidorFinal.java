package Ej4.Model;

import Ej4.Model.Cliente;

import java.util.Date;

public class ClienteConsumidorFinal extends Cliente {

    //Constructor
    public ClienteConsumidorFinal(String nombre, String apellido, Date fechaNacimiento, String telefono, String dni, String codigo, float descuento){
        super(nombre, apellido, fechaNacimiento, telefono, dni, codigo, descuento);
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    @Override
    public String getApellido() {
        return super.getApellido();
    }

    @Override
    public void setApellido(String apellido) {
        super.setApellido(apellido);
    }

    @Override
    public Date getFechaNacimiento() {
        return super.getFechaNacimiento();
    }

    @Override
    public void setFechaNacimiento(Date fechaNacimiento) {
        super.setFechaNacimiento(fechaNacimiento);
    }

    @Override
    public String getTelefono() {
        return super.getTelefono();
    }

    @Override
    public void setTelefono(String telefono) {
        super.setTelefono(telefono);
    }

    @Override
    public String getDni() {
        return super.getDni();
    }

    @Override
    public void setDni(String dni) {
        super.setDni(dni);
    }

    @Override
    public String getCodigo() {
        return super.getCodigo();
    }

    @Override
    public void setCodigo(String codigo) {
        super.setCodigo(codigo);
    }

    @Override
    public float getDescuento() {
        return super.getDescuento();
    }

    @Override
    public void setDescuento(float descuento) {
        super.setDescuento(descuento);
    }

    //toString
    @Override
    public String toString() {
        return super.toString();
    }
}
