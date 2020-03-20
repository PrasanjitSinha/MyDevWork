import java.util.Arrays;


public class CustomArrayList {

	private Object[] myStore;
	private int actSize = 0;
	
	public CustomArrayList() {
		myStore = new Object[10];
	}
	
	public Object get(int index){
		if(index < actSize){
			return myStore[index];
		} else{
			throw new ArrayIndexOutOfBoundsException();
		}
	}
	
	public void add(Object obj){
		if(myStore.length - actSize <= 5){
			increaseListSize();
		}
		myStore[actSize++] = obj;
	}
	
	public int size(){
		return actSize;
	}
	
	public Object remove(int index){
		if(index < actSize){
            Object obj = myStore[index];
            myStore[index] = null;
            int tmp = index;
            while(tmp < actSize){
                myStore[tmp] = myStore[tmp+1];
                myStore[tmp+1] = null;
                tmp++;
            }
            actSize--;
            return obj;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
	}
	
	private void increaseListSize() {
		myStore = Arrays.copyOf(myStore, myStore.length*2);
		System.out.println("\nNew length :" + myStore.length);
	}

	public static void main(String[] args) {
		CustomArrayList list  = new CustomArrayList();
		list.add(new Integer(2));
		list.add(new Integer(5));
		list.add(new Integer(20));
		list.add(new Integer(1));
		list.add(new Integer(23));
		for(int i=0;i<list.size();i++){
			System.out.print(list.get(i) + " ");
		}
		list.add(new Integer(10));
		System.out.println("Element at Index 5:"+list.get(5));
        System.out.println("List size: "+list.size());
        System.out.println("Removing element at index 2: "+list.remove(2));
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
	}
}
