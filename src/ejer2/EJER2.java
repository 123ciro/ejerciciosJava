/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer2;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
/**
 *
 * @author lab220-20
 */
public class EJER2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        Date hoy = new Date();
        final double interesP = 0.36;
        double prestamo, interesG, valor, valorto;
        String cliente;
        System.out.println("Ingresar el Nombre del Cliente");
        cliente = ingreso.nextLine();
        System.out.println("======");
        System.out.println("Ingrese el Monto del Prestamo ");
        prestamo = ingreso.nextDouble();
        System.out.println("======");
        interesG = prestamo * interesP;
        valorto = (prestamo + interesG);
        valor = (prestamo + interesG) / 48;
        calculofechaPago(hoy,48,30,valor,cliente);
    }
    
       public static Date[] calculofechaPago(Date fecha, int mes, int dias, double valor, String nombre) {
        Calendar calendar = Calendar.getInstance();
        Date fechas[] = new Date[mes];
        SimpleDateFormat format1 = new SimpleDateFormat("dd-MM-yyyy");
        calendar.setTime(fecha);
        for (int i = 0; i < mes; i++) {
            calendar.add(Calendar.DAY_OF_YEAR, dias);
            fechas[i] = calendar.getTime();
            System.out.println("El cliente " + nombre + " debera abonar la cuota " + i + " --> " + valor + " en fecha " + format1.format(fechas[i]));
            if (fechas[i].equals(mes)) {
                break;
            }
        }
        return fechas;
    }
      
}
