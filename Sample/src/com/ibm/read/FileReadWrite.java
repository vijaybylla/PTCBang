package com.ibm.read;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileReadWrite {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		
		Customer cust = new Customer("Vijay","Koramangala");
		
		
		FileOutputStream fileOut = new FileOutputStream("Json.json");
		ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
		objectOut.writeObject(cust);
		
		FileInputStream fileIn = new FileInputStream("Json.json");
		ObjectInputStream objectIn = new ObjectInputStream(fileIn);
		Customer cust3 = (Customer)objectIn.readObject();
		
		System.out.println(cust3.getCustName());
		System.out.println(cust3.getAdress());
		System.out.println("Test 3");
		System.out.println("Changes from sreenivas2");
		System.out.println("From Vijay");
		System.out.println("From Vijay 2");
		
	}

}
