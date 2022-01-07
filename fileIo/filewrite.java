

import java.io.FileReader;
import java.io.FileWriter;

public class filewrite{
    public static void main(String[] args) throws Exception{
        // try{
        FileWriter wr = new FileWriter("x.txt");
        FileReader r = new FileReader("y.txt");
        wr.write("Hello World xasaas");
        int i;
        while((i = r.read()) != -1){
        System.out.print((char)i);
        wr.write((char)i);    
    // }

        r.close();
        wr.close();
        // }catch (Exception e){
        //     System.out.println(e);
        // }

    }
}
    
}
