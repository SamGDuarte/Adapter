package com.mycompany.mavenproject1;


public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        
        audioPlayer.play("mp3", "Boate azul.mp3");
        audioPlayer.play("mp4", "Garota de ipanema.mp4");
        audioPlayer.play("vlc", "Brasilia amarela.mvlc");
        audioPlayer.play("avi", "Meteoro da paixão.avi");
    }
}
