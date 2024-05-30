//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurante = new Restaurant();
        Scanner myObj = new Scanner(System.in);
        System.out.println("Seja Bem-Vindo ao "+ restaurante.nomeRestaurante +"!");
        System.out.println("Quantos lugares você precisa?");
        int quantidadePessoas = myObj.nextInt();
        Customer cliente = new Customer(quantidadePessoas);
        /*
        * Adicionar:
        * - verificação de lotação de lugares
        * - Arrumar o dinheiro negativo do Payment
        * - Adicionar métodos da interface Acoes
        * - Ver um pouco de exceptions
        * - Tentar ver se uma instancia influenciar na outra
        * - Quando o cliente terminar de comer, depositar mesa de mesasReservadas em mesasDisponiveis
        * */
        cliente.visualizarCardapio();
        cliente.realizarPedido();
        cliente.processoCozinha();
        cliente.entregaDePedidos();
        cliente.processoPagamento();
    }
}