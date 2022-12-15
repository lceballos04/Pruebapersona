/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repaso_Modelo;

/**
 *
 * @author eceba
 */
public class Persona {

    private String nombre;
    private String lugarNacimiento;
    private String sexo;
    private String profesion;
    private int cedula;
    private int edad;

    public Persona(String nombre, String lugarNacimiento, String sexo, String profesion, int cedula, int edad) {
        this.nombre = nombre;
        this.lugarNacimiento = lugarNacimiento;
        this.sexo = sexo;
        this.profesion = profesion;
        this.cedula = cedula;
        this.edad = edad;
    }

    public String calcularEdad() {
        var retorno = "";
        if (this.edad < 12) {
            retorno += "Esta chiquito";

        } else {
            if (this.edad > 12 && this.edad < 18) {
                retorno += "Esta chavo";
            } else {
                retorno += " Ya no le falta mucho :(";
            }

        }
        return retorno;
        
    }

    public String calcularSexo() {
        var retorno = "";
        switch (sexo) {
            case "MASCULINO":
                retorno += "Se considero un Minito";
                break;

            case "FEMENINO":
                retorno += "Se considero un MinitA";
                break;
        }
        return retorno;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", lugarNacimiento=" 
                + lugarNacimiento + ", sexo=" + sexo + ", profesion="
                + profesion + ", cedula=" + cedula + ", edad=" + edad +
                " Segun su edad= "+this.calcularEdad()+" Segun su sexo= "+
                this.calcularSexo()+'}';
    }

}
