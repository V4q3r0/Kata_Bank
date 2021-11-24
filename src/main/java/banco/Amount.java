package banco;

public class Amount {

    //Atributo para la cantidad de la transacción
    private Integer valor;

    //Constructor
    public Amount (int valor){
        this.valor = valor;
    }

    //Función crear un nuevo objeto y darle un valor al iniciar
    public static Amount amountOf(int valor){
        return new Amount(valor);
    }

    //Mostrar el valor de la cantidad de la transacción
    public String toString(){
        return String.valueOf(valor);
    }
}
