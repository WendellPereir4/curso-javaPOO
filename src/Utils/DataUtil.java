package Utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataUtil {
    public static String converterDateParaDataEHora(Date data){ // statica quer dizer que posso usar o metodo sem instanciar.
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/YYY HH:mm");
        return formatador.format(data);
    }
}
