public class ShipButton implements Shipment{
    
    private Ship warehouse;
    
    public ShipButton() {
        warehouse = null;
    }

	@Override
	public void connectTo (Ship warehouse) {
		System.out.println("\nMenghubungkan ke Warehouse ...");
		this.warehouse = warehouse;
		System.out.println("--> Terhubung ke Warehouse");
	}

    @Override
    public void processed() {
        if ( warehouse != null ) {
			boolean shipStatus = warehouse.ship();

			if ( shipStatus )
				System.out.println("--> Pengiriman berhasil dilakukan! ");
			else
				System.out.println("--> pengiriman gagal!");
		}
		else {
			System.out.println("Tidak terhubung ke Warehouse!");
		}
    }

}
