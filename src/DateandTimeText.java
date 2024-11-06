import java.text.SimpleDateFormat;
import java.util.Date;

public class DateandTimeText extends TextDecorator {
    public DateandTimeText(Text text) {
        super(text);
    }

    @Override
    public String getContent() {
        return addTimestamp(text.getContent());
    }

    private String addTimestamp(String text) {
        String timestamp = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date());
        return "[" + timestamp + "] " + text;
    }
}
