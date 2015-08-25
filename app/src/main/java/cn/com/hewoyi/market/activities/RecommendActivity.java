package cn.com.hewoyi.market.activities;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

import cn.com.hewoyi.market.R;
import cn.com.hewoyi.market.fragment.RankFragment;
import cn.com.hewoyi.market.fragment.RecommendFragment;
import cn.com.hewoyi.market.fragment.SearchFragment;
import cn.com.hewoyi.market.fragment.SoftwareFragment;

public class RecommendActivity extends Activity implements View.OnClickListener {

    private RecommendFragment mRecommendFragment;
    private RankFragment mRankFragment;
    private SoftwareFragment mSoftwareFragment;
    private SearchFragment mSearchFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_recommend);

        // 初始化控件和声明事件
        findViewById(R.id.id_bottom_recommend).setOnClickListener(this);
        findViewById(R.id.id_bottom_rank).setOnClickListener(this);
        findViewById(R.id.id_bottom_software).setOnClickListener(this);
        findViewById(R.id.id_bottom_search).setOnClickListener(this);

        // 设置默认的Fragment
        setDefaultFragment();

    }


    private void setDefaultFragment() {
        FragmentManager fm = getFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        mRecommendFragment = new RecommendFragment();
        transaction.replace(R.id.id_fragment, mRecommendFragment);
        transaction.commit();
    }


    @Override
    public void onClick(View v) {
        // 开启Fragment事务
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        // TODO Auto-generated method stub
        switch (v.getId()) {
            case R.id.id_bottom_recommend:
                if (mRecommendFragment == null) {
                    mRecommendFragment = new RecommendFragment();
                }
                // 使用当前Fragment的布局替代id_fragment的控件ؼ�
                fragmentTransaction.replace(R.id.id_fragment, mRecommendFragment);
                break;
            case R.id.id_bottom_rank:
                if (mRankFragment == null) {
                    mRankFragment = new RankFragment();
                }
                // 使用当前Fragment的布局替代id_fragment的控件ؼ�
                fragmentTransaction.replace(R.id.id_fragment, mRankFragment);
                break;
            case R.id.id_bottom_software:
                if (mSoftwareFragment == null) {
                    mSoftwareFragment = new SoftwareFragment();
                }
                // 使用当前Fragment的布局替代id_fragment的控件ؼ�
                fragmentTransaction.replace(R.id.id_fragment, mSoftwareFragment);
                break;
            case R.id.id_bottom_search:
                if (mSearchFragment == null) {
                    mSearchFragment = new SearchFragment();
                }
                // 使用当前Fragment的布局替代id_fragment的控件ؼ�
                fragmentTransaction.replace(R.id.id_fragment, mSearchFragment);
                break;
        }
        // �����ύ
        fragmentTransaction.commit();
    }
}
