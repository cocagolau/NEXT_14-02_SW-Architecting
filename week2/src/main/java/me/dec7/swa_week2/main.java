package me.dec7.swa_week2;

import java.io.File;

import me.dec7.swa_week2.parser.XMLParser;
import me.dec7.swa_week2.sort.ISort;
import me.dec7.swa_week2.sort.SimpleSortFactory;
import me.dec7.swa_week2.sort.SortFactory;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

public class main {

	public static void main(String[] args) {

		int[] data = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		int[] result;
		Serializer serializer;
		File config;
		
		System.out.println("raw data");
		printArr(data);
		ISort sort = null;
		SortFactory sortFactory = new SimpleSortFactory();

		try {
			serializer = new Persister();
			config = new File("config.xml");
			XMLParser parser = serializer.read(XMLParser.class, config);
			String sortType = parser.getSortType();

			sort = sortFactory.createFactory(sortType);

			System.out.println("SortType: " + sortType);
			result = sort.sort(data);
			printArr(result);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void printArr(int[] arr) {

		System.out.println("start");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]: " + arr[i]);
		}
		System.out.println("end");
	}

}
