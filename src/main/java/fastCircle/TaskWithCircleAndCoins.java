package fastCircle;

public class TaskWithCircleAndCoins {

    private FastCoin fastCoin;
    private Circle circle;

    public TaskWithCircleAndCoins(){

    }

    public void solve(double people, double turn){
        fastCoin = new FastCoin();
        circle = new Circle();

        System.out.println("Номер счастливчика: "+ (int) circle.lastone(people, turn));
        System.out.println("Унес монет: " + (int) fastCoin.counter(people, turn));

    }


}
