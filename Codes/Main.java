public class Main {
    public static void main(String[] args) {
		RegularService regularService = new RegularService();

		Warehouse warehouse = new Warehouse();
		ShipButton button = new ShipButton ();

		button.connectTo (warehouse);
		warehouse.connectTo (regularService);

		warehouse.addItem ( new Item ("Item-01", 2));
        warehouse.addItem ( new Item ("Item-02", 3));

		button.processed();
	}
}
