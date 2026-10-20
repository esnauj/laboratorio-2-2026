package ar.edu.unlu.poo.labo2.estrategias;

import ar.edu.unlu.poo.labo2.artefactos.Artefacto;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class EstrategiaCompuesta implements EstrategiaDeMejora{
    private final List<EstrategiaDeMejora> listaEstrategias;


    public EstrategiaCompuesta(EstrategiaDeMejora... estrategias){
        this.listaEstrategias = List.of(estrategias);
    }

    @Override
    public void mejorar(Artefacto artefacto) {
        listaEstrategias.forEach( e -> e.mejorar(artefacto));
    }
}
