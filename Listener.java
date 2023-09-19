package DISCORDBOT;

import net.dv8tion.jda.api.events.guild.override.PermissionOverrideCreateEvent;
import net.dv8tion.jda.api.events.message.MessageDeleteEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Listener extends ListenerAdapter {

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        super.onMessageReceived(event);

        System.out.println("رسالة جديدة");

        if (!event.getAuthor().isBot()) {

            String messageSent = event.getAuthor().getName();
            event.getChannel().sendMessage("هذه الرسالة ارسلت"+messageSent ).queue();
        }

    }

    @Override
    public void onMessageDelete(MessageDeleteEvent event) {
        super.onMessageDelete(event);

        System.out.println("رسالة انحذفت");

        String messageSent = event.getAuthor().getName();
        event.getChannel().sendMessage("هذه الرسالة ارسلت"+messageSent ).queue();
    }
}


