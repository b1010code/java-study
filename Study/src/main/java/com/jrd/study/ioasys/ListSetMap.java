package com.jrd.study.ioasys;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

// diferença entre List, Set, Map
public class ListSetMap {

	public static void main(String[] args) {

		     //////  List
		
    /*      List<Integer>list; 	
          list = new ArrayList<>(); 
		  list.add(1); 
		  list.add(null);
		  list.add(2);
		  list.add(3); 
		  list.add(3); 
		  list.add(null); 
		  
		  System.out.println(list); */
		  
/*	private static void print(List<Integer>item) { 
		for(int i = 0; i < item.size(); i++) {
			System.out.println(item.get(i));		
	  }
		 
	}*/	
		

		// -------------------------------------------//

		// Creating a new HashSet for iteration
		
	/*	HashSet<Integer> set = new HashSet<>();		
		set.add(10);
		set.add(20);
		set.add(10);
		set.add(50);		
		set.add(50);
		
		Iterator<Integer> it = set.iterator();

		System.out.println("Iterate HashSet using iterator : ");
		
		while (it.hasNext()) {
			
			System.out.print(it.next() + " ");
		}    
		      */
		
		///// ------------------------------------------///////
		
		// MAP
		
	/*	Map<String,String>map = new HashMap<>();
		
		map.put("01", "maria");
		map.put("02", "joao");
		map.put("03", "dilara");
		map.put("04", "douglas");
		map.put("05", "gilberto");
		
		for(String key : map.keySet()) {
			System.out.println("Chave = " + key + ", Nome = " + map.get(key));
		}
			   */
		
	//////---------------------------------------------------------------------////////	
		// Ler e trabalhar com arquivo CSV
				
		Scanner sc = new Scanner(System.in);

		Map<String, Integer> map = new HashMap<>();
		
		                          

		// onde está o arquivo : /home/jrd/Documents/java-studying/java-study/registros.csv

		System.out.print("Digite o caminho do arquivo: ");
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			while (line != null) {

				System.out.println(line);

				String[] fields = line.split(",");

				String name = fields[0];
				Integer votes = Integer.parseInt(fields[1]);

				if (map.get(name) == null) {
					map.put(name, votes);
				} 
				else {
					map.put(name, votes + map.get(name));
				}

				line = br.readLine();
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();
		                   
		
		
	} //main

}//class
