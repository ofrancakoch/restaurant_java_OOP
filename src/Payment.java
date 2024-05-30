import java.util.List;

public class Payment{
    public List<Food> pedidos;
    public double despesas;
    public double cash;

    public Payment(List<Food> pedidos, double cash) {
        this.pedidos = pedidos;
        this.cash = cash;
    }

    public void totalPayment(){
        for (Food price : this.pedidos) {
            despesas += price.value;
        }
        System.out.println("O total a se pagar é de: R$" + despesas);
    }

    public void efetuarPagamento(String nomeRestaurante){
        for (Food price : this.pedidos) {
            this.cash -= price.value;
        }
        if(this.cash >= 0){
            System.out.println("Pagamento efetuado. "+ nomeRestaurante +" agradece! Volte sempre!");
        } else{
            System.out.println("Ainda falta pagar R$" + this.cash*-1);
        } //FAZER CONDIÇÃO PARA VERIFICAR SE O DINHEIRO DO CLIENTE CONSEGUE COMPRAR A COMIDA QUE ELE PEDIU.
    }     //NÃO PRECISA SER NECESSARIAMENTE NESTE MÉTODO.
}


