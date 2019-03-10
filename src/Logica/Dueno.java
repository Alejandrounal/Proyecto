/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.Date;

/**
 *
 * @author Alejandro
 */
public class Dueno extends Persona{
    
    public Dueno(String nombres, String usuario, String contrasena, int identificacion, int edad, Date FechaNacimiento, Date FechaExpedicion, String direccionResidencia, int numCelular, String correo) {
        super(nombres, usuario, contrasena, identificacion, edad, FechaNacimiento, FechaExpedicion, direccionResidencia, numCelular, correo);
    }
    
}
