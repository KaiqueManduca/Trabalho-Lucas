/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabalholucas;

/**
 *
 * @author Kaique
 */
public class FactoryMethod {
    // Produto (Interface/Classe Abstrata)
    public abstract static class Produto {
        // métodos do produto
    }

    // Produtos Concretos
    public static class Eletronico extends Produto {
        // implementação específica
    }

    public static class Roupa extends Produto {
        // implementação específica
    }

    public static class Alimento extends Produto {
        // implementação específica
    }

    // Criador (Classe Abstrata)
    public abstract static class Pedido {
        public abstract Produto criarProduto(); // Factory Method
    }

    // Criadores Concretos
    public static class PedidoEletronico extends Pedido {
        public Produto criarProduto() {
            return new Eletronico();
        }
    }

    public static class PedidoRoupas extends Pedido {
        public Produto criarProduto() {
            return new Roupa();
        }
    }

    public static class PedidoAlimentos extends Pedido {
        public Produto criarProduto() {
            return new Alimento();
        }
    }

    // Método Main para testar
    public static void main(String[] args) {
        Pedido pedido1 = new PedidoEletronico();
        Produto produto1 = pedido1.criarProduto();
        System.out.println("Produto criado: " + produto1.getClass().getSimpleName());

        Pedido pedido2 = new PedidoRoupas();
        Produto produto2 = pedido2.criarProduto();
        System.out.println("Produto criado: " + produto2.getClass().getSimpleName());
    }
}

