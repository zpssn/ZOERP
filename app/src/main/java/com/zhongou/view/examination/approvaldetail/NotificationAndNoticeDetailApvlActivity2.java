package com.zhongou.view.examination.approvaldetail;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.zhongou.R;
import com.zhongou.base.BaseActivity;
import com.zhongou.inject.ViewInject;
import com.zhongou.model.applicationdetailmodel.NotificationAndNoticeModel;
import com.zhongou.model.approvaldetailmodel.NotificationAndNoticeApvlModel;

/**
 * 审批 通知公告详情
 * Created by sjy on 2017/1/16.
 */

public class NotificationAndNoticeDetailApvlActivity2 extends BaseActivity {
    //back
    @ViewInject(id = R.id.layout_back, click = "forBack")
    RelativeLayout layout_back;

    //
    @ViewInject(id = R.id.tv_title)
    TextView tv_title;

    //
    @ViewInject(id = R.id.tv_right)
    TextView tv_right;
    //
    @ViewInject(id = R.id.tv_content)
    TextView tv_content;

    //变量
    private NotificationAndNoticeApvlModel notificationAndNoticeModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_apps_examination_notificationandnotice_content);
        tv_title.setText(getResources().getString(R.string.notificaitonAndNotice_content));
        tv_right.setText("");

        Bundle bundle = this.getIntent().getExtras();
        notificationAndNoticeModel = (NotificationAndNoticeApvlModel) bundle.getSerializable("notificationAndNoticeModel");
        setShow(notificationAndNoticeModel);

    }

    private void setShow(NotificationAndNoticeApvlModel model) {
        tv_content.setText(model.getApplicationTitle());
    }

    /**
     * back
     *
     * @param view
     */
    public void forBack(View view) {
        this.finish();
    }
}