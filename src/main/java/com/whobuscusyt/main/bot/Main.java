package com.whobuscusyt.bot;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;

public class Main {
    public static void main(String[] args) throws Exception {

        String token = System.getenv("DISCORD_TOKEN");

        if (token == null) {
            System.out.println("No token found!");
            return;
        }

        JDA jda = JDABuilder.createDefault(token)
                .setStatus(OnlineStatus.ONLINE)
                .setActivity(Activity.playing("Blocking pings 👀"))
                .build();

        jda.awaitReady();
        System.out.println("Bot is online!");
    }
}