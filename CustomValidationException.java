public class CustomValidationException extends Exception {
    public CustomValidationException(String message) {
        super(message);
    }
}

public class TestCustomValidationException {
    public static void main(String[] args) {
        try {
            validateNumber(-5);
        } catch (CustomValidationException e) {
            System.out.println("Caught CustomValidationException: " + e.getMessage());
        }
    }

    public static void validateNumber(int number) throws CustomValidationException {
        if (number < 0) {
            throw new CustomValidationException("Number cannot be negative");
        }
    }
}
