public interface ShipmentStrategy {
    public void count(float weight);
    public String getServiceName();
    public float getRate();
    public String getEst();
}
