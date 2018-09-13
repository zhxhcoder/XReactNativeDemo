package com.zhxh.xreactnative;

import com.zhxh.xreactnative.preloadreact.PreLoadReactActivity;

import javax.annotation.Nullable;

/**
 * Created by Song on 2017/2/13.
 */
public class MyReactActivity extends PreLoadReactActivity {

    @Nullable
    @Override
    protected String getMainComponentName() {
        return "HotRN";
    }

}
