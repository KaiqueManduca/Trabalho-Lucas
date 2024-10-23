/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kaique
 */
public class Estoque {
    private int quantidade;
    private List<Observer> observadores = new ArrayList<>();

    public void addObservador(Observer observador) {
        observadores.add(observador);
    }

    public void removeObservador(Observer observador) {
        observadores.remove(observador);
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
        notificarObservadores();
    }

    private void notificarObservadores() {
        for (Observer observador : observadores) {
            observador.atualizar(quantidade);
        }
    }
}

