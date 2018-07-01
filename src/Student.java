public class Student {

    private int id;
    private String surname;
    private String name;
    private int year;

    public Student(){}

    public Student(int id, String surname, String name, int year) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return this.id + " " + this.surname + " "  + this.name + " " + this.year;
    }

}
