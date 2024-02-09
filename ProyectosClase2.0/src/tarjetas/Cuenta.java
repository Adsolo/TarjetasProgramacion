package tarjetas;
public class Cuenta {
    
    private double saldo;
    private Movimientos[] listaMovimientos;
    private int numMovimientos;
    private Tarjeta t=new Tarjeta();

    public Cuenta(double saldo, Movimientos[] listaMovimientos, int numMovimientos) {
        this.saldo = 100;
        this.listaMovimientos = listaMovimientos;
        this.numMovimientos=10;
    }
}
