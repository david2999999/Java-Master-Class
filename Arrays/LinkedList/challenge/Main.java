package Arrays.LinkedList.challenge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {
        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("WindBringer", 4.2);
        album.addSong("SandBringer", 4.2);
        album.addSong("WaterBringer", 7.2);
        album.addSong("IceBringer", 4.7);
        album.addSong("RockBringer", 5.2);
        album.addSong("FireBringer", 4.8);

        albums.add(album);

        album = new Album("Pop Music", "AC");
        album.addSong("Pop1", 5.2);
        album.addSong("Pop2", 4.8);
        album.addSong("Pop3", 4.9);
        album.addSong("Pop4", 5.2);
        album.addSong("Pop5", 4.8);
        album.addSong("Pop6", 4.9);
        album.addSong("Pop7", 5.2);
        album.addSong("Pop9", 4.8);

        albums.add(album);

        LinkedList<Song> playList = new LinkedList<>();
        albums.get(0).addToPlayList("WindBringer", playList);
        albums.get(0).addToPlayList("RockBringer", playList);
        albums.get(0).addToPlayList("FireBringer", playList);
        albums.get(0).addToPlayList("WaterBringer", playList);
        albums.get(1).addToPlayList("Pop1", playList);
        albums.get(1).addToPlayList("Pop5", playList);
        albums.get(1).addToPlayList("Pop3", playList);
        albums.get(1).addToPlayList("Pop2", playList);
        albums.get(1).addToPlayList("Pop9", playList);

        play(playList);
    }

    private static void play(LinkedList<Song> playList) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;

        ListIterator<Song> listIterator = playList.listIterator();
        if (playList.size() == 0) {
            System.out.println("No songs in playlist");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;
                case 1:
                    if (!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }

                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("Reached end of the playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }

                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("Reached the start of the playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
            }
        }


    }
}
