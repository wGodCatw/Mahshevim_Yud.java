package Roni.Nodes.AppointmentSceduler;

public class Run {
    public static void main(String[] args) {
        Meeting n1 = new Meeting("Monday", "12-13", 0L);
        Meeting n2 = new Meeting("Friday", "13-14", 0L);

        n1.getIdmeeting();
        System.out.println(n2.getIdmeeting());

    }

    public static Node<Meeting> addAppointment(Node<Meeting> meetings, String day, String hour) {
        Meeting f = new Meeting(day, hour, null);
        if (meetings == null) {
            // meetings.setValue(f);
            return meetings;
        } else {
            Node<Meeting> help;
            help = meetings;
            while (help.getNext() != null) {
                help = help.getNext();
            }
            help.setNext(new Node<Meeting>(f, null));
            return meetings;


        }

    }

    public static Node<Student> addStudent(Node<Student> Students, Long idstudent, String hour, String name, int idmeeting) {
        Student f = new Student(name, idmeeting);
        if (Students == null) {
            // Students.setValue(f);
            return Students;
        } else {
            Node help;
            help = Students;
            while (help.getNext() != null) {
                help = help.getNext();
            }
            help.setNext(new Node<Student>(f, null));
            return Students;

        }


    }

    public static boolean meetingExists(Node<Meeting> meetings, String day, String hour) {
        Node<Meeting> help;
        help = meetings;
        while (help != null) {
            if (help.getValue().getDay().equals(day) && help.getValue().getHour().equals(hour))
                return true;
            help = help.getNext();
        }
        return false;

    }

    public static boolean studentExists(Node<Student> student, String name, Long id) {
        Node<Student> help;
        help = student;
        while (help != null) {
            if (help.getValue().getName().equals(name) && help.getValue().getIdstudent().equals(id))
                return true;
            help = help.getNext();
        }
        return false;

    }

    public static Node<Meeting> deleteMeeting(Node<Meeting> meetings, String day, String hour) {
        Node<Meeting> help = new Node<>(null, null);
        help = meetings;
        Node<Meeting> start = new Node<>(null, null);
        start = help;
        help = help.getNext();
        while (help != null) {
            if (help.getValue().getDay().equals(day) && help.getValue().getHour().equals(hour)) {
                meetings.setNext(help.getNext());
                help.setNext(null);
                return start;
            } else {
                help = help.getNext();
                meetings = meetings.getNext();
            }
        }
        if (start.getValue().getDay().equals(day) && start.getValue().getHour().equals(hour))
            return start.getNext();
        return start;

    }


    public static void printMeetings(Node<Meeting> meetings) {
        while (meetings != null) {
            System.out.println(meetings.toString());
        }
    }

    public static void printStudents(Node<Student> students) {
        while (students != null) {
            System.out.println(students.toString());
        }
    }

    public static Meeting updateMeeting(Meeting meeting, Student student, String day, String hour) {
        if (hour != null && day != null && student != null && meeting != null) {
            meeting.setDay(day);
            meeting.setHour(hour);
            meeting.setIdstudent(student.getIdstudent());
            return meeting;
        }
        return null;
    }

}
