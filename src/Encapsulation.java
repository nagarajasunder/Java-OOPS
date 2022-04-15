public class Encapsulation {

    public static void main(String[] args) {
        User user = new User();
        try {
            user.setUserName("hello");
        } catch (UserNameException e) {
            System.out.println(e.getMessage());
        }
        try {
            user.setPassword("");
        } catch (PasswordException e) {
            System.out.println(e.getMessage());
        }

    }


}

class User {
    private int userID;
    private String userName;
    private String password;


    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setUserName(String userName) throws UserNameException {
        if (userName.isEmpty() || userName.length() > 20) {
//            throw new UserNameException("Username cannot be empty or username cannot exceed 20 characters");
            throw new UserNameException(null);
        }
        this.userName = userName;
    }

    public void setPassword(String password) throws PasswordException {
        if (password.length() < 8) {
            throw new PasswordException("Password cannot be empty");
        }
        this.password = password;
    }
}

class UserNameException extends Exception {

    private final String exceptionMessage;

    public UserNameException(String message) {
        this.exceptionMessage = message;
    }


    @Override
    public String getMessage() {
        if (exceptionMessage == null || exceptionMessage.isEmpty()) {
            return "User name cannot be empty";
        } else {
            return exceptionMessage;
        }
    }
}

class PasswordException extends Exception {

    private final String exceptionMessage;

    public PasswordException(String message) {
        this.exceptionMessage = message;
    }

    @Override
    public String getMessage() {
        return exceptionMessage;
    }
}

