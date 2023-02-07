package exercise;

import java.util.List;
import java.util.Arrays;

// BEGIN
class App {
    public static long getCountOfFreeEmails(List<String> emails) {
        return emails.stream()
                .filter(email -> email.endsWith("@gmail.com")
                        || email.endsWith("@hotmail.com") || email.endsWith("@yandex.ru"))
                .count();
    }
}
// END
