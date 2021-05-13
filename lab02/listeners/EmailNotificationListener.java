package com.pavel.listeners;

import com.pavel.objects.VkUser;

public class EmailNotificationListener implements IEventListener {

    private VkUser user;

    public EmailNotificationListener(VkUser user) {
        this.user = user;
    }

    public VkUser getUser() {
        return user;
    }

    @Override
    public void update(String eventType, String displayName, String url) {
        System.out.println("Email Notification: Hey " + this.user.getFirstName() + ", " + displayName
                + " posted new content: " + eventType + " : " + url);
    }
}
