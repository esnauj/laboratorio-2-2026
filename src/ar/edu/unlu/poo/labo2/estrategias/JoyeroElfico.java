package ar.edu.unlu.poo.labo2.estrategias;

import ar.edu.unlu.poo.labo2.artefactos.Artefacto;

public class JoyeroElfico implements EstrategiaDeMejora{

    // si es `"Amuleto"`, duplica el poder si es $<50$, o incrementa un 25% si es >= 50$.

    @Override
    public void mejorar(Artefacto artefacto) {
        if(artefacto.esDeTipo("Amuleto")){
            if(artefacto.getNivelDePoder() < 50){
                artefacto.incrementarPoderPorcentual(1.0);
            }
            else if(artefacto.getNivelDePoder() >= 50){
                artefacto.incrementarPoderPorcentual(0.25);
            }
        }
    }
}
