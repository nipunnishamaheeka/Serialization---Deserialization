package lk.ijse.gdse68;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Amal", 2);

        // serialization
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.ser"))) {
            oos.writeObject(student);
            System.out.println("Serialization successful : " + student);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // deserialization
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.ser"))) {
            Student deserializedStudent = (Student) ois.readObject();
            System.out.println("Deserialization successful : " + deserializedStudent);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}