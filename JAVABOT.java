package DISCORDBOT;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;

public class JAVABOT{
    public static void main(String[] args) {
        JDA bot = JDABuilder.createDefault("MTE1MTIxMzA3OTA5OTYxMzMwNA.Gnvyk5.R8qOURRCsM6TEs6ab36oDRZKpjCmwVV-Ixrps0")
                .setActivity(Activity.competing("UHB"))
                .addEventListeners(new Listener())
                .build();
    }
}