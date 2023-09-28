public class Main {
    public static void main(String[] args) {

        observer  o1=new smsobserver(123);
        observer o2=new emailObserver("abhimesh.sarin@phonepe.com");
        observer o3=new smsobserver(321);

        iphonestockobservalble iphonestockobservalble=new iphonestockobservalble();
        iphonestockobservalble.addUser(o1);
        iphonestockobservalble.addUser(o2);
        iphonestockobservalble.setStockcount(10);
    }
}