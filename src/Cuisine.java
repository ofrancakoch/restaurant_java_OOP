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
            System.out.println("\nFazendo " + food.nameFood);
        }
        System.out.println("\nPedidos prontos...");
        System.out.println("Chamando Garçom...");
        System.out.println("Pedido enviado para " + this.mesaAtual +"!\n");
    }

}
