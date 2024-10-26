class Song {
    String title;
    Song next;

    public Song(String title) {
        this.title = title;
        this.next = null;
    }
}

class Playlist {
    private Song head;

    public Playlist() {
        this.head = null;
    }

    // Metode untuk menambahkan lagu di akhir playlist
    public void addSong(String title) {
        Song newSong = new Song(title);
        if (head == null) {
            head = newSong;
        } else {
            Song current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newSong;
        }
    }

    // Metode untuk menampilkan semua lagu dalam playlist
    public void displayPlaylist() {
        Song current = head;
        if (current == null) {
            System.out.println("Playlist is empty.");
            return;
        }
        while (current != null) {
            System.out.println(current.title);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        Playlist playlist = new Playlist();

        // Menambahkan 3 lagu ke dalam playlist
        playlist.addSong("A Whole New World");
        playlist.addSong("Remaja");
        playlist.addSong("Pelangi");

        // Menampilkan semua lagu di dalam playlist
        System.out.println("Playlist:");
        playlist.displayPlaylist();
    }
}
