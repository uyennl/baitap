package checked_input;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidDate {
    private static final String EMAIL_PATTERN =
            "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                    + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    public static boolean isValidDate(String date) {
//        dd/MM/yyyy
        String[] dateStr = date.split("/");
        int[] intArr = new int[3];
        for (int i = 0; i < 3; i++) {
            intArr[i] = Integer.parseInt(dateStr[i]);
        }
        if (intArr[0] > 31 || intArr[0] < 0 || intArr[1] > 12 || intArr[1] < 0 || intArr[2] < 0) {
            return false;
        } else if (intArr[1] == 4 || intArr[1] == 6 || intArr[1] == 9 || intArr[1] == 11) {
            if (intArr[0] == 31) {
                return false;
            }
        } else if (intArr[1] == 2) {
            if (intArr[0] == 29 && (intArr[2] % 400 != 0 || (intArr[2] % 100 == 0 && intArr[2] % 4 != 0))) {
                return false;
            }
        }
        return true;
    }
    public static boolean isEmailValid(String email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

}