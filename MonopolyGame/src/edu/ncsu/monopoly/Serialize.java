/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ncsu.monopoly;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Mateo Forestier & Fabian Grobert
 */
public class Serialize {

    public void serializer(DataBase dB) {
        try {
            FileOutputStream f = new FileOutputStream("archive");
            BufferedOutputStream b = new BufferedOutputStream(f);
            ObjectOutputStream s = new ObjectOutputStream(b);

            s.writeObject(dB);
            s.close();
        } catch (Exception e) {

        }

    }

    public DataBase recuperate() throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream ff = new FileInputStream("archive");
        BufferedInputStream bb = new BufferedInputStream(ff);
        ObjectInputStream ss = new ObjectInputStream(bb);

        DataBase dB = (DataBase) ss.readObject();

        ss.close();
        return dB;
    }
}
