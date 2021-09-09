package thtuan1;

import java.io.*;
public class btTuan1 {
   public static void main(String[] args) {
      try{
         int ch = System.in.read();
         System.out.println("ky tu " + (char)ch + " co ma ascii = "+ ch);
      }
      catch(IOException e){
            System.out.println(e);
      }
   }
}
