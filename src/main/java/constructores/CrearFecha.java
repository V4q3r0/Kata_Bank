package constructores;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class CrearFecha {

    private static final String DATE_FORMAT = "dd/MM/yyyy";

    public static LocalDate date(String fecha){
        Date date = null;
        try{
            DateFormat fechaFormat = new SimpleDateFormat("dd/MM/yyyy");
            date = fechaFormat.parse(fecha);
        }catch (Exception e){
            System.out.println(e);
        }
        return convertToLocalDateViaInstant(date);
    }

    public static LocalDate convertToLocalDateViaInstant(Date dateToConvert) {
        return dateToConvert.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
    }

}
