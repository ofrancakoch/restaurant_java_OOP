import java.util.*;

public class Waiter extends Restaurant{

    public Waiter(){}

    public static String reservarMesa(int quantPessoas){
        for(int i = 1; i < mesasDisponiveis.size(); i++){
            if(mesasDisponiveis.get(i).quantCadeiras == quantPessoas){
                mesasReservadas.add(mesasDisponiveis.get(i));
                mesasDisponiveis.remove(mesasDisponiveis.get(i));
                return mesasDisponiveis.get(i).nomeMesa;
            }
        }
        System.out.println("Todos nossos luagares estão ocupados.Se possível, espere até que uma mesa esteja desocupada!");
        return null;
    }

    public void entregarPedido(List<Food> pedidos){
        System.out.print("Aqui estão seus pedidos!\nAqui estão: ");
        for (Food pedido : pedidos) {
            System.out.println(pedido.nameFood);
        }
    }



}
