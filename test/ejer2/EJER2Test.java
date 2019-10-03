/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer2;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author CIRO
 */
public class EJER2Test {

    public EJER2Test() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class EJER2.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        EJER2.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public Date[] calculofechaPago(Date fecha, int mes, int dias, double valor) {

        Calendar calendar = Calendar.getInstance();
        Date fechas[] = new Date[mes];
        SimpleDateFormat format1 = new SimpleDateFormat("dd-MM-yyyy");

        calendar.setTime(fecha);
        String formatted = format1.format(fecha);        

        for (int i = 0; i < mes; i++) {
            calendar.add(Calendar.DAY_OF_YEAR, dias);
            fechas[i] = calendar.getTime();
            System.out.println("Valor de la cuota " + i + " --> " + valor + " en fecha " + format1.format(fechas[i]));
            if (fechas[i].equals(mes)) {
                break;
            }

        }

//int i = 0;
//        while (true) {
//            
//            i++; 
//            if (i != mes) {
//                calendar.add(Calendar.DAY_OF_YEAR, 30);
//                fechas[i] = calendar.getTime();
//                
//            } else {
//                
//                break;
//            }
//        }
        return fechas;
    }

    @Test
    public void Test() {
        Date fecha = new Date();

        calculofechaPago(fecha, 5, 30, 5000.0);
    }

}
