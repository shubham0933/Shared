package com.io.serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationExample{

	static int i=10;//not serialized
	transient int j=20;//not serialized
	int k=30;//serialized
	/*
	 * serialization means to convert graph of obj to array of bytes while sending data over network or saving it on disk
	 * this prevent mismatch while retrieving data.
	 */
	private static final long serialVersionUID = -4556794146866096552L;
	private final static String OUTPUT_FILE = "serializable_file";

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		SerializablePair pair = new SerializablePair("Hello", "World");
		System.out.println("Initially: " + pair.toString());

		// Serialize the pair to a file.
		FileOutputStream outputStream = new FileOutputStream(OUTPUT_FILE);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
		objectOutputStream.writeObject(pair);

		// Close all resources.
		objectOutputStream.flush();
		outputStream.close();
		
		// Read the contents from the file and create a new instance.
		SerializablePair copyOfPair = null;
		FileInputStream inputStream = new FileInputStream(OUTPUT_FILE);
		ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
		copyOfPair = (SerializablePair) objectInputStream.readObject();

		// Close all resources.
		objectInputStream.close();
		inputStream.close();
		System.out.println("After de-serialization: " + copyOfPair.toString());

	}

}

class SerializablePair implements Serializable{
	private String key = null;
	private String value = null;

	public SerializablePair(String key, String value) {
		this.key = key;
		this.value = value;
	}
	
	@Override
	public String toString() {
		return "Pair ";
	}
}
