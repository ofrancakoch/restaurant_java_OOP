/*
TODO:
- Atribuir a mesa ao Customer;
- Possibilitar vários cliente ao mesmo tempo;
- Melhorar o Cuisine class;

DONE:
- FOOD and TABLE classes;
- Restaurant class;


*/

import java.util.*;


public class Restaurant {
    protected String nomeRestaurante;
    protected Food[] cardapio = new Food[5];
    protected static LinkedList<Table> mesasDisponiveis = new LinkedList<Table>();
    protected static LinkedList<Table> mesasReservadas = new LinkedList<Table>();


    public Restaurant() {
        this.nomeRestaurante = "Abraccio";
        cardapio[0] = new Food(10.75, "Bolonhesa");
        cardapio[1] = new Food(8.50, "Arroz");
        cardapio[2] = new Food(12.00, "Filé Mignon");
        cardapio[3] = new Food(5.25, "Fritas");
        cardapio[4] = new Food(2.25, "Maçã");
        mesasDisponiveis.add(new Table("Mesa 1", 2));
        mesasDisponiveis.add(new Table("Mesa 2", 5));
        mesasDisponiveis.add(new Table("Mesa 3", 8));
    }

    public void visualizarCardapio(){
        System.out.println("\t   |       Cardápio      |");
        for(Food food : cardapio){
            System.out.println("\t   |" + food.nameFood +":  R$"+food.value);
        }
    }
}