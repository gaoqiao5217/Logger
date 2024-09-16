import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    private int num = 1;
    private static Logger instance;

    private Logger() {}

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String msg) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        String date = formatter.format(new Date());
        System.out.println("[" + date + " " + num++ + "] " + msg);
    }
}