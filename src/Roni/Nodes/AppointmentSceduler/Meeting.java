package Roni.Nodes.AppointmentSceduler;

public class Meeting {
    private int idmeeting;
    private String day;
    private String hour;
    private Long idstudent;
    private static int count = 1;


    public Meeting(String day, String hour, Long idstudent) {
        this.idmeeting = this.count;
        this.day = day;
        this.hour = hour;
        this.idstudent = idstudent;
        count++;

    }

    public int getIdmeeting() {
        return idmeeting;

    }

    public Long getIdstudent() {
        return idstudent;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getHour() {
        return hour;
    }

    public void setIdstudent(Long idstudent) {
        this.idstudent = idstudent;
    }


    public String toString(){
        return "Id Meeting: " + idmeeting + ", Day/hour: " + day + "/" + hour + ", Student: " + idstudent;
    }

}

