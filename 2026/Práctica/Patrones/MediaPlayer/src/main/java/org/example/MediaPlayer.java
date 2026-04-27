package org.example;

import java.util.LinkedList;
import java.util.List;

public class MediaPlayer {
    private List<Media> media = new LinkedList<>();

    public void addMedia(Media... media) {
        for(Media m : media) {
            this.media.add(m);
        }
    }

    public void play() {
        for(Media m : media) {
            m.play();
        }
    }
}
