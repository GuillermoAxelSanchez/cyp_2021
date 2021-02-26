
package mx.unam.aragon.fes;

/**
 *
 * @author GUILLERMO AXEL SANCHEZ OJEDA
 */
public class Persona {
    private String nombre;
    private String apMaterno;
    private String apPaterno;
    private int edad;
    private String curp;

    public Persona() {
        
    }

    public Persona(String nombre, String apMaterno, String apPaterno, int edad, String curp) {
        this.nombre = nombre;
        this.apMaterno = apMaterno;
        this.apPaterno = apPaterno;
        this.edad = edad;
        this.curp = curp;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

    public String getApPaterno() {
        return apPaterno;
    }

    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }   

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + "\n apMaterno=" + apMaterno + ",\n apPaterno=" + apPaterno + "\n edad=" + edad + "\n curp=" + curp + '}';
    } 
}
