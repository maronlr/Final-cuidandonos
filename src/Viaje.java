package src;

import java.time.Duration;
import java.util.List;

public class Viaje {
    boolean detenerEnParada;
    List<Tramo> tramos;
    int tramoActual;
    public Duration demora(){
        if(detenerEnParada){
            return tramos.get(tramoActual).demora();
        }
        else{
            Duration aux = Duration.ZERO;
            for(Tramo tramo: tramos){
                aux = aux.plus(tramo.demora());
            }
            return aux;
        }
    }
}
