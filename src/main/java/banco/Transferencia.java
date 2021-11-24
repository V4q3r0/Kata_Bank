package banco;

public class Transferencia {

    //Atributo balance o saldo de la cuenta
    private Integer balance;

    //Constructor vacío
    public Transferencia(){

    }

    //Función para modificar el saldo de la cuenta
    public boolean addTo(int valor, boolean estado){
        if(estado){
            addToDeposito(valor);
            return true;
        }
        addToRetiro(valor);
        return false;
    }

    //Función que se llama al depositar
    public void addToDeposito(int valor){
        this.balance += valor;
    }

    //Función que se llama al retirar
    public void addToRetiro(int valor){
        this.balance -= valor;
    }

    //Función para mostrar el balance o saldo de la cuenta
    public String toString (){
        return String.valueOf(balance);
    }
}
