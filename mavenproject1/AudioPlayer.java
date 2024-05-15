package com.mycompany.mavenproject1;


public class AudioPlayer implements MediaPlayer{
    MediaAdapter mediaAdapter;
    
    @Override
    public  void play(String audioType, String fileName){
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Tocando arquivo mp3. Nome: " +  fileName);
        }else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }else{
            System.out.println("Arquivo invalido. " + audioType + "formato não suportado");
        }
    }
}
