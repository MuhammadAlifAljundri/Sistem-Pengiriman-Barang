public class ShipButton implements Shipment{
    
    private Ship warehouse;
    
    public ShipButton() {
        warehouse = null;
    }

	@Override
	public void connectTo (Ship warehouse) {
		System.out.println("\nConnecting to shipping warehouse ...");
		this.warehouse = warehouse;
		System.out.println("--> Warehouse connected");
	}

    @Override
    public void processed() {
        if ( warehouse != null ) {
			boolean shipStatus = warehouse.ship();

			if ( shipStatus )
				System.out.println("--> Shipment done succesfully! ");
			else
				System.out.println("--> Shipment failed!");
		}
		else {
			System.out.println("Warehouse not Connected!");
		}
    }

}
