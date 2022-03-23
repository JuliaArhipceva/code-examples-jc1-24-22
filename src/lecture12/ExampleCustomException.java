package lecture12;

public class ExampleCustomException {
    public static void main(String[] args) {
        String line = "-563";
        if (isStringConvertableToInt(line)) {
            try {
                int age = convertAgeFromString(line);
                System.out.println(age);
            } catch (AgeIncorrectValueException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static int convertAgeFromString(String line) throws AgeIncorrectValueException {
        try {
            int age = Integer.parseInt(line);
            if (age < 0) {
                throw new AgeIncorrectValueException("Age can't be less than 0");
            }
            return age;
        } catch (NumberFormatException e) {
            throw new AgeIncorrectFormatException("Age has incorrect format");
        }
    }

    private static boolean isStringConvertableToInt(String line) {
        try {
            Integer.parseInt(line);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
