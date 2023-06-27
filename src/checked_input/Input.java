package checked_input;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Input {
    public static final String INVALID_NUMBER_FORMAT = "Sai định dạng số!";
    public static final String NEGATIVE_NUMBER = "Không được nhập số âm!";
    public static final String POSITIVE_NUMBER = "Không được nhập số dương!";
    public static final String ZERO_OR_NEGATIVE_NUMBER = "Không được nhập số 0 hoặc số âm!";
    public static final String EMPTY_STRING = "Không được để trống!";
    public static final String INVALID_DATE_FORMAT = "Sai định dạng ngày. (dd/MM/yyyy)";
    public static final String OUT_OF_RANGE = "Giá trị nhập vào không nằm trong khoảng cho phép!";
    public static final String INVALID_NAME_FORMAT = "Tên chỉ bao gồm các kí tự chữ cái và khoảng trắng!";
    public static final String DUPLICATE_ID = "Id không đuọce trùng lặp!";
    public static final String INVALID_BIRTH_FORMAT = "Sai định dạng ngày sinh (dd/MM/yyyy)";
    static Scanner sc = new Scanner(System.in);
    private static Set<Integer> idSet = new HashSet<>();
    private static Set<String> idset = new HashSet<>();

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
    public static float enterValidFloat(String mess){
        while (true) {
            System.out.println(mess);
            String input = sc.nextLine();
            try {
                float value = Float.parseFloat(input.trim());
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

    public static int enterValidInteger(String message, boolean isValid, boolean isUnique) {

        while (true) {
            System.out.println(message);

            if (isValid && isUnique) {
                while (true) {
                    String input = sc.nextLine();
                    try {
                        int value = Integer.parseInt(input.trim());
                        if (value <= 0) {
                            throw new IllegalArgumentException(NEGATIVE_NUMBER);
                        }
                        if (!idSet.contains(value)) {
                            idSet.add(value);
                            return value;
                        } else {
                            throw new IllegalArgumentException(DUPLICATE_ID);
                        }
                    } catch (NumberFormatException e) {
                        System.out.println(INVALID_NUMBER_FORMAT);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                }
            } else {
                System.out.println("Giá trị không hợp lệ, vui lòng nhập lại!");
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

    public static String enterValidName(String message, boolean fistLetter) {
        while (true) {
            System.out.println(message);
            String name = sc.nextLine().trim();
            if (name.isEmpty()) {
                System.out.println(EMPTY_STRING);
            } else if (name.matches(".*\\d.*") || name.matches(".*[^a-zA-Z].*")) {
                System.out.println(INVALID_NAME_FORMAT);
            } else {
                if (fistLetter) {
                    name = name.substring(0, 1).toUpperCase() + name.substring(1);
                }
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

    public static String enterValidId(String message, boolean firstLetter) {
        Scanner scanner = new Scanner(System.in);
        String id;
        while (true) {
            System.out.print(message);
            id = scanner.nextLine().trim();

            if (id.length() != 3) {
                System.out.println("Invalid ID format. The ID should have 3 characters.");
            } else if (firstLetter && !((id.substring(0, 1).equals("N"))||(id.substring(0, 1).equals("D")))) {
                System.out.println("Invalid ID format. The first two letters should be 'KH'.");
            } else if (!Character.isDigit(id.charAt(1)) || !Character.isDigit(id.charAt(2))) {
                System.out.println("Invalid ID format. The last two characters should be digits.");
            } else if (idSet.contains(id)) {
                System.out.println("ID already exists. Please enter a different ID.");
            } else if (idSet.contains(id)) {
                System.out.println("ID already exists. Please enter a different ID.");
            } else {
                return id;
            }
        }
    }
    public static String enterValidPhoneNumber(String message, boolean firstLetter) {
        Scanner scanner = new Scanner(System.in);
        String phoneNumber;
        while (true) {
            System.out.print(message);
            phoneNumber = scanner.nextLine().trim();

            if (phoneNumber.length() != 10) {
                System.out.println("Invalid phone number format. The phone number should have 10 digits.");
            } else if (firstLetter && !(phoneNumber.substring(0, 2).equals("09"))) {
                System.out.println("Invalid phone number format. The phone number should start with '09'.");
            } else if (!phoneNumber.matches("\\d+")) {
                System.out.println("Invalid phone number format. The phone number should only contain digits.");
            } else {
                return phoneNumber;
            }
        }
    }
    public static String enterBirth(String mess) {
        while (true) {
            System.out.println(  mess  );
            try {
                String dateStr = sc.nextLine().trim();
                if (ValidDate.isValidDate(dateStr)) {
                    return dateStr;
                }
            } catch (NoSuchElementException e) {
                System.out.println(INVALID_BIRTH_FORMAT);
                continue;

            }
        }
    }
    public static String enterGmail(String mess){
        while (true) {
            System.out.println( mess );
            try {
                String gmail = sc.nextLine().trim();
                if (ValidDate.isEmailValid(gmail)) {
                    return gmail;
                }
            } catch (NoSuchElementException e) {
                System.out.println(INVALID_BIRTH_FORMAT);
                continue;

            }
        }
    }
}