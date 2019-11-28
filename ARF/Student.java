package ARF;

import java.util.HashMap;

public class Student {
    public String name = "default";
    public int ID = 0;
    public String typeOfStudent = "Regular Student";
    public String course[]=new course[4];

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, String studentType) {
        this.name = name;
        this.typeOfStudent = studentType;
    }



    public int getID() {
        return this.ID;
    }

    public String toString() {
        return "Name: " + this.name + "\n" + "ID: " + this.ID + "\n" + typeOfStudent + "\n" + "University: ";
               // + this.universityName + "\n" + "List of Courses: " + this.course + "\n" + "\n";
    }


    public void addCourse(Course c1, Course c2, Course c3, Course c4) {
        course[] = {c1.courseName,c2.courseName,c3.courseName,c4.courseName};
    }

    public void addCourse(Course c9, Course c10, Course c11) {
        course[] = {c9.courseName,c10.courseName,c11.courseName};
    }
}
