package com.pavel.publisher;

import com.pavel.listeners.IEventListener;
import com.pavel.objects.FollowType;

public class VkPage {

    private String displayName;
    private EventManager eventManager;

    public VkPage(String displayName) {
        this.displayName = displayName;
        this.eventManager = new EventManager(FollowType.Video, FollowType.LiveStream, FollowType.Article);
    }

    public void follow(String eventType, IEventListener listener) {
        this.eventManager.subscribe(eventType, listener);
    }

    public void unfollow(String eventType, IEventListener listener) {

        this.eventManager.unsubscribe(eventType, listener);
    }

    public void publishVideo(String url) {
        this.eventManager.notify(FollowType.Video, this.displayName, url);
    }

    public void startLiveStream(String url) {
        this.eventManager.notify(FollowType.LiveStream, this.displayName, url);
    }

    public void publishArticle(String url) {
        this.eventManager.notify(FollowType.Article, this.displayName, url);
    }
}
