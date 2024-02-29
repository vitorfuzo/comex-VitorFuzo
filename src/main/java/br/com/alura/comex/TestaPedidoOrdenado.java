package br.com.alura.comex;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaPedidoOrdenado {

    public static void main(String[] args) {
        Produto produto1 = new Produto("Produto A", "Descrição A", 50.0F, 5);
        Produto produto2 = new Produto("Produto B", "Descrição B", 75.0F, 10);
        Produto produto3 = new Produto("Produto C", "Descrição C", 100.0F, 20);
        Produto produto4 = new Produto("Produto D", "Descrição D", 150.0F, 2);
        Produto produto5 = new Produto("Produto E", "Descrição E", 25.0F, 15);

        Cliente cliente = new Cliente("Cliente Exemplo", "000.000.000-00");

        List<Pedido> pedidos = new ArrayList<>();
        pedidos.add(new Pedido(1, cliente, new BigDecimal("200"), 2, produto1, LocalDate.now()));
        pedidos.add(new Pedido(2, cliente, new BigDecimal("150"), 1, produto2, LocalDate.now()));
        pedidos.add(new Pedido(3, cliente, new BigDecimal("300"), 3, produto3, LocalDate.now()));
        pedidos.add(new Pedido(4, cliente, new BigDecimal("600"), 4, produto4, LocalDate.now()));
        pedidos.add(new Pedido(5, cliente, new BigDecimal("375"), 5, produto5, LocalDate.now()));

        System.out.println("Ordenação pelo maior valor total:");
        Collections.sort(pedidos, (pedido1, pedido2) -> pedido2.getValorTotal().compareTo(pedido1.getValorTotal()));
        pedidos.forEach(System.out::println);

        System.out.println("\nOrdenação pelo menor valor total:");
        Collections.sort(pedidos, (pedido1, pedido2) -> pedido1.getValorTotal().compareTo(pedido2.getValorTotal()));
        pedidos.forEach(System.out::println);
    }
}