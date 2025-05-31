package org.utl.sgc.vista;
import java.util.Scanner;
import org.utl.sgc.controlador.DeterminadoraCredito;
import org.utl.sgc.modelo.Cliente;

public class Main {
    public static void main(String[] args) {
        String nombreCliente="";
        String fechaNacimiento="";
        char generoCliente;
        int numeroHijos=0;
        int indice=0;
        double ingresoMensual=0;
        double creditoSolicitado=0;
        String estado="";
        Scanner leer= new Scanner(System.in);
        do{
        System.out.println("Ingresa el nombre del cliente: ");
        nombreCliente=leer.nextLine();
        System.out.println("Ingresa la fecha de nacimiento del cliente: ");
        fechaNacimiento=leer.nextLine();
        System.out.println("Ingresa el genero del cliente (M: masculino, F: femenino, O: otro): ");
        generoCliente=leer.next().charAt(0);
        System.out.println("Ingresa el numero de hijos del cliente: ");
        numeroHijos=leer.nextInt();
        System.out.println("Ingresa el salario mensual del cliente: ");
        ingresoMensual=leer.nextDouble();
        System.out.println("Ingresa el credito solicitado: ");
        creditoSolicitado=leer.nextDouble();
        Cliente postulante = new Cliente(nombreCliente, fechaNacimiento, generoCliente, numeroHijos, ingresoMensual, creditoSolicitado);
        DeterminadoraCredito credito = new DeterminadoraCredito();
        estado=credito.otorgadoraCredito(postulante);
        System.out.println("//////////////Solicitud//////////////");
        System.out.println(">Nombre del cliente: "+postulante.getNombreCliente());
        System.out.println(">Fecha de nacimiento: "+postulante.getFechaNacimiento());
        System.out.println(">Genero del cliente: "+postulante.getGeneroCliente());
        System.out.println(">Numero de hijos del cliente: "+postulante.getNumeroHijos());
        System.out.println(">Salario mensual del cliente: "+postulante.getIngresoMensual());
        System.out.println(">Credito solicitado: "+postulante.getCreditoSolicitado());
        System.out.println(">Estado del credito: "+estado);
        System.out.println("/////////////////////////////////////");
        System.out.println("¿Deseas ingresar otro cliente?");
        System.out.println("1-Si");
        System.out.println("2-No");
        indice=leer.nextInt();
        }
        while(indice!=2);
    }
}
