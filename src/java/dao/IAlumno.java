/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author thene
 */
public interface IAlumno  {
    
    public int agregarAlumno (String nombre,String apellidoPaterno,String apellidoMaterno);
    public int consultarAlumno (int id,String  nombre);
    public int modificarAlumno (String nombre,String apellidoPaterno,String apellidoMaterno);
    public int borrarAlumno (int id);


    
}
