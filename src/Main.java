import com.Sankuj.JavaCorePractice.Activa.Activa;
import com.Sankuj.JavaCorePractice.Bullet.Bullet;
import com.Sankuj.JavaCorePractice.Student.Student;
import com.Sankuj.JavaCorePractice.Vehicle.Vehicle;

import java.util.Scanner;

public class Main {
    public static Student[] fetchStudent(){
        System.out.println("Enter Total Student Count");
        Scanner sc = new Scanner(System.in);
        int studentCount = Integer.parseInt(sc.nextLine());
        Student[] studentList = new Student[studentCount];
        for(int count = 0; count < studentCount; count++){
            Student student  = new Student();
            System.out.println("Enter student Details");
            System.out.print("Name:- ");
            student.setName(sc.nextLine());

            System.out.print("Age:- ");
            student.setAge(sc.nextInt());
            sc = new Scanner(System.in);
            System.out.print("Address:- ");
            student.setAddress(sc.nextLine());
            studentList[count] = student;
        }
        return studentList;
    }

    public static void DisplayStudent(Student... studentList){
        for(Student student : studentList){
            student.GetStudentInfo();
            System.out.println();
        }
    }

    public static void main(String[] args) {
   /* Student[] studentList = fetchStudent();
       DisplayStudent(studentList); */

        Vehicle activa = new Activa(1, "2024", "Tata");
        Vehicle bullet = new Bullet(2, "2024", "Royal Enfield");

        activa.startVehicle();
        activa.driveVehicle(10);
        activa.stopVehicle();

        bullet.stopVehicle();
        bullet.driveVehicle(10);
        bullet.stopVehicle();

    }
}