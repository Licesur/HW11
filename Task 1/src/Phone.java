public class Phone {
    public String number;
    public String model;
    public final String MANUFACTURING = "China";
    Phone(){
        number = "00000000000";
        model = null;
    }
    Phone(String number, String model){
        this.number = number;
        this.model = model;
    }
    public void receieveCall(String name){
        System.out.println("Звонит абонент по имени " + name);
    }
    public void receiveCall(String name, String number){
        System.out.println("Звонит абонент по имени " + name + "\nНомер " + number);
    }
}
