package model;

public class Student {
    private String id;
    private String name;
    private String lastName;
    private char gender;
    private Date birthDate;
    private Date admissionDate;
    private boolean ethnicGroup;

    public Student(String id, String name, String lastName, char gender, Date birthDate, Date admissionDate, boolean ethnicGroup) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.admissionDate = admissionDate;
        this.ethnicGroup = ethnicGroup;
    }

    public int calculateAge(Date nowDate) {
        int age = birthDate.calculateYears(nowDate);
        return age;
    }
    
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public char getGender() {
        return gender;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public Date getAdmissionDate() {
        return admissionDate;
    }

    public boolean isEthnicGroup() {
        return ethnicGroup;
    }
}
