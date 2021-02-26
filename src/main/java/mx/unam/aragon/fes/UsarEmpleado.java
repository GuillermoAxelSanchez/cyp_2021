package mx.unam.aragon.fes;

/**
 *
 * @author GUILLERMO AXEL SANCHEZ OJEDA
 */
public class UsarEmpleado {
    public static void main(String[] args) {
        Empleado emp1 = new Empleado();
        emp1.setNombre("José");
        emp1.setSueldo(10000.0f);
        emp1.setHorasExtras(10);
        float cobro = emp1.calcularSueldo();
        System.out.println("Ggran total: "+cobro);
        System.out.println(emp1.toString());
    }
}
