package ss015_exception.exercise;

public class ExceptionOfMy extends Exception{
    private String getMessageOfMy;

    public ExceptionOfMy(String getMessageOfMy) {
        this.getMessageOfMy = getMessageOfMy;
    }

    public ExceptionOfMy() {
    }

    public String getGetMessageOfMy() {
        return getMessageOfMy;
    }

    public void setGetMessageOfMy(String getMessageOfMy) {
        this.getMessageOfMy = getMessageOfMy;
    }

    @Override
    public String toString() {
        return "ExceptionOfMy{" +
                "getMessageOfMy='" + getMessageOfMy + '\'' +
                '}';
    }
}
