package First.week.practice;

public class generalcourseteacher extends teacher{
    public generalcourseteacher() {
    }

    public generalcourseteacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("教授通识课");

    }
}
