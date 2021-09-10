package collection.treeSet.comparator;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		return s1.compareTo(s2) * -1;
	}

}

public class TreeSetComparatorTest {

	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>(new MyComparator());
		treeSet.add("ȫ�浿");
		treeSet.add("��ټ�");
		treeSet.add("�̼���");
		
		for(String str: treeSet) {
			System.out.println(str);
		}
	}

}
