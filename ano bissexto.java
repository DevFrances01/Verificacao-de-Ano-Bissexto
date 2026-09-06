import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
      Scanner bi= new Scanner(System.in);
        int ano = bi.nextInt();
        if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)) {
            System.out.println("BISSEXTO");
        } else {
            System.out.println("NAOBISSEXTO");
        }
    
  }
}