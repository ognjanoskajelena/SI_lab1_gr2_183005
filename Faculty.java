import java.util.List;

class Faculty {
    String facultyName;
    List<Student> students;

    public Faculty(String facultyName, List<Student> students){
        this.facultyName = facultyName;
        this.students = students;
    }

    public void addStudent(Student newStudent){
        this.students.add(newStudent);
    }

    public void removeStudent(Student student){
        this.students.remove(student);
    }

    public double averageGrade(){
        double suma = 0;
        for(Student s : this.students){
            suma += s.getAverage();
        }
        return suma/this.students.size();
    }

    public double averageECTSCredits(){
        double ects_total = 0;
        for(Student s : this.students){
            ects_total += s.ECTSCredits();
        }
        return ects_total/this.students.size();
    }
}
