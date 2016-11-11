package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author lhries
 */
public class DateUtil {
    
    public static Date stringToDate(String data) throws ParseException
    {
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        formatador.setLenient(false);
        return(formatador.parse(data));
    }

    public static Date stringToDateHour(String data) throws ParseException
    {
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        formatador.setLenient(false);
        return(formatador.parse(data));
    }

    public static Date stringToHour(String hour) throws ParseException
    {
        SimpleDateFormat formatador = new SimpleDateFormat("HH:mm");
        formatador.setLenient(false);
        return(formatador.parse(hour));
    }
    
    public static String dateHourToString(Date data){
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        String dataString = formatador.format(data);
        return(dataString);
    }
    
    public static String dateToString(Date data){
        return(new SimpleDateFormat("dd/MM/yyyy").format(data));
    }

    public static String hourToString(Date hour){
        SimpleDateFormat formatador = new SimpleDateFormat("HH:mm");
        String dataString = formatador.format(hour);
        return(dataString);
    }
    
 
}