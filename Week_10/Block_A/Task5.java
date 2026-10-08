package Week_10.Block_A;

class SongNode {

    String song;
    SongNode next;

    SongNode(String song) {
        this.song = song;
    }
}

public class Task5 {

    SongNode head;

    void addSong(String song) {

        SongNode newNode = new SongNode(song);

        if (head == null) {
            head = newNode;
            return;
        }

        SongNode temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    void removeSong(String song) {

        if (head == null) {
            return;
        }

        if (head.song.equals(song)) {
            head = head.next;
            return;
        }

        SongNode temp = head;

        while (temp.next != null) {

            if (temp.next.song.equals(song)) {

                temp.next = temp.next.next;
                return;
            }

            temp = temp.next;
        }
    }

    void display() {

        SongNode temp = head;

        while (temp != null) {

            System.out.print(temp.song + " -> ");

            temp = temp.next;
        }

        System.out.println("NULL");
    }

    public static void main(String[] args) {

        Task5 playlist = new Task5();

        playlist.addSong("Song A");
        playlist.addSong("Song B");
        playlist.addSong("Song C");
        playlist.addSong("Song D");

        System.out.println("Original Playlist:");

        playlist.display();

        playlist.removeSong("Song B");

        System.out.println("After Removing Song B:");

        playlist.display();
    }
}