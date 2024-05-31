//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurante = new Restaurant();
        Scanner myObj = new Scanner(System.in);
        System.out.println("Seja Bem-Vindo ao " + restaurante.nomeRestaurante + "!");
        System.out.println("Quantos lugares você precisa?");
        restaurante.visualizarLugares();
        int quantCliente = myObj.nextInt();
        Customer cliente = new Customer(quantCliente, Waiter.reservarMesa(quantCliente));
        try {
            cliente.clientTable();
            cliente.visualizarCardapio();
            cliente.realizarPedido();
            if (cliente.pedidos.isEmpty()) {
                System.out.println(restaurante.nomeRestaurante + " agradece! Até mais!");
            } else {
                cliente.processoCozinha();
                cliente.entregaDePedidos();
                cliente.processoPagamento();
            }
        } catch(NullPointerException e){
            System.out.println();
        }
    }
}