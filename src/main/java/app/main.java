package app;
import sales.SalesRegister;
import shop.*;
import test.*;
public class main {

	public static void main(String[] args) throws Exception {
		Inventory inv=new Inventory(60);
		ClothingItem prenda1 = new ClothingItem("camisa",44,'S');
		ClothingItem prenda2 = new ClothingItem("camisa",44,'M');
		ClothingItem prenda3 = new ClothingItem("bufanda",66,'S');

		inv.addItem(prenda1);
		inv.addItem(prenda2);
		inv.addItem(prenda3);
		System.out.println(inv.checkStock("camisa", 'S'));
		System.out.println(inv.toString());
		inv.removeItem("camisa", 'S');
		System.out.println(inv.toString());
		ClothingItem prendaaux= inv.extractItem("camisa",'M');
		System.out.println(inv.toString());
		System.out.println(prendaaux.toString());
		Inventory invent =new Inventory(100);
		if(invent!=null){
			SalesRegister sls = new SalesRegister();
			TestClothingItem.checkClass(prenda1.getClass());
			TestInventory.checkClass(inv.getClass());
			TestSalesRegister.checkSalesRegister();
		}

	}

}
