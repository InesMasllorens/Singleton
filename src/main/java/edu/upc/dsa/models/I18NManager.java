package edu.upc.dsa.models;

import java.util.HashMap;
import java.util.ResourceBundle;

public class I18NManager {
    private static I18NManager instance;
    private HashMap<String, ResourceBundle> info;

    private I18NManager(){
        this.info = new HashMap<String, ResourceBundle>();
    }

    public static I18NManager getInstance() {
        if (instance == null) {
            instance = new I18NManager();
        }
        return instance;
    }

    public String getText(String idioma, String key) {
        ResourceBundle rb = this.info.get(idioma);
        if (rb == null) {
            rb = ResourceBundle.getBundle(idioma);
            this.info.put(idioma, rb);
        }
        return rb.getString(key);
    }

}
