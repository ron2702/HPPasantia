/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LuisAlejandro
 */
public class JsonDateDeserializer implements JsonDeserializer<Date> {
    @Override
    public Date deserialize(JsonElement json, Type typeOfT,JsonDeserializationContext context) throws JsonParseException {
        try {
            String s = json.getAsJsonPrimitive().getAsString();
            String[] s1 = s.split(", ");
            SimpleDateFormat ft = new SimpleDateFormat("MMM dd, yyyy", Locale.US);
            Date d = ft.parse(s);
            return d;
        } catch (Exception ex) {
            Date d = new Date(); 
            return d;
        }
    } 
}
