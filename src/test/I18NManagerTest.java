import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.awt.*;
import java.util.MissingResourceException;

public class I18NManagerTest {

    I18NManager i18n;


    @Before
    public void setUp() throws Exception{
        this.i18n = I18NManager.getInstance();
    }

    @After
    public void tearDown() {
        this.i18n.getInstance().clear();
    }

    @Test
    public void testGetText() throws Exception {
        String msg1 = I18NManager.getInstance().getText("ca","l1");
        Assert.assertEquals("hola", msg1);

        String msg2 = I18NManager.getInstance().getText("ca","l2");
        Assert.assertEquals("adÃ©u", msg2);



        String msg4 = I18NManager.getInstance().getText("pt","l2");
        Assert.assertEquals("obrigado", msg4);


        String msg5 = I18NManager.getInstance().getText("it","l1");
        Assert.assertEquals("ciao", msg5);

        String msg6 = I18NManager.getInstance().getText("it","l2");
        Assert.assertEquals("arrivederci", msg6);

        String msg7 = I18NManager.getInstance().getText("it","l3");
        Assert.assertEquals("grazie", msg7);


        String msg3 = I18NManager.getInstance().getText("es","l2");
        Assert.assertEquals("adiÃ³s", msg3);

        String msg8 = I18NManager.getInstance().getText("es","l4");
        Assert.assertEquals("view", msg8);

        String msg9 = I18NManager.getInstance().getText("es","l5");
        Assert.assertEquals("NAvigate", msg9);

        String msg10 = I18NManager.getInstance().getText("es","l6");
        Assert.assertEquals("Code", msg10);

        String msg11 = I18NManager.getInstance().getText("es","l1");
        Assert.assertEquals("hola", msg11);

        String msg12 = I18NManager.getInstance().getText("es","l3");
        Assert.assertEquals("Edit", msg12);

    }


    @Test(expected = MissingResourceException.class)
    public void testGetTextBundleNotFound() throws Exception {
        String msg1 = I18NManager.getInstance().getText("ca","l1");
        Assert.assertEquals("hola", msg1);

        String msg2 = I18NManager.getInstance().getText("ca","l2");
        Assert.assertEquals("adÃ©u", msg2);


        String msg3 = I18NManager.getInstance().getText("XXXX","l2");


    }

}