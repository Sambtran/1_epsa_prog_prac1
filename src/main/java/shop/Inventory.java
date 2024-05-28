package shop;

import java.util.Objects;

public class Inventory {
 private final int  MAX_SIZE;
 private int ItemLength;
 private ClothingItem[] items;
public Inventory(int mAX_SIZE) {
	super();
	MAX_SIZE=mAX_SIZE;
	items = new ClothingItem[mAX_SIZE];
}
public int getItemCount() {
	int largo=0;
	for (int i = 0; i < items.length ; i++) {
		if(items[i]!=null){
			largo++;
		}
	}
	return largo;
}
public void addItem(ClothingItem c) {
	int largo = 0;
	for(int i = 0;i<items.length;i++) {
		if(items[i]!=null) {
			largo++;
		}
	}
	if(largo==0) {
		items[0]=c;
	}else {
		if(largo < MAX_SIZE) {
		items[largo]=c;}else {

		}
		
	}
}
public int checkStock(String name, char size) {
	int cont=0;
	for(int i=0;i<items.length;i++) {
		if(items[i]!=null) {
		if(Objects.equals(items[i].getName(), name) &&items[i].getSize()==size) {
			cont++;
		}
	}}
	return cont;
}
public boolean removeItem(String name, char size){
	ClothingItem[] arraux= new ClothingItem[MAX_SIZE];
	int x=0;
	boolean valor=false;
	if(checkStock(name ,size)>0){
	for(int i=0;i<items.length;i++) {
	if(items[i]!=null) {
		if(Objects.equals(items[i].getName(), name) &&items[i].getSize()==size) {
			items[i]=null;
			valor=true;
		}else{
			arraux[x]=items[i];
			x++;
		}

	}
	}
	for(int z=0;z<items.length;z++) {
		items[z]=arraux[z];
	}}
	return valor;
}
public ClothingItem extractItem(String name, char size){
	if(checkStock(name, size)>0){
		int x=-1;
		for(int i=0;i<items.length;i++) {
			if(items[i]!=null&&items[i].getSize()==size&&items[i].getName().equals(name)){
			x=i;
			}
		}
		if(x>-1){
			ClothingItem aenviar= new ClothingItem(items[x].getName(),items[x].getPrice(),items[x].getSize());
			removeItem(items[x].getName(),items[x].getSize());
			return aenviar;
		}
	}
	return null;

}
public String toString(){
	int largo = 0;
	for(int i = 0;i<items.length;i++) {
		if(items[i]!=null) {
			largo++;
		}
	}
	String devolver = "Nombre	Precio	Tamaño \n";
	for (int i= 0;i<largo;i++){
		devolver+=items[i].getName()+'	'+items[i].getPrice()+'	'+items[i].getSize()+'\n';
	}
	return devolver;
}

	public int getMAX_SIZE() {
		return MAX_SIZE;
	}

	public int getItemLength() {
		return ItemLength;
	}

	public void setItemLength(int itemLength) {
		ItemLength = itemLength;
	}

	public ClothingItem[] getItems() {
		return items;
	}

	public void setItems(ClothingItem[] items) {
		this.items = items;
	}
}
