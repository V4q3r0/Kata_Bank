package banco;

import java.time.LocalDate;

public class Account {

    //Atributos de tipo objeto de la clase
    private Statement statement;
    private Transferencia transferencia = new Transferencia();

    //Constructor
    public Account(Statement statement){
        this.statement = statement;
    }

    //Funcion para depositar en el banco
    public void deposit(Amount amount, LocalDate date) {
        int valor = Integer.parseInt(amount.toString());
        String cadena = date+"\t\t|"+
                valor+
                "\t\t|\t\t\t|"
                +transferencia.toString()
                +"\n";
        transferencia.addTo(valor, true);
        statement.printTo(cadena);
    }

    //Función para retirar en el banco
    public void withdrawal(Amount amount, LocalDate date){
        int valor = Integer.parseInt(amount.toString());
        String cadena = date+
                "\t\t|\t\t\t|"+
                valor+
                "\t\t|"+transferencia.toString()+
                "\n";
        transferencia.addTo(valor, false);
        statement.printTo(cadena);
    }

    //Función para imprimir todos los registros de transferencias
    public void printStatements() {
        statement.printoAll();
    }

}
