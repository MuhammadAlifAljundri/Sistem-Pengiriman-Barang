import java.util.ArrayList;

public class Warehouse implements Ship {

    private ShipmentStrategy service;
    private ArrayList <Item> items;

    public Warehouse() {
        service = null;
        items = new ArrayList<> ();  
    }
    
    @Override
    public void addItem (Item item) {
        System.out.println("Adding: " + item.getId() + " (weight: " + item.getWeight() + " Kg) to shipping warehouse ...");
		this.items.add (item);
    }

    @Override
	public boolean isEmpty () {
		return items.size() == 0;
	}
    
    @Override
    public float calculateWeight() {
        float totalWeight = 0;

		for ( Item item : items ) {
			totalWeight += item.getWeight();
		}

		return totalWeight;
    }

    @Override
    public void connectTo(ShipmentStrategy service) {
        System.out.println("\nConnecting to shipping service ... ");
		this.service = service;
		System.out.println("--> Connected to selected service : " + service.getServiceName() +"\n");
    }

    @Override
    public boolean ship() {
        boolean shipmentStatus = false;
        if ( !isEmpty() && service != null ) {
            shipmentStatus = true;
			service.count(calculateWeight());
            System.out.println("--> Total weight: " + calculateWeight() + " Kg");
            System.out.println("--> Total rate: Rp." + service.getRate());
			System.out.println("\nThe package will be shipping by " + service.getServiceName()+" Service.");
            System.out.println("Estimated time of arrival: " + service.getEst() + ".");
		}
        else {
            System.out.println("\nSorry, your package is empty or you haven't selected the service yet.");
        }

        return shipmentStatus;
    }

}