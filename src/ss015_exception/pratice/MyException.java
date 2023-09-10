package ss015_exception.pratice;

public class MyException extends Exception {
    private String getMessage;

    public MyException(String getMessage) {
        this.getMessage = getMessage;
    }

    public String getGetMessage() {
        return getMessage;
    }

    public void setGetMessage(String getMessage) {
        this.getMessage = getMessage;
    }
}
