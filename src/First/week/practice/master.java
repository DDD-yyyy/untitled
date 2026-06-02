package First.week.practice;

public class master extends student{
    public master() {
    }

    public master(String name, int age, String grade) {
        super(name, age, grade);
    }

    @Override
    public void study() {
        System.out.println("攻读硕士学位");

    }

    @Override
    public void sleep() {
        System.out.println("在豪华公寓睡觉");
    }
}
