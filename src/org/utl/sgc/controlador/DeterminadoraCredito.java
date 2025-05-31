package org.utl.sgc.controlador;
import org.utl.sgc.modelo.Cliente;

public class DeterminadoraCredito {
    public String otorgadoraCredito(Cliente solicitante){
        int hijos = solicitante.getNumeroHijos();
        double credito = solicitante.getCreditoSolicitado();
        double ingreso = solicitante.getIngresoMensual();
        String mensaje = "";
        if(hijos==0){
            if(credito<=ingreso*0.5){
                mensaje = "Aprobado"; 
            }else{
                mensaje = "Denegado";
            }
        }else if(hijos>=1 && hijos<=3){
            if(credito<=ingreso*0.3){
                mensaje = "Aprobado"; 
            }else{
                mensaje = "Denegado";
            }
        }else if(hijos>=4 && hijos<=6){
            if(credito<=ingreso*0.15){
                mensaje = "Aprobado"; 
            }else{
                mensaje = "Denegado";
            }
        }else if(hijos>6){
            if(credito<=ingreso*0.05){
                mensaje = "Aprobado"; 
            }else{
                mensaje = "Denegado";
            }
        }
        return mensaje;
    }
}
