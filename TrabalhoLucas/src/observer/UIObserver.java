/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;

/**
 *
 * @author Kaique
 */
public class UIObserver implements Observer {
    
    @Override
    public void atualizar(int quantidade) {
        // Código para atualizar a interface do usuário
        System.out.println("UI atualizada com a quantidade: " + quantidade);
    }
}

