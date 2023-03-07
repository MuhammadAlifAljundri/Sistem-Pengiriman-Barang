public class EconomyService implements ShipmentStrategy{

    private float rate;
    private String est;

    public EconomyService() {
        rate = 0;
        est = "6-15 hari";
    }

    @Override
    public void count(float weight) {
        this.rate = weight * 9000;
    }

    @Override
    public String getServiceName() {
        return "Economy";
    }

    @Override
    public float getRate() {
        return rate;
    }

    @Override
    public String getEst() {
        return est;
    }

}
