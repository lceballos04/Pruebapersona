/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repaso_Servicio;

import Repaso_Modelo.Persona;
import java.util.List;

/**
 *
 * @author eceba
 */
public interface PersonaService {
    public abstract void Crear(Persona persona);
    public abstract List<Persona> listar();
    
}
