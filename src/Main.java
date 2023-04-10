import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        File f = new File();
        Check ch = new Check();
        BufferedReader bw = f.bw;
        System.out.println("Купи слона");
        try (FileWriter fileWriter = f.fw) {
            ch.str="";
            do {
                ch.s = f.bw.readLine();
                if (ch.s.compareTo("стоп") == 0) break;

                ch.s = ch.s + "\r\n";
                if (ch.ifDuplicated(ch.s)==false)
                    System.out.println("Что аргументы кончились?Купи слона!");
                else System.out.println("Все говорят "+ ch.s+ ", а ты купи слона");
                ch.str = ch.str + ch.s;

                f.fw.write(ch.s);
            } while (ch.s.compareTo("стоп") != 0);

        }
        catch(IOException exc) {
            System.out.println("exception io");
        }
        System.out.println("До свидания");
    }
        } 

