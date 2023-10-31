public class Contact {
    String surname;
    String name;
    String patronymic;
    String birthdate;
    Integer phoneNumber;
    String gender;

    public Contact(String surname, String name, String patronymic,
                   String birthdate, Integer phoneNumber, String gender) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.birthdate = birthdate;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public Contact() {

    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return
                '<' + surname + '>' +
                '<' + name + '>' +
                '<' + patronymic + '>' +
                '<' + birthdate + '>' +
                '<' + phoneNumber + '>' +
                '<' + gender + '>' +
                '}'+"\n";
    }
}
