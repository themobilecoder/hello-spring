package com.rafaelkarlo.configuration;

import com.rafaelkarlo.objects.CDPlayer;
import com.rafaelkarlo.objects.CompactDisc;
import com.rafaelkarlo.objects.MediaPlayer;
import com.rafaelkarlo.objects.Metallica;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayerConfig {

    @Bean
    public CompactDisc compactDisc() {
        return new Metallica();
    }

    @Bean
    public MediaPlayer mediaPlayer(CompactDisc compactDisc) {
        return new CDPlayer(compactDisc);
    }
}