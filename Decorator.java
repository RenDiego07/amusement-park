public abstract class Decorator implements Atraccion {
    public Atraccion atraccion;
    Decorator(Atraccion a){
        this.atraccion = a;
    }


    public void setDificulty(){
        atraccion.setDificulty();
    }

}
