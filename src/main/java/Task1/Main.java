package Task1;

import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("-- Исходный объект -----------------------------");
        Student studentToSave = new Student("Gladis Maria Johnson", 20, 4.79);
        System.out.println(studentToSave);
        FileOutputStream out = new FileOutputStream("Student_Save.bin");
        ObjectOutputStream objectOut = new ObjectOutputStream(out);

        objectOut.writeObject(studentToSave);
        objectOut.close();

        System.out.println("-- Прочитанный объект --------------------------");
        Student studentToRead;

        FileInputStream in = new FileInputStream("Student_Save.bin");
        ObjectInputStream objectIn = new ObjectInputStream(in);

        studentToRead = (Student) objectIn.readObject();
        System.out.println(studentToRead);
    }
}
