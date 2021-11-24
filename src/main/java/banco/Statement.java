package banco;

public class Statement {

    //Constante para el titulo de los registros
    private static final String HEADER_BUILDER = "Fecha\t\t\t|Deposito\t|Retiro\t\t|Balance\n";

    //Objeto para almacenar los registros (strings)
    private StringBuilder stringBuilder = new StringBuilder();

    //Función para agregar un registro en el objeto (string)
    public void printTo(String cadena){
        stringBuilder.append(cadena);
    }

    //Función para mostrar todos los registros, le agregamos el título al inicio
    public void printoAll(){
        stringBuilder.insert(0, HEADER_BUILDER);
        System.out.println(stringBuilder.toString());
    }
}
