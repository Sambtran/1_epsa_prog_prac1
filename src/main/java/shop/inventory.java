package shop;

import java.util.Objects;

public class inventory {
 private final int  MAX_SIZE;
 private int ItemLength;
 private ClothingItem[] items;
public inventory(int mAX_SIZE) {
	super();
	MAX_SIZE=mAX_SIZE;
	items = new ClothingItem[mAX_SIZE];
}
public int getItemCount() {
	return items.length;
}
public void setItem(ClothingItem c) throws Exception {
	if(items.length==0) {
		items[0]=c;
	}else {
		if(items.length < MAX_SIZE) {
		ClothingItem[] arraux= new ClothingItem[items.length+1];
		arraux[arraux.length]=c;
		items=arraux.clone();}else {
			throw new Exception("fallo");
		}
		
	}
}
public int CheckStock(String name,char size) {
	int cont=0;
	for(int i=0;i<items.length;i++) {
		if(Objects.equals(items[i].getName(), name) &&items[i].getSize()==size) {
			cont=cont++;
		}
	}
	return cont;
}
public boolean removeItem(String name, char size){
	ClothingItem[] arraux= new ClothingItem[MAX_SIZE];
	int x=0;
	boolean valor=false;
	if(CheckStock(name ,size)>0){
	for(int i=0;i<items.length;i++) {
		if(Objects.equals(items[i].getName(), name) &&items[i].getSize()==size) {
			items[i]=null;
			valor=true;
		}else{
			arraux[x]=items[i];
			x++;
		}

	}
	items=arraux.clone();}
	return valor;
}
public ClothingItem extractItem(String name, char size){
	if(CheckStock(name, size)>0){
		int x=-1;
		for(int i=0;i<items.length;i++) {
			if(items[i].getSize()==size&&items[i].getName().equals(name)){
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
	String devolver = "Nombre	Precio	Tamaño \n";
	for (int i= 0;i<items.length;i++){
		devolver+=
	}
}
 
}
