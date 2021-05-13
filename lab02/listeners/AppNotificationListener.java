package com.pavel.listeners;

import com.pavel.objects.VkUser;

public class AppNotificationListener implements IEventListener {

    private VkUser user;

    public AppNotificationListener(VkUser user) {
        this.user = user;
    }

    public VkUser getUser() {
        return user;
    }

    @Override
    public void update(String eventType, String displayName, String url) {
        System.out.println("App Notification: Hey " + this.user.getFirstName() + ", " + displayName
                + " posted new content: " + eventType + " : " + url);
    }

}
