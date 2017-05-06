package com.alienlab.activity;

import io.aiyuninfo.boot.core.annotation.AiyunApp;
import io.aiyuninfo.boot.core.application.AiyunApplication;

import java.net.UnknownHostException;

/**
 * Created by juhuiguang on 2017/5/6.
 */
@AiyunApp
public class ActivityApplication {
    public static void  main(String [] args) throws UnknownHostException {
        AiyunApplication.runApp(ActivityApplication.class,args);
    }

}
