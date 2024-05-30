import java.util.List;

public class Cuisine{
    public List<Food> pedidos;
    public String mesaAtual;

    public Cuisine(List<Food> pedidos, String mesaAtual) {
        this.pedidos = pedidos;
        this.mesaAtual = mesaAtual;
    }

    public void fazerPedido(){
        for (Food food : this.pedidos) {
            System.out.println("Fazendo " + food.nameFood);
        }
        System.out.println("\nPedidos prontos...\n");
        System.out.println("Chamando Garçom...\n");
        System.out.println("Pedido enviado para " + this.mesaAtual +"!\n");
    }

}
