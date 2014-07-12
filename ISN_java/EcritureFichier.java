
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.File;
public class EcritureFichier{

public static void main(final String[] args) {
        final String chemin = "data.txt";
        final File fichier =new File(chemin); 
        try {
            // Creation du fichier
            fichier .createNewFile();
            // creation d'un writer (un écrivain)
            final FileWriter writer = new FileWriter(fichier);
            try {
                writer.write("ceci est un texte\n");
            } finally {
                // quoiqu'il arrive, on ferme le fichier
                writer.close();
            }
        } catch (Exception e) {
            System.out.println("Impossible de creer le fichier");
        }
    }
}
