package com.gyb.zp.mylibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Administrator on 2019/4/19.
 */

public class ShowTest {
    public static void showToast(Context context) {
        Toast.makeText(context,"测试数据",Toast.LENGTH_SHORT).show();
    }
}
