package shop;

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
public int CheckStock(ClothingItem c) {
	int cont=0;
	for(int i=0;i<items.length;i++) {
		if(items[i].igual(c)) {
			cont=cont++;
		}
	}
	return cont;
}

 
}
