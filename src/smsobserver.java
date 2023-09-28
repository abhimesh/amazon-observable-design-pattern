public class smsobserver implements observer{

    int number;
    smsobserver(int number)
    {
        this.number=number;
    }
    @Override
    public void notifys() {
        System.out.println("SMS is sent to" + Integer.toString(number));
    }
}
