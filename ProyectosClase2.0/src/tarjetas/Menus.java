package tarjetas;
public class Menus {
    
    public void m1(){
    
        System.out.println("+----------------+");
        System.out.println("| Menu principal |");
        System.out.println("+----------------+");
        
        String[] m1={"Salir", "Utilizar tarjeta"};
        
        for (int i = 0; i < m1.length; i++) {
            System.out.println(i+". "+m1[i]);
        }
        System.out.print("Opcion: ");
    
    }
    
    public void m2(){
    
        System.out.println("+----------+");
        System.out.println("| Tarjetas |");
        System.out.println("+----------+");
    
        String[] m2={"Salir", "Credito", "Debito"};
        
        for (int i = 0; i < m2.length; i++) {
            System.out.println(i+". "+m2[i]);
        }
        System.out.print("Opcion: ");
    }
    
    public void m3(){
    
        System.out.println("+----------+");
        System.out.println("| Acciones |");
        System.out.println("+----------+");
        
        String[] m3={"Salir", "Mostrar movimientos", "Realizar pago", "Pagar credito"};
    
        for (int i = 0; i < m3.length; i++) {
            System.out.println(i+". "+m3[i]);
        }
        System.out.print("Opcion: ");
    }
    
}
