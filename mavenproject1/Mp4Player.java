package com.mycompany.mavenproject1;


public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        // do nothing
    }
    
    @Override
    public void playMp4(String fileName) {
        System.out.println("Tocando arquivo Mp4. Nome: "+ fileName);
    }
}
