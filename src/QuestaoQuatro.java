/*Dois veículos (um carro e um caminhão) saem respectivamente de cidades opostas pela mesma rodovia. O carro de Ribeirão Preto em direção a Franca, a uma velocidade constante de 110 km/h e o caminhão de Franca em direção a Ribeirão Preto a uma velocidade constante de 80 km/h. Quando eles se cruzarem na rodovia, qual estará mais próximo a cidade de Ribeirão Preto?

IMPORTANTE:

a) Considerar a distância de 100km entre a cidade de Ribeirão Preto <-> Franca.

b) Considerar 2 pedágios como obstáculo e que o caminhão leva 5 minutos a mais para passar em cada um deles e o carro possui tag de pedágio (Sem Parar)

c) Explique como chegou no resultado. */

public class QuestaoQuatro {
    public static void main(String[] args) {
        
        //variáveis problema
        int distancia = 100; // km
        int velCarro = 110; // km/h
        int velCaminhao = 80; // km/h
        int tempoPCaminhao = 5; // tempo do pedagio do caminhao minutos
        
        //tempo de viagem de cada
        double tempoCarro = (double) distancia / velCarro;
        double tempoCaminhao = (double) distancia / velCaminhao + 2 * (double) tempoPCaminhao / 60;
        
        // distância de cada veículo quando cruzarem
        double dCarro = velCarro * tempoCarro;
        double dCaminhao = velCaminhao * tempoCaminhao;
        
        // quem está mais perto de Ribeirão Preto
        if (dCarro < dCaminhao) {
            System.out.println("O carro está mais próximo de Ribeirão Preto, com uma distância de " + dCarro + " km");
        } else {
            System.out.println("O caminhão está mais próximo de Ribeirão Preto, com uma distância de " + dCaminhao + " km");
        }
    }
    
}
