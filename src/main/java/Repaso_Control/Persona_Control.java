/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repaso_Control;

import Repaso_Modelo.Persona;
import Repaso_Servicio.PersonaServiceImpl;
import java.util.List;

/**
 *
 * @author eceba
 */
public class Persona_Control {

    private PersonaServiceImpl personaServiceImpl = new PersonaServiceImpl();

    public String Crear(String[] data) {
        var retorno = "Datos incorrectos";

        var nombre = data[0];
        var lugarNacimiento = data[1];
        var sexo = data[2];
        var profesion = data[3];
        var cedula = Integer.valueOf(data[4]).intValue();
        var edad = Integer.valueOf(data[5]).intValue();

        if (cedula < 0) {
            retorno += "Cedula incorrecta";
        } else {
            if (edad < 0) {
                retorno += "Edad incorrcta";
            } else {
                var persona =new Persona(nombre,lugarNacimiento,sexo,profesion,cedula,edad);
                this.personaServiceImpl.Crear(persona);
                retorno+="Persona= "+persona.getNombre()+"creada correctamente";
            }  
        }

        return retorno;

    }
    public List<Persona> listar(){
        return this.personaServiceImpl.listar();
    }
}
