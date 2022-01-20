
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class ProxyTest {
    @Test
    void retornaSucesso() throws Exception {
        Internet internet = new InternetProxy();
        internet.conectar("www.orkut.com");
    }

    @Test
    void retornaSiteBanido() {

        Internet internet = new InternetProxy();
        try {


            internet.conectar("www.google.com");
            fail();
        }
        catch (Exception ex)
        {
            assertEquals("Site banido.", ex.getMessage());
        }


    }
}
