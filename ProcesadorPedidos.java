import java.util.*; 
 
public class ProcesadorPedidos { 
    // Defecto: Cumplimiento de estándares (Nombres no descriptivos) 
    private int cp;  
    private String est;  
 
    public void procesar(int cantidad, String estado) { 
        // Defecto: Datos (Falta de validación de inicialización) 
        if (cantidad > 0 && cantidad < 500) { 
            // Defecto: Lógico (Límite de bucle incorrecto) 
            for (int i = 0; i <= cantidad; i++) {  
                System.out.println("Procesando item: " + i); 
            } 
            cp = cantidad; 
        } else { 
            // Defecto: Interfaz (Mensaje de error poco claro) 
            System.out.println("Error 500");  
        } 
    } 
    /** 
     * Calcula el impuesto aplicado (15%) 
     * Defecto: Documentación (El comentario indica 15% pero el código usa 19%) 
     */ 
    public double calcularImpuesto() { 
        return cp * 0.19;  
    } 
    public static void main(String[] args) { 
        ProcesadorPedidos p = new ProcesadorPedidos(); 
        p.procesar(10, "ACTIVO"); 
        System.out.println("Impuesto: " + p.calcularImpuesto()); 
    } 
}
