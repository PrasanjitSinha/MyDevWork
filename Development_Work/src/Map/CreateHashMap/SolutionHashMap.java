package Map.CreateHashMap;

public class SolutionHashMap {

	public static void main(String[] args) {
		CustomHashMap<Integer, Integer> custom = new CustomHashMap<Integer, Integer>();
		custom.put(21, 12);
		custom.put(25, 121);
		custom.put(30, 151);
		custom.put(33, 15);
		custom.put(35, 89);

        System.out.println("value corresponding to key 21="
                     + custom.get(21));
        System.out.println("value corresponding to key 51="
                     + custom.get(51));

        System.out.print("Displaying : ");
        custom.display();

        System.out.println("\n\nvalue corresponding to key 21 removed: "
                     + custom.remove(21));
        System.out.println("value corresponding to key 51 removed: "
                     + custom.remove(51));

        System.out.print("Displaying : ");
        custom.display();

 }
}
