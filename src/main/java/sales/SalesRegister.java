package sales;

import shop.ClothingItem;
import shop.Inventory;

public  class SalesRegister {
    private static long totalSalesCount=0;
    private static double totalSalesAmount=0;

    public static ClothingItem processSale(Inventory inv,String name, char size){
       if(inv.checkStock(name,size)!=-1){
           ClothingItem aux=inv.extractItem(name,size);
           if(aux!=null){
                totalSalesAmount+=aux.getPrice();
                totalSalesCount++;
                return aux;
           }
       }
        return null;
    }
    public static long getTotalSalesCount() {
        return totalSalesCount;
    }

    public static double getTotalSalesAmount() {
        return totalSalesAmount;
    }
    public static String getBalance(){
        return "Cantidad de ventas  Cantidad de articulos vendidos\n"+getTotalSalesAmount()+"   "+getTotalSalesCount();
    }
    public static void resetTotalSalesAmount(){
        totalSalesAmount = 0;
    }
    public static void resetTotalSalesCount(){
        totalSalesCount = 0;
    }
}
