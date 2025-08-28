package busres;

public class Bus {
    private int Busno;
    private boolean ac;
    private int capacity;

    public Bus(int Busno, boolean ac, int capacity)
    {
        this.Busno = Busno;
        this.ac = ac;
        this.capacity = capacity;
    }

    public int getBusno() {
        return Busno;
    }

    public boolean isAc() {
        return ac;
    }

    public void setAc(boolean ac) {
        this.ac = ac;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void displayBus()
    {
        System.out.println("BusNo :"+Busno + " A/C :"+ac+ " Capacity :"+capacity);
    }

}
