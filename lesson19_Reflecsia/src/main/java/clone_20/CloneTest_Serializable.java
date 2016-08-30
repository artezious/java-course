package clone_20;

import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;

import java.io.*;

/**
 * Created by WEO on 8/26/16.
 */
public class CloneTest_Serializable {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        File file = new File("user.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        User user = new User("n1", "n2", new Company("XXX"));

        objectOutputStream.writeObject(user);

        objectOutputStream.flush();
        objectOutputStream.close();


        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        User clone = (User) objectInputStream.readObject();

        System.out.println("память " + (user == clone));
        System.out.println("content " + user.equals(clone));

        user.getCompany().setCompanyName("zzz");
        System.out.println(clone.getCompany().getCompanyName());

    }

}
