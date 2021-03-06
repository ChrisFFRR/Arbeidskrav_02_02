package sample;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/***
 * Klasse for å lese og skrive bilder i Resources/Img til disk.
 */


public class ImageDataReader {
    private List<File> imageCollection;

    public ImageDataReader() {
        this.imageCollection = new ArrayList<>();
        loadImagesFromDirectory();
    }

    public void loadImagesFromDirectory() {

        File folder = new File("Resources/Img");
        File[] fileList = folder.listFiles();

        for (File file : fileList) {
            imageCollection.add(file);
        }
        Collections.sort(imageCollection);
    }


    public File getImageNumber(int i) {
        return imageCollection.get(i);
    }

    public int getNumberOfImages() {
        return imageCollection.size();
    }
}

