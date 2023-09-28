public class emailObserver implements observer{

    String emailId;
    emailObserver(String emailId)
    {
        this.emailId=emailId;
    }
    @Override
    public void notifys() {
        System.out.println("Email is sent to" + emailId);
    }
}
