package First.week.practice;

public class majorcourseteacher extends teacher{
    private String subject;

    public majorcourseteacher() {
    }

    public majorcourseteacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void teach() {
        System.out.println("教授"+subject);
    }
}
