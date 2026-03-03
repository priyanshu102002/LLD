package DesignPatterns.Observer;

public class Example {
    public static void main(String[] args) {

        Youtube channel = new Youtube();

        Observer user1 = new Subscriber("Priyanshu");
        Observer user2 = new Subscriber("Rahul");

        channel.addObserver(user1);
        channel.addObserver(user2);

        channel.videoUpload("Observer Pattern Explained");
    }
}
