package Third.week.Sunday;

public class phone extends smartdevice{
    @Override
    public double payment() {
        double payment=super.payment();
        payment=payment*0.9;
        return payment;
    }
}
