package Test;

import com.sun.xml.internal.ws.spi.db.DatabindingException;
import net.yandex.speller.services.spellservice.*;
import java.util.List;

public class SoapYandexSpellChecker {

    public static void main(String[] args) throws DatabindingException {
        SpellService service = new SpellService();
        SpellServiceSoap port = service.getSpellServiceSoap();
        CheckTextRequest request = new CheckTextRequest();
        request.setLang(InitialData.language);
        request.setText(InitialData.spell);
        CheckTextResponse checkTextResponse = port.checkText(request);
        List<SpellError> errorList = checkTextResponse.getSpellResult().getError();
        System.out.println(errorList.size());
        for (SpellError error : errorList) {
            System.out.println(error.getWord());
        }
    }

}
