package Roni.Nodes.AppointmentSceduler;

public class Student {
    private static Long idstudent = 0L;
    private String name;
    private int idmeeting;

    public Student(String name, int idmeeting) {
        this.idmeeting = idmeeting;
        this.idstudent++;
        this.name = name;

    }

    public Long getIdstudent() {
        return idstudent;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdmeeting() {
        return idmeeting;
    }

    public void setIdmeeting(int idmeeting) {
        this.idmeeting = idmeeting;
    }

    public String toString(){
        return "Id Student: " + idstudent + ", Name: " + name;
    }
}
