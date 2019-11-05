package com.zczy.getu;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import com.igexin.sdk.GTIntentService;
import com.igexin.sdk.GTServiceManager;
import com.igexin.sdk.PushService;

/**
 * 功能描述:个推服务
 *
 * @author SunFeihu 孙飞虎
 * @company 中储南京智慧物流科技有限公司
 * @copyright （版权）中储南京智慧物流科技有限公司所有
 * @date 2018/12/3
 */
public class ZczyPushService extends Service {
    //intent:#Intent;action=android.intent.action.oppopush;component=com.tiema.zhwl_android/com.tiema.zhwl_android.MainActivity;S.msgType=0;S.contentId=1;end
    @Override
    public void onCreate() {
        super.onCreate();
        GTServiceManager.getInstance().onCreate(this);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        super.onStartCommand(intent, flags, startId);
        return GTServiceManager.getInstance().onStartCommand(this, intent, flags, startId);
    }

    @Override
    public IBinder onBind(Intent intent) {
        return GTServiceManager.getInstance().onBind(intent);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        GTServiceManager.getInstance().onDestroy();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        GTServiceManager.getInstance().onLowMemory();
    }
}
