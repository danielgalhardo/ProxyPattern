import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class InternetProxy implements  Internet {
    private Internet internet = new InternetUFJF();
    private static List<String> urlsBanidas;

    static
    {
        urlsBanidas = new ArrayList<String>();
        urlsBanidas.add("www.stackoverflow.com");
        urlsBanidas.add("www.github.com");
        urlsBanidas.add("www.google.com");
    }
    @Override
    public void conectar(String servidor) throws Exception {
        if (urlsBanidas.contains(servidor.toLowerCase()))
        {
            throw new Exception("Site banido.");
        }

        internet.conectar(servidor);
    }
}
