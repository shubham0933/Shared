package com.io.serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class ExternizationExample {
	private final static String OUTPUT_FILE = "serializable_file";
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ExternalPair pair = new ExternalPair("Hello", "World");
		System.out.println("Initially: " + pair.toString());

		// Serialize the pair to a file.
		FileOutputStream outputStream = new FileOutputStream(OUTPUT_FILE);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
		objectOutputStream.writeObject(pair);

		// Close all resources.
		objectOutputStream.flush();
		outputStream.close();
		
		// Read the contents from the file and create a new instance.
		ExternalPair copyOfPair = null;
		FileInputStream inputStream = new FileInputStream(OUTPUT_FILE);
		ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
		copyOfPair = (ExternalPair) objectInputStream.readObject();

		// Close all resources.
		objectInputStream.close();
		inputStream.close();
		System.out.println("After de-serialization: " + copyOfPair.toString());
	}

}

class ExternalPair implements Externalizable{
	private String key;
	private String value;
	
	public ExternalPair(){
		this.key=null;
		this.value=null;
	}

	public ExternalPair(String key, String value){
		this.key=key;
		this.value=value;
	}
	
	//this will create issue while de-serialization as no Public constructor
	/*ExternalPair(String key, String value){
		this.key=key;
		this.value=value;
	}*/
	
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		out.writeUTF(key);
		out.writeUTF(value);

	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		this.key = in.readUTF();
		this.value = in.readUTF();

	}

	@Override
	public String toString() {
		return "Pair ";
	}
	
}