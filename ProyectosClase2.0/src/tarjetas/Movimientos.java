package tarjetas;
public class Movimientos {
    
    private String concepto;
    private double importe;
    private String tipo;

    public Movimientos(String concepto, double importe, String tipo) {
        this.concepto = concepto;
        this.importe = importe;
        this.tipo = tipo;
    }

    public String getConcepto() {
        return concepto;
    }

    public double getImporte() {
        return importe;
    }

    public String getTipo() {
        return tipo;
    }
    
    public void mostrar(){
    
        System.out.println("Concepto: "+this.concepto+
                " - Importe: "+this.importe+" - "+" - Tipo: "+this.tipo);
    
    }
    
}
