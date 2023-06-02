package test.collectoin.col;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Testsset {

	public static void main(String[] args) {
		HashSet<Integer> set=new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(null);
		set.add(3);
		System.out.println(set);
		
		LinkedHashSet<Integer> lset=new LinkedHashSet<Integer>();
		System.out.println("LinkedHashSet");
		lset.add(5);
		lset.add(1);
		lset.add(2);
		lset.add(3);
		lset.add(null);
		lset.add(3);
		System.out.println(lset);
		TreeSet<Integer> tree=new TreeSet<Integer>();
		System.out.println("TREESET!!!!!");
		tree.add(5);
		tree.add(2);tree.add(3);tree.add(1);tree.add(0);tree.add(5);
		tree.add(null);
		System.out.println(tree);
		
	}

}
