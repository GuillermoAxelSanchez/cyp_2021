package mx.unam.aragon.fes;

/**
 *
 * @author GUILLERMO AXEL SANCHEZ OJEDA
 */
public class Empleado extends Persona {

    private int numeroEmpleado;
    private String departamento;
    private float sueldo;
    private int horasExtras;
    private Direccion domicilio;

    public Empleado() {
    }

    public Empleado(int numeroEmpleado, String departamento, float sueldo, int horasExtras, Direccion domicilio) {
        this.numeroEmpleado = numeroEmpleado;
        this.departamento = departamento;
        this.sueldo = sueldo;
        this.horasExtras = horasExtras;
        this.domicilio = domicilio;
    }

    public Empleado(int numeroEmpleado, String departamento, float sueldo, int horasExtras, Direccion domicilio, String nombre, String apMaterno, String apPaterno, int edad, String curp) {
        super(nombre, apMaterno, apPaterno, edad, curp);
        this.numeroEmpleado = numeroEmpleado;
        this.departamento = departamento;
        this.sueldo = sueldo;
        this.horasExtras = horasExtras;
        this.domicilio = domicilio;
    }

    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    public Direccion getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Direccion domicilio) {
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return "Empleado{" + "numeroEmpleado=" + numeroEmpleado + ", departamento=" + departamento + ", sueldo=" + sueldo + ", horasExtras=" + horasExtras + ", domicilio=" + domicilio + '}';
    }

    public float calcularSueldo() {
        //Horas extras a 150 pesos
        float sueldoTotal = 0.0f;
        sueldoTotal = this.sueldo + (this.horasExtras * 150.0f);
        return sueldoTotal;
    }

}
