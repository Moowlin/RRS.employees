package GlobalVariables;
import java.util.ResourceBundle;

public class GlobalVariables {
    // The name of the resource file containing strings for displaying messages
    public static final String FILENAME = "messages";
    // Loading the resource file for accessing strings (e.g., messages, UI)
    public static final ResourceBundle resourceBundle = ResourceBundle.getBundle(FILENAME);
}