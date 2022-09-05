package edd.empresa;

/**
 *
 * @author Arman
 */
public class Trabajador {

    private int IdTrabajador;
    private String Nombre;
    private String Paterno;
    private String Materno;
    private int Extras;
    private int Sueldo;
    private int Ingreso;
    private int Antiguedad;
    private double PagoTotalAntiguedad;
    double PagoHorasExtra = 276.5;

    public Trabajador(int ID, String Nom, String Pat, String Mat, int Ex, int Sue, int Ing) {
        this.IdTrabajador = ID;
        this.Paterno = Nom;
        this.Materno = Pat;
        this.Extras = Ex;
        this.Sueldo = Sue;
        this.Ingreso = Ing;

    }

    public double CalculoSueldo() {
        int Antiguedad = 2022 - this.Ingreso;
        PagoTotalAntiguedad = this.Sueldo + (this.Sueldo * (Antiguedad * 0.03) + this.Extras * PagoHorasExtra);

        return PagoTotalAntiguedad;

    }

    public int getIdTrabajador() {
        return IdTrabajador;
    }

    public void setIdTrabajador(int IdTrabajador) {
        this.IdTrabajador = IdTrabajador;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPaterno() {
        return Paterno;
    }

    public void setPaterno(String Paterno) {
        this.Paterno = Paterno;
    }

    public String getMaterno() {
        return Materno;
    }

    public void setMaterno(String Materno) {
        this.Materno = Materno;
    }

    public int getExtras() {
        return Extras;
    }

    public void setExtras(int Extras) {
        this.Extras = Extras;
    }

    public int getSueldo() {
        return Sueldo;
    }

    public void setSueldo(int Sueldo) {
        this.Sueldo = Sueldo;
    }

    public int getIngreso() {
        return Ingreso;
    }

    public void setIngreso(int Ingreso) {
        this.Ingreso = Ingreso;
    }

    @Override
    public String toString() {
        return "Trabajador{" + "IdTrabajador=" + IdTrabajador + ", Nombre=" + Nombre + ", Paterno=" + Paterno + ", Materno=" + Materno + ", Extras=" + Extras + ", Sueldo=" + Sueldo + ", Ingreso=" + Ingreso + '}';
    }

}
