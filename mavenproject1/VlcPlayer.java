package com.mycompany.mavenproject1;


public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Tocando um arquivo vlc . Nome: " + fileName);
    }
    @Override
    public void playMp4(String fileName){
        // do nothing
    }
}