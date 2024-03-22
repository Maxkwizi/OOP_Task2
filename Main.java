
public class Main {
public static void main(String[] args) {
Market market = new Market();
market.addPersonToQueue("Василий");
market.addPersonToQueue("Ирина");
market.addPersonToQueue("Геннадий");
market.addPersonToQueue("Кристина");
market.addPersonToQueue("Игнат");
market.addPersonToQueue("Елена");
market.addPersonToQueue("Андрей");


    System.out.println("Людей в очереди: " + market.size());
    market.removePersonFromQueue();
    market.removePersonFromQueue();
    market.removePersonFromQueue();
    market.removePersonFromQueue();
    market.removePersonFromQueue();
    market.removePersonFromQueue();
    market.removePersonFromQueue();
    System.out.println("Людей в очереди: " + market.size());
}
}