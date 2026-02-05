class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {
    static void validateEmail(String email) throws InvalidEmailException {
        if (!email.contains("@")) {
            throw new InvalidEmailException("Email must contain '@' symbol");
        } else {
            System.out.println("Email is valid.");
        }
    }

    public static void main(String[] args) {
        try {
            validateEmail("invalidemail.com");
        } catch (InvalidEmailException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        try {
            validateEmail("test@example.com");
        } catch (InvalidEmailException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}