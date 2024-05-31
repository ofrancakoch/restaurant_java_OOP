import java.util.*;

public class Restaurant {
    protected String nomeRestaurante;
    protected Food[] cardapio = new Food[5];
    protected static LinkedList<Table> mesasDisponiveis = new LinkedList<>();
    protected static LinkedList<Table> mesasReservadas = new LinkedList<>();


    static {
        mesasDisponiveis.add(new Table("Mesa 1", 2));
        mesasDisponiveis.add(new Table("Mesa 2", 5));
        mesasDisponiveis.add(new Table("Mesa 3", 8));
    }

    public Restaurant() {
        this.nomeRestaurante = "Abraccio";
        cardapio[0] = new Food(10.75, "Lasanha Bolonhesa");
        cardapio[1] = new Food(8.50, "Arroz");
        cardapio[2] = new Food(12.00, "Filé Mignon");
        cardapio[3] = new Food(5.25, "Fritas");
        cardapio[4] = new Food(7.25, "Frango Frito");
    }

    public void visualizarCardapio(){
        System.out.println("\t   |       Cardápio      |");
        for(Food food : cardapio){
            System.out.println("\t   |" + food.nameFood +":  R$"+food.value);
        }
    }

    public void visualizarLugares(){
        System.out.println("\t   |    Lugares Disponíveis   |");
        for(Table table : mesasDisponiveis){
            System.out.println("\t   |" + table.nameTable +": \t"+table.quantCadeiras);
        }
    }
}