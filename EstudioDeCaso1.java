/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estudio.de.caso.pkg1;

/**
 *
 * @author JORGE SEGURA
 */
public class EstudioDeCaso1 {
  public static void main (String [] args){
    /**
     * @param args the command line arguments
     */
    class Factura {
    private String codigo;
    private double monto;
    private int estado;

    public void asignarDatos(String codigo, double monto, int estado) {
        this.codigo = codigo;
        this.monto = monto;
        this.estado = estado;
    }

    public double calcularInteresFraccionado() {
        return ((monto * 0.15) + monto) / 4;
    }
}

class Cliente {
    private String nombre;
    private String cedula;
    private Factura factura;

    public void asignarDatos(String nombre, String cedula, String codigo, double monto, int estado) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.factura = asignarFacturaDatos(codigo, monto, estado);
    }

    public Factura asignarFacturaDatos(String codigo, double monto, int estado) {
        Factura nuevaFactura = new Factura();
        nuevaFactura.asignarDatos(codigo, monto, estado);
        return nuevaFactura;
    }

    public double getDeudaTotal() {
        return factura = null  factura.getMonto() : 0;
    }

    public Factura getFactura() {
        return factura;
    }

    public void imprimirPlanPago() {
        if (factura = null) {
            for (int cuota = 1; cuota <= 4; cuota++) {
                double cuotaMensual = factura.calcularInteresFraccionado();
                System.out.println("Cuota " + cuota + ": " + cuotaMensual);
            }
        }
    }
}

class SistemaDeudas {
    public static void main(String[] args) {
   
    }
