package lk.ijse.gdse68;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Student implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;

    // serialization logic
    @Serial
    private void writeObject(ObjectOutputStream oos) throws IOException {
        oos.defaultWriteObject();
        oos.writeInt(age);
    }

    // deserialization logic
    @Serial
    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        ois.defaultReadObject();
        age = ois.readInt();
    }
}
