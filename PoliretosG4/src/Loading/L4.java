package Loading;
/* 
    Waiting que inicia en 0  a 100% usar los signos o0o para simular un 
    movimiento de ida y vuelta en el mismo puesto   
        o0o 100% 
*/
public class L4 {
    public void animacion() {
        try {
            for (int i = 0; i <= 100; i += 10) { // Incremento de 10% en cada paso
                // Retrocede al inicio de la línea para sobrescribir
                System.out.print("\r");
    
                // Alternar entre "o0o" y "0o0" para simular el movimiento
                String animation = (i / 10) % 2 == 0 ? "o0o" : "0o0";
                
                // Imprimir animación y porcentaje
                System.out.print(animation + " " + i + "%");
    
                // Pausa para mostrar el efecto de animación
                Thread.sleep(500); // 200 ms de espera para hacer visible el efecto
            }
            System.out.println("\rDone! 100%");
        } catch (InterruptedException e) {
            System.out.println("La animación fue interrumpida.");
        }
    }
}

