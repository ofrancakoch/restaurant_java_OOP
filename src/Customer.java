import java.util.*;
import java.util.Scanner;

public class Customer extends Restaurant {
    private final double cash;
    protected List<Food> pedidos;
    protected Table mesaAtual;
    protected int quantPessoas;

    public Customer(int quantPessoas) {
        this.quantPessoas = quantPessoas;
        this.mesaAtual = new Waiter().reservarMesa(this.quantPessoas);
        this.cash = 10.00; //ESSE NUMERO PRECISA SER MAIOR QUE 0
        this.pedidos =  new ArrayList<>();
    }

    public boolean verificarAlimentoCardapio(String alimento){
       for (Food food : cardapio) {
            if(food.nameFood.equals(alimento)) {
                return true;
            }
        }
       return false;
    }

    public int encontrarIndexAlimento(String alimento){
        for (int i = 0; i < cardapio.length; i++) {
            if(cardapio[i].nameFood.equals(alimento)) {
                return i;
            }
        }
        return -1;
    }


    public void realizarPedido() {
        Scanner myObj = new Scanner(System.in);
        int decisao = 1;
        while(decisao != 0){
            System.out.println("O que você deseja?");
            String pedido = myObj.nextLine();
            if (verificarAlimentoCardapio(pedido)) {
                Food comida = cardapio[encontrarIndexAlimento(pedido)];
                this.pedidos.add(comida);
                System.out.println("Algo mais?[Se não, digite 0]");
            } else {
                System.out.println("Não existe este pedido em nosso cardápio");
                System.out.println("Quer continuar pedindo?[Se não, digite 0]");
            } try {
                decisao = Integer.parseInt(myObj.nextLine());
            } catch (NumberFormatException e) {
                decisao = 0;
            }
        }
    }

    public void clientTable(){
            System.out.println("\nVocê está na " + this.mesaAtual.nameTable + "!\n");
    }

    public void entregaDePedidos(){
        Waiter waiter = new Waiter();
        waiter.entregarPedido(this.pedidos);
    }

    public void processoCozinha(){
        Cuisine cozinha = new Cuisine(this.pedidos,this.mesaAtual.nameTable);
        cozinha.fazerPedido();
    }

    public void processoPagamento(){
        Payment pagamento = new Payment(this.pedidos,this.cash);
        pagamento.totalPayment();
        pagamento.efetuarPagamento(nomeRestaurante);
        mesasDisponiveis.add(this.mesaAtual);
        mesasReservadas.remove(this.mesaAtual); 
    }
}



