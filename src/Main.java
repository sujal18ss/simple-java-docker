import java.util.Date;

public class Time {
    public static void main(String[] args) {
        Date currentDate = new Date();
        System.out.println("Hello, Docker! Current date: " + currentDate);
    }
}

// This Main Class will show Kolkata Time zone 
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args) {
        Date currentDate = new Date();

        // Define date format
        SimpleDateFormat sdf = new SimpleDateFormat("E MMM dd HH:mm:ss z yyyy");

        // Set to IST (Indian Standard Time)
        sdf.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));

        System.out.println("Hello, Docker! Current date: " + sdf.format(currentDate));
    }
}
