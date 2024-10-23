/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;

/**
 *
 * @author Kaique
 */
public class RelatorioObserver implements Observer {
    @Override
    public void atualizar(int quantidade) {
        // Código para gerar relatório
        System.out.println("Relatório gerado com a quantidade: " + quantidade);
    }
}
