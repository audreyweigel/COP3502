import java.io.FileInputStream;
import java.lang.RuntimeException;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;

public class HeiferGenerator {

    protected String image = "";
    protected String file = "";
    public FileCow(String name, String file)
    {
        super(name);
        this.file = file;
        try
        {
            // new file
            FileInputStream stream = new FileInputStream(this.file);
            Scanner scnr = new Scanner(stream);

            while (scnr.hasNextLine())
            {
                image = image + scnr.nextLine() + "\n";
            }

            setImage(image);
            stream.close();
        }
        catch(FileNotFoundException exception)
        {
            throw new RuntimeException("whoops, made a mistake");
        }
        catch(IOException IO)
        {

        }
    }


    public void setImage()
    {
        throw new RuntimeException("Cannot reset image");
    }
}
