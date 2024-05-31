import java.util.*;

public class Waiter extends Restaurant {

    public Waiter() {
    }

    public static Table reservarMesa(int quantPessoas) {
        for (Table table : mesasDisponiveis) {
            if (table.quantCadeiras == quantPessoas) {
                mesasReservadas.add(table);
                mesasDisponiveis.remove(table);
                return table;
            }
        }
        System.out.println("Todos nossos lugares estão ocupados ou não existem mesas capazes de portarem este número de pessoas. \nSe possível, espere até que uma mesa esteja desocupada!\n");
        return null;
    }

    public void entregarPedido(List<Food> pedidos) {
        System.out.print("Aqui estão seus pedidos!\nAqui estão: \n");
        for (Food pedido : pedidos) {
            System.out.println("- " + pedido.nameFood);
        }
        System.out.println();
    }
}
