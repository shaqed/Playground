package oop.exe5;

public class Mainer {
	public static void main(String[] args) {
		MySet set1 = new MySet();
		
		set1.add(5);
		set1.add(6);
		set1.print(); // 5 6
		set1.add(6);
		set1.print(); // 5 6
		set1.add(90);
		set1.print(); // 5 6 90
		
		MySet set2 = new MySet();
		set2.add(3);
		set2.add(5);
		set2.add(20);
		
		MySet setUnion = MySet.union(set1, set2);
		setUnion.print(); // 5 6 90 3 20

		MySet setIntersect = MySet.intersect(set1, set2);
		setIntersect.print(); // 5

        MySet setMinus1 = MySet.minus(set1, set2);
        setMinus1.print(); // 6 90

        MySet setMinus2 = MySet.minus(set2, set1);
        setMinus2.print(); // 3 20

        int[] arr = {60,40,33,12};
        MySet set3 = new MySet();
        set3.add(arr);
        set3.print(); // 60 40 33 12

        MySet set4 = new MySet(set3);
        set4.print(); // 60 40 33 12

        MySet.minus(set3, set4).print(); // empty

        set4.remove(33);
        set4.print(); // 60 40 12

		
	}
}
