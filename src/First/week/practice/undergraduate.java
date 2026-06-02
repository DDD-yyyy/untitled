package First.week.practice;

public class undergraduate extends student{
    public undergraduate() {
    }

    public undergraduate(String name, int age, String grade) {
        super(name, age, grade);
    }

    @Override
    public void study() {
        System.out.println("攻读学士学位");
    }
}
