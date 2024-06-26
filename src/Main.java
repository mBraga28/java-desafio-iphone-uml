import models.IPhone;

public class Main {
    public static void main(String[] args) {
        IPhone myIPhone = new IPhone();

        // Testing MusicPlayer functionality
        myIPhone.play();
        myIPhone.pause();
        myIPhone.selectMusic("Song 1");

        // Testing Telephone functionality
        myIPhone.call("123-456-7890");
        myIPhone.answer();
        myIPhone.startVoicemail();

        // Testing InternetBrowser functionality
        myIPhone.displayPage("www.example.com");
        myIPhone.addNewTab();
        myIPhone.refreshPage();
    }
}