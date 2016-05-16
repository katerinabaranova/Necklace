package com.baranova.necklace.util;



import com.baranova.necklace.entity.Pearl;
import com.baranova.necklace.entity.Stone;

import java.io.*;

public class Writer {

    public static void writeFile()throws IOException {
        String src=System.getProperty("user.dir")+"/src/by/bsu/OOP_Necklace_Baranova/txt/";
        String filename=src+"stones.txt";
        Stone diamond=new Stone("Diamond",3,0.3,1.0);
        File f=new File(filename);
        PrintWriter printWriter=null;
        try{
            printWriter=new PrintWriter(new FileWriter(f,true));
            StringBuilder stone=new StringBuilder();
            if (diamond instanceof Pearl) {stone.append("Pearl").append(" ");}
                else {stone=stone.append("Stone").append(" ");}
            stone.append(diamond.getName()).append(" ");
            stone.append(diamond.getCost()).append(" ").append(diamond.getWeight()).append(" ");
            stone.append(diamond.getTransparency());
            printWriter.println(stone);
        }catch (FileNotFoundException e){
            System.out.print("Файла нет:" + filename);
        }finally{
            if (printWriter!=null){
                printWriter.close();
            }
        }

    }
}
