public class Table {

    public String nomeMesa;
    public int quantCadeiras;

    public Table(String nomeMesa, int quantCadeiras) {
        this.nomeMesa = nomeMesa;
        this.quantCadeiras = quantCadeiras;
    }

    public String getNomeMesa() {
        return nomeMesa;
    }

    public void setNomeMesa(String nomeMesa) {
        this.nomeMesa = nomeMesa;
    }

    public int getQuantCadeiras() {
        return quantCadeiras;
    }

    public void setQuantCadeiras(int quantCadeiras) {
        this.quantCadeiras = quantCadeiras;
    }
}
