package ss016_text_file.exercise.bai2;

public class Country {
    private int idOfCountry;
    private String codeOfCountry;
    private String nameOfCountry;

    public Country(int idOfCountry, String codeOfCountry, String nameOfCountry) {
        this.idOfCountry = idOfCountry;
        this.codeOfCountry = codeOfCountry;
        this.nameOfCountry = nameOfCountry;
    }

    public int getIdOfCountry() {
        return idOfCountry;
    }

    public void setIdOfCountry(int idOfCountry) {
        this.idOfCountry = idOfCountry;
    }

    public String getCodeOfCountry() {
        return codeOfCountry;
    }

    public void setCodeOfCountry(String codeOfCountry) {
        this.codeOfCountry = codeOfCountry;
    }

    public String getNameOfCountry() {
        return nameOfCountry;
    }

    public void setNameOfCountry(String nameOfCountry) {
        this.nameOfCountry = nameOfCountry;
    }

    @Override
    public String toString() {
        return "Country{" +
                "idOfCountry=" + idOfCountry +
                ", codeOfCountry='" + codeOfCountry + '\'' +
                ", nameOfCountry='" + nameOfCountry + '\'' +
                '}';
    }

    public Country() {
    }
}
