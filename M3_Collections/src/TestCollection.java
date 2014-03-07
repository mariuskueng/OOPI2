import java.util.*;

public class TestCollection {

	public static void main(String[] args) {
		Set<Person> set1= new HashSet<Person>();
		Set<Person> set2= new TreeSet<Person>();
		Map<Integer, Person> map1= new HashMap<Integer, Person>();
		Map<String, Person> map2= new HashMap<String, Person>();
		
		Person[] personen= new Person[6];
		personen[0]= new Person(34, "Paul", 3255346);
		personen[0].setAlter(25);
		personen[1]= new Person(21, "Peter", 6325436);
		personen[2]= new Person(25, "Karl", 3255346);
		personen[3]= new Person(23, "Sabrina", 1435425);
		personen[4]= new Person(21, "Judith", 1435425);
		personen[5]= new Person(25, "Johanna", 6325436);
		for (int i=0; i<personen.length; i++){
			set1.add(personen[i]);
			set1.add(personen[i]);
			set2.add(personen[i]);
			map1.put(personen[i].getAlter(), personen[i]);
			map2.put(personen[i].getName(), personen[i]);
		}
		
		System.out.println("set1: HashSet mit Size: "+ set1.size());
		printWithIterator(set1);
//		Iterator<Person> iSet1 = set1.iterator();
//		while (iSet1.hasNext()) {
//			System.out.println(iSet1.next());
//		}
		
		System.out.println("set2: TreeSet mit Size: " +set2.size());
		printWithIterator(set2);
//		Iterator<Person> iSet2 = set2.iterator();
//		while (iSet2.hasNext()) {
//			System.out.println(iSet2.next());
//		}
		
		System.out.println("map1: HashMap mit Size: " +map1.size());
		printMap(map1);
//		Iterator<Integer> iMap1 = map1.keySet().iterator();
//		while (iMap1.hasNext()) {
//			Integer key = (Integer) iMap1.next();
//			System.out.println(key + " --> " + map1.get(key));
//		}
		
		System.out.println("map2: HashMap mit Size: "+ map2.size());
		
	}
	
	public static void printWithIterator(Collection<?> c) {
		Iterator<?> i = c.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
	
	public static <T> void printCollection(Collection<T> c){
		for (T p: c){
			System.out.println(p);
	    }
	}
	
	public static <T, K> void printMap(Map<T, K> m){
		Iterator<T> i = m.keySet().iterator();
		while (i.hasNext()) {
			Integer key = (Integer) i.next();
			System.out.println(key + " --> " + m.get(key));
		}
	}
}
