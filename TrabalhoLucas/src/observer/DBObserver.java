/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;

/**
 *
 * @author Kaique
 */
public class DBObserver implements Observer {
    @Override
    public void atualizar(int quantidade) {
        // Código para atualizar o banco de dados
        System.out.println("Banco de Dados atualizado com a quantidade: " + quantidade);
    }
}
