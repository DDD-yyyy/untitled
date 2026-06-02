package First.week.practice;

public class student extends person{
    private String grade;
//构造方法
    public student() {
    }

    public student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }
//getter和setter方法
    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    //方法
    public void study(){
        System.out.println("学习");
    }
}
