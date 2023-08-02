public class KM50Decorator  extends Decorator implements Atraccion {
    public KM50Decorator(Atraccion e){
        super(e);
    }
    public void setDificulty(){
        atraccion.setDificulty();
        modify();
    }
    public void modify(){
        System.out.println("la atraccion va a KM50 kilometros por hora");
    }
}
