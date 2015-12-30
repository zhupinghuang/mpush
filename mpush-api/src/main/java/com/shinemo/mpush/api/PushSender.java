package com.shinemo.mpush.api;

import java.util.Collection;

/**
 * Created by ohun on 2015/12/30.
 */
public interface PushSender {
    void send(String content, Collection<String> userIds, Callback callback);

    interface Callback {
        void onSuccess(String userId);

        void onFailure(String userId);

        void onLose(String userId);
    }
}
