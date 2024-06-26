package models;

import intefaces.InternetBrowser;
import intefaces.MusicPlayer;
import intefaces.Telephone;

public class IPhone implements MusicPlayer, Telephone, InternetBrowser {

    // MusicPlayer methods
    @Override
    public void play() {
        System.out.println("Playing music.");
    }

    @Override
    public void pause() {
        System.out.println("Music paused.");
    }

    @Override
    public void selectMusic(String music) {
        System.out.println("Selected music: " + music);
    }

    // Telephone methods
    @Override
    public void call(String number) {
        System.out.println("Calling number: " + number);
    }

    @Override
    public void answer() {
        System.out.println("Answering call.");
    }

    @Override
    public void startVoicemail() {
        System.out.println("Starting voicemail.");
    }

    // InternetBrowser methods
    @Override
    public void displayPage(String url) {
        System.out.println("Displaying page: " + url);
    }

    @Override
    public void addNewTab() {
        System.out.println("New tab added.");
    }

    @Override
    public void refreshPage() {
        System.out.println("Page refreshed.");
    }

}
