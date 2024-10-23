/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;

/**
 *
 * @author Kaique
 */
public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();

        Observer ui = new UIObserver();
        Observer db = new DBObserver();
        Observer relatorio = new RelatorioObserver();

        estoque.addObservador(ui);
        estoque.addObservador(db);
        estoque.addObservador(relatorio);

        estoque.setQuantidade(100);
    }
}

