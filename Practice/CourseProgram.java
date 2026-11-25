package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Course{
    private int courseId;
    private String courseName;
    private String courseAdmin;
    private int quiz;
    private int handson;

    public Course(int courseId, String courseName, String courseAdmin, int quiz, int handson){
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseAdmin = courseAdmin;
        this.quiz = quiz;
        this.handson = handson;
    }

    public int getCourseId(){
        return this.courseId;
    }

    public void setCourseId(int courseId){
        this.courseId = courseId;
    }

    public String getCourseName(){
        return this.courseName;
    }

    public void setCourseName(String courseName){
        this.courseName = courseName;
    }

    public String getCourseAdmin(){
        return this.courseAdmin;
    }

    public void setCourseAdmin(String courseAdmin){
        this.courseAdmin = courseAdmin;
    }

    public int getQuiz(){
        return this.quiz;
    }

    public void setQuiz(int quiz){
        this.quiz = quiz;
    }

    public int getHandson(){
        return this.handson;
    }

    public void setHandson(int handson){
        this.handson = handson;
    }
}

public class CourseProgram {

    public static int findAvgOfQuizByAdmin(Course c[],String val){
        int count = 0;
        int quizSum = 0;

        for(Course cs : c){
            if(cs.getCourseAdmin().equalsIgnoreCase(val)){
                count += 1;
                quizSum += cs.getQuiz();
            }
        }

        if(count == 0) return 0;
        return (quizSum / count);
    }

    public static Course[] sortCourseByHandsOn(Course c[], int val){
        ArrayList<Course> result = new ArrayList<>();

        for(Course cs : c){
            if(cs.getHandson() < val){
                result.add(cs);
            }
        }

        if(result.isEmpty()){
            return null;
        }

        result.sort(Comparator.comparingInt(Course::getHandson));

        return result.toArray(new Course[0]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); sc.nextLine();

        Course c[] = new Course[n];

        for(int i=0;i<n;i++){
            int id = sc.nextInt(); sc.nextLine();
            String name = sc.nextLine();
            String admin = sc.nextLine();
            int quiz = sc.nextInt(); sc.nextLine();
            int handson = sc.nextInt(); sc.nextLine();

            c[i] = new Course(id, name, admin, quiz, handson);
        }

        String searchAdmin = sc.nextLine();
        int searchHandsOn = sc.nextInt(); sc.nextLine();

        int avg = findAvgOfQuizByAdmin(c, searchAdmin);

        if(avg > 0){
            System.out.println(avg);
        } else{
            System.out.println("No Course found.");
        }

        Course result[] = sortCourseByHandsOn(c, searchHandsOn);

        if(result != null){
            for(Course cs : result){
                System.out.println(cs.getCourseName());
            }
        } else{
            System.out.println("No Course found with mentioned attribute.");
        }

        sc.close();
    }
}
