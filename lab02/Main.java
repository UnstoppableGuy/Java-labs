package com.pavel;

import com.pavel.listeners.AppNotificationListener;
import com.pavel.listeners.EmailNotificationListener;
import com.pavel.objects.VkUser;
import com.pavel.objects.FollowType;
import com.pavel.publisher.VkPage;

public class Main {

    public static void main(String[] args) {

        // Initialization
        VkPage vkpage = new VkPage("WOTweeaks");

        VkUser dima = new VkUser("Dima", "DimaPristrom@gmail.com");
        VkUser vlad = new VkUser("Vlad", "VladNubas@gmail.com");

        // Observer Pattern

        // Dima
        AppNotificationListener dimaAppNotification = new AppNotificationListener(dima);

        vkpage.follow(FollowType.Video, dimaAppNotification);
        vkpage.follow(FollowType.LiveStream, dimaAppNotification);
        //vkpage.follow(FollowType.Article, dimaAppNotification);

        // Vlad
        EmailNotificationListener vladEmailNotification = new EmailNotificationListener(vlad);
        //AppNotificationListener vladAppNotification = new AppNotificationListener(vlad);

        vkpage.follow(FollowType.Video, vladEmailNotification);
        vkpage.follow(FollowType.LiveStream, vladEmailNotification);
        vkpage.follow(FollowType.Article, vladEmailNotification);
        //System.out.print(vladEmailNotification.getUser().getFirstName()+"\n");
        //vkpage.follow(FollowType.LiveStream, vladAppNotification);

        // Notify
        vkpage.startLiveStream("https://vk.com/wotclue/livestream242");
        vkpage.publishVideo("https://vk.com/wotclue/video/140");

        vkpage.unfollow(FollowType.LiveStream, vladEmailNotification);

        vkpage.startLiveStream("https://vk.com/wotclue/secondstream");
        vkpage.publishArticle("https://vk.com/wotclue?w=wall-70226354_4026908");
    }
}
