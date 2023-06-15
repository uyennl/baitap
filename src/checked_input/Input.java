package checked_input;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class Input {
    public static final String INVALID_NUMBER_FORMAT = "Sai định dạng số!";
    public static final String NEGATIVE_NUMBER = "Không được nhập số âm!";
    public static final String POSITIVE_NUMBER = "Không được nhập số dương!";
    public static final String ZERO_OR_NEGATIVE_NUMBER = "Không được nhập số 0 hoặc số âm!";
    public static final String EMPTY_STRING = "Không được để trống!";
    public static final String INVALID_DATE_FORMAT = "Sai định dạng ngày. (dd/MM/yyyy)";
    public static final String OUT_OF_RANGE = "Giá trị nhập vào không nằm trong khoảng cho phép!";
    public static final String INVALID_NAME_FORMAT = "Tên chỉ bao gồm các kí tự chữ cái và khoảng trắng!";
    static Scanner sc = new Scanner(System.in);

        public static double enterValidDouble(String message) {
            while (true) {
                System.out.println(message);
                String input = sc.nextLine();
                try {
                    double value = Double.parseDouble(input.trim());
                    if (value < 0) {
                        throw new IllegalArgumentException(NEGATIVE_NUMBER);
                    }
                    return value;
                } catch (NumberFormatException e) {
                    System.out.println(INVALID_NUMBER_FORMAT);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
        }

        public static int enterValidInteger(String message) {
            while (true) {
                System.out.println(message);
                String input = sc.nextLine();
                try {
                    int value = Integer.parseInt(input.trim());
                    if (value < 0) {
                        throw new IllegalArgumentException(NEGATIVE_NUMBER);
                    }
                    return value;
                } catch (NumberFormatException e) {
                    System.out.println(INVALID_NUMBER_FORMAT);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
        }

        public static long enterValidLong(String message) {
            while (true) {
                System.out.println(message);
                String input = sc.nextLine();
                try {
                    long value = Long.parseLong(input.trim());
                    if (value < 0) {
                        throw new IllegalArgumentException(NEGATIVE_NUMBER);
                    }
                    return value;
                } catch (NumberFormatException e) {
                    System.out.println(INVALID_NUMBER_FORMAT);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
        }

        public static String enterValidName(String message) {
            while (true) {
                System.out.println(message);
                String name = sc.nextLine().trim();
                if (name.isEmpty()) {
                    System.out.println(EMPTY_STRING);
                } else if (!name.matches("^[a-zA-Z\\s]*$")) {
                    System.out.println(INVALID_NAME_FORMAT);
                } else {
                    return name;
                }
            }
        }

        public static String enterValidDate(String message) {
            while (true) {
                System.out.println(message);
                String input = sc.nextLine().trim();
                try {
                    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
                    format.setLenient(false);
                    Date date = format.parse(input);
                    return input;
                } catch (ParseException e) {
                    System.out.println(INVALID_DATE_FORMAT);
                }
            }
        }

}
