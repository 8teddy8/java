package ex1;

/**
 * @author KOSTA
 * Document : MP3Phone Created on : 2014. 9. 12, ¿ÀÀü 10:00:11
 */
public class MP3Phone extends Ex1_Super{
    private int size;
    public MP3Phone(String model, String num, int chord, int size){
        this.size = size;
        super.model = model;
        super.chord = chord;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
           
}
