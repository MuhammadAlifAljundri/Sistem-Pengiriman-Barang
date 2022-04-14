public interface Ship {
    public void addItem (Item item);
    public boolean isEmpty();
    public float calculateWeight();
    public void connectTo(ShipmentStrategy service);
    public boolean ship();
}
