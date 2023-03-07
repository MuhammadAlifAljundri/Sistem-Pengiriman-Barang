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
        System.out.println("Menambahkan: " + item.getId() + " (berat : " + item.getWeight() + " Kg) ke gudang pengiriman ...");
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
        System.out.println("\nMenghubungkan ke layanan pengiriman ... ");
		this.service = service;
		System.out.println("-->  Terhubung ke layanan yang dipilih : " + service.getServiceName() +"\n");
    }

    @Override
    public boolean ship() {
        boolean shipmentStatus = false;
        if ( !isEmpty() && service != null ) {
            shipmentStatus = true;
			service.count(calculateWeight());
            System.out.println("--> Total berat: " + calculateWeight() + " Kg");
            System.out.println("--> Total harga: Rp." + service.getRate());
			System.out.println("\nPaket akan dikirim dengan layanan " + service.getServiceName()+".");
            System.out.println("Perkiraan paket akan tiba: " + service.getEst() + ".");
		}
        else {
            System.out.println("\nMaaf, Paketmu kosong atau kamu belum memilih layanan pengiriman");
        }

        return shipmentStatus;
    }

}