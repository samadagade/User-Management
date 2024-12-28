package resources;

import java.util.ResourceBundle;

public class Messages {

    private static final ResourceBundle messages = ResourceBundle.getBundle("resources.messages");

    public static String getMessage(String key) {
        return messages.getString(key);
    }
}

//benifits of using ResourceBundle
// Separation of Concerns
//Support for Multiple Languages
//Ease of Extending Support for New Languages: