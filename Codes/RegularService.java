public class RegularService implements ShipmentStrategy{

    private float rate;
    private String est;

    public RegularService() {
        rate = 0;
        est = "3-5 days";
    }

    @Override
    public void count(float weight) {
        this.rate = weight * 10000;
    }

    @Override
    public String getServiceName() {
        return "Regular";
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
