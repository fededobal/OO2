package org.example;

public class VideoStreamAdapter extends Media {
    private VideoStream videoStream;

    public VideoStreamAdapter(VideoStream videoStream) {
        this.videoStream = videoStream;
    }

    @Override
    public void play() {
        // Adaptamos el mensaje play() al mensaje reproducir() del tercero
        this.videoStream.reproduce();
    }
}
