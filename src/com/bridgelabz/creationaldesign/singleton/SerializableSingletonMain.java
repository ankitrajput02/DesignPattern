package com.bridgelabz.creationaldesign.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/**Title:Serialization and Singleton
 * Created By:Ankit Rajput
 *
 */
public class SerializableSingletonMain{
	public static void main(String args[]) {
		 
	    try {
	        SerializationSingleton instance1 = SerializationSingleton.getInstance();
	        ObjectOutput out = null;
	 
	        // Serialize object state to file
	        out = new ObjectOutputStream(new FileOutputStream("serializedData.ser"));
	        out.writeObject(instance1);
	        out.close();
	 
	        // deserialize from file to object
	        ObjectInput in = new ObjectInputStream(new FileInputStream("serializedData.ser"));
	        SerializationSingleton instance2 = (SerializationSingleton) in.readObject();
	        in.close();
	 
	        System.out.println("instance1 hashCode = " + instance1.hashCode());
	        System.out.println("instance2 hashCode = " + instance2.hashCode());
	        
	        /**
	         * Comment readResolve() method in SerializationSingleton and you will get multiple objects
	         */
	        
	        if (instance1 == instance2) {
				System.out.println("Same/Single Object");
			} else {
				System.out.println("Not Singleton Object");
			}
	 
	    } catch (IOException | ClassNotFoundException e) {
	        e.printStackTrace();
	    }
	 
	}
}
