public class VideoGame {
    String name;

    public VideoGame() {
        this.name = "Unknown Title";
    }
    
    public VideoGame(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }


    public void setName(String name) {
    this.name = name;
    }

    public String toString() {
        return "Game Title: " + name;
    }
    
    public boolean equals(VideoGame other) {
        return this.name.equals(other.name);
    }


}
