package eu.emrex.model;


public class Person {

    private String givenNames;

    private String familyName;

    private String birthDate;

    private String gender;


    public String getGivenNames() {
        return givenNames;
    }


    public void setGivenNames(String givenNames) {
        this.givenNames = givenNames;
    }


    public String getFamilyName() {
        return familyName;
    }


    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }


    public String getBirthDate() {
        return birthDate;
    }


    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }


    public String getGender() {
        return gender;
    }


    public void setGender(String gender) {
        this.gender = gender;
    }

}
