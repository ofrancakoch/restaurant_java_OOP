import java.util.List;

public class Payment implements paymentMethods{
    public List<Food> pedidos;
    public double cash;

    public Payment(List<Food> pedidos, double cash) {
        this.pedidos = pedidos;
        this.cash = cash;
    }

    public double totalPayment(){
        double despesas = 0;
        for (Food price : this.pedidos) {
            despesas += price.value;
        }
        return despesas;
    }

    public void efetuarPagamento(String nomeRestaurante){
        this.cash -= totalPayment();

        if(this.cash >= 0){
            System.out.println("Pagamento efetuado. "+ nomeRestaurante +" agradece! Volte sempre!");
        } else{
            System.out.println("Ainda falta pagar R$" + this.cash*-1);
        }
    }
}


