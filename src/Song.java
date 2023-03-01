import java.util.ArrayList;

public class Song {
    private String title;
    private String artist;
    private ArrayList<String> newListeners;
    public Song(String title, String artist){
        this.title = title;
        this.artist = artist;
        newListeners = new ArrayList();
    }
    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }
    public int howMany(ArrayList<String> input){
        int count = 0;
        for(String x : input){
            if(!newListeners.contains(x.toLowerCase())){
                newListeners.add(x.toLowerCase());
                count++;
            }
        }
        return count;
    }

}
