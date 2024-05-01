package src;

import java.time.Duration;

public class Tramo {
    private static final int factorMinutosPorMetro = 2; // Factor de cantidad de tiempo por distancia
    public Duration demora(){
        return Duration.ofMinutes((long) factorMinutosPorMetro * distancia());
    }

    public int distancia(){
        int llamadoAPI = 10; //TODO Donde se llama la Distance Matrix API
        return llamadoAPI;
    }
}
