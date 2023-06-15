package checked_input;

public class ValidDate {
    public static boolean isValidDate(String date) {
//        dd/MM/yyyy
        String[] dateStr = date.split("");
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

    public static int isAge(int age) {
        age = 0;

return age;
    }
}