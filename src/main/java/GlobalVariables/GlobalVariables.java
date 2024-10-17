package GlobalVariables;
import java.util.ResourceBundle;

public class GlobalVariables {
    // The name of the resource file containing strings for displaying messages
    public static final String FILENAME = "messages";
    // Loading the resource file for accessing strings (e.g., messages, UI)
    public static final ResourceBundle resourceBundle = ResourceBundle.getBundle(FILENAME);

    public static final String bold = "\033[1m";  // ANSI код для включения жирного текста
    public static final String resetText = "\033[0m";    // ANSI код для сброса стилей текста (возвращение к обычному тексту)
    public static final String resetColor = "\033[0m";       // Сброс форматирования
    public static final String green = "\033[32m";      // Зеленый цвет текста
}