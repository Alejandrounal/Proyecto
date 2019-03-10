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
public class Persona {
    private String nombres;
    private String usuario;
    private String contrasena;
    private int identificacion;
    private int edad;
    private Date FechaNacimiento;
    private Date FechaExpedicion;
    private String direccionResidencia;
    private int numCelular;
    private String correo;

    public Persona(String nombres, String usuario, String contrasena, int identificacion, int edad, Date FechaNacimiento, Date FechaExpedicion, String direccionResidencia, int numCelular, String correo) {
        this.nombres = nombres;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.identificacion = identificacion;
        this.edad = edad;
        this.FechaNacimiento = FechaNacimiento;
        this.FechaExpedicion = FechaExpedicion;
        this.direccionResidencia = direccionResidencia;
        this.numCelular = numCelular;
        this.correo = correo;
    }
    
    
}
