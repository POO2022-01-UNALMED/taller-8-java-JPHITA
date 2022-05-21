package futbol;

public class Portero extends Futbolista{
    public short golesRecibidos;
    public byte dorsal;

    public Portero(String nombre, int edad, short goles, byte dorsal){
        super(nombre, edad, "Portero");
        this.golesRecibidos = goles;
        this.dorsal = dorsal;
    }

    public boolean jugarConLasManos(){
        return true;
    }

    public String toString(){
        return super.toString()
                + " con el dorsal " + this.dorsal
                + ". Le han marcado " + this.golesRecibidos;
    }

    @Override
    public int compareTo(Object o) {
        return Math.abs(this.golesRecibidos - ((Portero) o).golesRecibidos);
    }

    
}
