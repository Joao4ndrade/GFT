import java.util.*;
import java.io.IOException;

public class ProjetoGFT {
    public static void main(String[] args) {
        cachorro Xereta = new cachorro();
        Xereta.peso = 10;
        Xereta.setNome("Xereta");
        Xereta.QuantidadeDeRacao();
        gato Artemis = new gato();
        Artemis.peso = 3;
        Artemis.setNome("Artemis");
        Artemis.QuantidadeDeRacao();
        gato VictorHugo = new gato();
        VictorHugo.peso = 5;
        VictorHugo.setNome("Victor Hugo");
        VictorHugo.QuantidadeDeRacao();
        gato Daphane = new gato();
        Daphane.peso = 20;
        Daphane.setNome("Daphane");
        Daphane.QuantidadeDeRacao();
        int somaracao = Xereta.racao + VictorHugo.racao + Artemis.racao + Daphane.racao;
        System.out.println("a soma do peso das rações é igual a: " + somaracao );
    }
}