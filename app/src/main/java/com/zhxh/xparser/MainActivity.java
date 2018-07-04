package com.zhxh.xparser;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.gson.reflect.TypeToken;
import com.zhxh.xparserlib.GsonParser;

public class MainActivity extends AppCompatActivity {

    public static final String input = "{\"result\":1,\"code\":0,\"message\":\"\",\"minTime\":\"2017-05-0321:59:24\",\"maxTime\":\"2018-06-2014:08:33\",\"minBoundaryId\":636294455640000000,\"maxBoundaryId\":636651005130000000,\"direction\":-1,\"order\":-1,\"size\":20,\"data\":[{\"dynamicType\":103,\"type\":1,\"userID\":4048181,\"userName\":\"数据水晶球\",\"userLogoUrl\":\"https://i0.niuguwang.com/SavePhoto/2018/0427/23447/L_78BFCACFB6F2023B842B51FB9F315FD5.jpg\",\"userIcons\":[],\"innerCode\":7335,\"stockCode\":\"002742\",\"stockName\":\"三圣股份\",\"market\":\"2\",\"contentDict\":[{\"typeText\":\"买入股票\"},{\"stockText\":\"三圣股份(002742)\"},{\"transactionUnitPriceText\":\"成交价格\"},{\"transactionUnitPrice\":\"9.53元\"}],\"addTime\":\"06-2014:08\",\"listID\":\"24855284\",\"vip\":\"0\",\"vipText\":\"\",\"description\":\"\",\"isHSGT\":\"0\",\"isForeign\":\"0\",\"commentNum\":\"0\",\"commentNumText\":\"0条评论\"},{\"dynamicType\":111,\"type\":1,\"userID\":4048181,\"userName\":\"数据水晶球\",\"userLogoUrl\":\"https://i0.niuguwang.com/SavePhoto/2018/0427/23447/L_78BFCACFB6F2023B842B51FB9F315FD5.jpg\",\"userIcons\":[],\"innerCode\":2622,\"stockCode\":\"601877\",\"stockName\":\"正泰电器\",\"market\":\"1\",\"contentDict\":[{\"timezone\":\"\"},{\"time\":\"05-2113:06\"},{\"typeText\":\"买入\"},{\"stockText\":\"正泰电器(601877)\"},{\"unitPriceText\":\"成交价\"},{\"unitPrice\":\"28.39\"},{\"positionText\":\"仓位占比\"},{\"position\":\"0.3%\"}],\"addTime\":\"05-2113:06\",\"listID\":\"823601\",\"isForeign\":\"1\",\"commentNum\":\"0\",\"commentNumText\":\"0条回复\"},{\"dynamicType\":110,\"type\":11,\"userID\":4048181,\"userName\":\"数据水晶球\",\"userLogoUrl\":\"https://i0.niuguwang.com/SavePhoto/2018/0427/23447/L_78BFCACFB6F2023B842B51FB9F315FD5.jpg\",\"userIcons\":[],\"innerCode\":12804,\"stockCode\":\"001250\",\"stockName\":\"天弘新活力混合\",\"market\":\"19\",\"contentDict\":[{\"time\":\"09-0111:29\"},{\"typeText\":\"买入基金\"},{\"stockText\":\"天弘新活力混合(001250)\"},{\"delegateTotalPriceText\":\"买入金额\"},{\"delegateTotalPrice\":\"1000元\"},{\"positionText\":\"仓位占比\"},{\"position\":\"0.09%\"},{\"state\":\"[已成]\"}],\"addTime\":\"09-0111:29\",\"commentNum\":\"0\",\"commentNumText\":\"0条回复\"},{\"dynamicType\":110,\"type\":12,\"userID\":4048181,\"userName\":\"数据水晶球\",\"userLogoUrl\":\"https://i0.niuguwang.com/SavePhoto/2018/0427/23447/L_78BFCACFB6F2023B842B51FB9F315FD5.jpg\",\"userIcons\":[],\"innerCode\":38872,\"stockCode\":\"001781\",\"stockName\":\"建信现代服务业股票\",\"market\":\"19\",\"contentDict\":[{\"time\":\"09-0111:28\"},{\"typeText\":\"卖出基金\"},{\"stockText\":\"建信现代服务业股票(001781)\"},{\"delegateAmountText\":\"卖出份额\"},{\"delegateAmount\":\"1746.22份\"},{\"shareText\":\"份额占比\"},{\"share\":\"100%\"},{\"state\":\"[已成]\"}],\"addTime\":\"09-0111:28\",\"commentNum\":\"0\",\"commentNumText\":\"0条回复\"},{\"dynamicType\":103,\"type\":2,\"userID\":4048181,\"userName\":\"数据水晶球\",\"userLogoUrl\":\"https://i0.niuguwang.com/SavePhoto/2018/0427/23447/L_78BFCACFB6F2023B842B51FB9F315FD5.jpg\",\"userIcons\":[],\"innerCode\":1230,\"stockCode\":\"002723\",\"stockName\":\"金莱特\",\"market\":\"2\",\"contentDict\":[{\"typeText\":\"卖出股票\"},{\"stockText\":\"金莱特(002723)\"},{\"transactionUnitPriceText\":\"成交价格\"},{\"transactionUnitPrice\":\"20.6元\"},{\"shareText\":\"份额占比\"},{\"share\":\"100%\"},{\"profitText\":\"获利\"},{\"profit\":\"19.58%\"}],\"addTime\":\"06-2614:33\",\"listID\":\"18184462\",\"vip\":\"0\",\"vipText\":\"\",\"description\":\"\",\"isHSGT\":\"0\",\"isForeign\":\"0\",\"commentNum\":\"0\",\"commentNumText\":\"0条评论\"},{\"dynamicType\":103,\"type\":2,\"userID\":4048181,\"userName\":\"数据水晶球\",\"userLogoUrl\":\"https://i0.niuguwang.com/SavePhoto/2018/0427/23447/L_78BFCACFB6F2023B842B51FB9F315FD5.jpg\",\"userIcons\":[],\"innerCode\":33,\"stockCode\":\"000033\",\"stockName\":\"新都退\",\"market\":\"2\",\"contentDict\":[{\"typeText\":\"卖出股票\"},{\"stockText\":\"新都退(000033)\"},{\"transactionUnitPriceText\":\"成交价格\"},{\"transactionUnitPrice\":\"1.34元\"},{\"shareText\":\"份额占比\"},{\"share\":\"100%\"},{\"profitText\":\"获利\"},{\"profit\":\"6.18%\"}],\"addTime\":\"06-2309:35\",\"listID\":\"23440877\",\"vip\":\"0\",\"vipText\":\"\",\"description\":\"\",\"isHSGT\":\"0\",\"isForeign\":\"0\",\"commentNum\":\"0\",\"commentNumText\":\"0条评论\"},{\"dynamicType\":103,\"type\":1,\"userID\":4048181,\"userName\":\"数据水晶球\",\"userLogoUrl\":\"https://i0.niuguwang.com/SavePhoto/2018/0427/23447/L_78BFCACFB6F2023B842B51FB9F315FD5.jpg\",\"userIcons\":[],\"innerCode\":7670,\"stockCode\":\"510560\",\"stockName\":\"国寿500\",\"market\":\"10\",\"contentDict\":[{\"typeText\":\"买入股票\"},{\"stockText\":\"国寿500(510560)\"},{\"transactionUnitPriceText\":\"成交价格\"},{\"transactionUnitPrice\":\"1.33元\"}],\"addTime\":\"06-2309:30\",\"listID\":\"23456922\",\"vip\":\"0\",\"vipText\":\"\",\"description\":\"\",\"isHSGT\":\"0\",\"isForeign\":\"0\",\"commentNum\":\"0\",\"commentNumText\":\"0条评论\"},{\"dynamicType\":103,\"type\":2,\"userID\":4048181,\"userName\":\"数据水晶球\",\"userLogoUrl\":\"https://i0.niuguwang.com/SavePhoto/2018/0427/23447/L_78BFCACFB6F2023B842B51FB9F315FD5.jpg\",\"userIcons\":[],\"innerCode\":968,\"stockCode\":\"002460\",\"stockName\":\"赣锋锂业\",\"market\":\"2\",\"contentDict\":[{\"typeText\":\"卖出股票\"},{\"stockText\":\"赣锋锂业(002460)\"},{\"transactionUnitPriceText\":\"成交价格\"},{\"transactionUnitPrice\":\"43.97元\"},{\"shareText\":\"份额占比\"},{\"share\":\"100%\"},{\"profitText\":\"获利\"},{\"profit\":\"0.69%\"}],\"addTime\":\"06-2211:21\",\"listID\":\"17682920\",\"vip\":\"0\",\"vipText\":\"\",\"description\":\"\",\"isHSGT\":\"2\",\"isForeign\":\"0\",\"commentNum\":\"0\",\"commentNumText\":\"0条评论\"},{\"dynamicType\":103,\"type\":2,\"userID\":4048181,\"userName\":\"数据水晶球\",\"userLogoUrl\":\"https://i0.niuguwang.com/SavePhoto/2018/0427/23447/L_78BFCACFB6F2023B842B51FB9F315FD5.jpg\",\"userIcons\":[],\"innerCode\":3280,\"stockCode\":\"600664\",\"stockName\":\"哈药股份\",\"market\":\"1\",\"contentDict\":[{\"typeText\":\"卖出股票\"},{\"stockText\":\"哈药股份(600664)\"},{\"transactionUnitPriceText\":\"成交价格\"},{\"transactionUnitPrice\":\"5.79元\"},{\"shareText\":\"份额占比\"},{\"share\":\"100%\"},{\"profitText\":\"获利\"},{\"profit\":\"0.02%\"}],\"addTime\":\"06-2211:14\",\"listID\":\"18181802\",\"vip\":\"0\",\"vipText\":\"\",\"description\":\"\",\"isHSGT\":\"1\",\"isForeign\":\"0\",\"commentNum\":\"0\",\"commentNumText\":\"0条评论\"},{\"dynamicType\":103,\"type\":1,\"userID\":4048181,\"userName\":\"数据水晶球\",\"userLogoUrl\":\"https://i0.niuguwang.com/SavePhoto/2018/0427/23447/L_78BFCACFB6F2023B842B51FB9F315FD5.jpg\",\"userIcons\":[],\"innerCode\":33,\"stockCode\":\"000033\",\"stockName\":\"新都退\",\"market\":\"2\",\"contentDict\":[{\"typeText\":\"买入股票\"},{\"stockText\":\"新都退(000033)\"},{\"transactionUnitPriceText\":\"成交价格\"},{\"transactionUnitPrice\":\"1.26元\"}],\"addTime\":\"06-2109:33\",\"listID\":\"23440877\",\"vip\":\"0\",\"vipText\":\"\",\"description\":\"\",\"isHSGT\":\"0\",\"isForeign\":\"0\",\"commentNum\":\"0\",\"commentNumText\":\"0条评论\"},{\"dynamicType\":111,\"type\":1,\"userID\":4048181,\"userName\":\"数据水晶球\",\"userLogoUrl\":\"https://i0.niuguwang.com/SavePhoto/2018/0427/23447/L_78BFCACFB6F2023B842B51FB9F315FD5.jpg\",\"userIcons\":[],\"innerCode\":28492,\"stockCode\":\"DRYS\",\"stockName\":\"干船\",\"market\":\"7\",\"contentDict\":[{\"timezone\":\"美东\"},{\"time\":\"06-2010:02\"},{\"typeText\":\"买入\"},{\"stockText\":\"干船(DRYS)\"},{\"unitPriceText\":\"成交价\"},{\"unitPrice\":\"1\"},{\"positionText\":\"仓位占比\"},{\"position\":\"0.98%\"}],\"addTime\":\"06-2023:02\",\"listID\":\"497417\",\"isForeign\":\"1\",\"commentNum\":\"0\",\"commentNumText\":\"0条回复\"},{\"dynamicType\":111,\"type\":1,\"userID\":4048181,\"userName\":\"数据水晶球\",\"userLogoUrl\":\"https://i0.niuguwang.com/SavePhoto/2018/0427/23447/L_78BFCACFB6F2023B842B51FB9F315FD5.jpg\",\"userIcons\":[],\"innerCode\":27251,\"stockCode\":\"MSCI\",\"stockName\":\"MSCIInc\",\"market\":\"7\",\"contentDict\":[{\"timezone\":\"美东\"},{\"time\":\"06-2009:39\"},{\"typeText\":\"买入\"},{\"stockText\":\"MSCIInc(MSCI)\"},{\"unitPriceText\":\"成交价\"},{\"unitPrice\":\"106.04\"},{\"positionText\":\"仓位占比\"},{\"position\":\"1.04%\"}],\"addTime\":\"06-2022:39\",\"listID\":\"499178\",\"isForeign\":\"1\",\"commentNum\":\"0\",\"commentNumText\":\"0条回复\"},{\"dynamicType\":111,\"type\":1,\"userID\":4048181,\"userName\":\"数据水晶球\",\"userLogoUrl\":\"https://i0.niuguwang.com/SavePhoto/2018/0427/23447/L_78BFCACFB6F2023B842B51FB9F315FD5.jpg\",\"userIcons\":[],\"innerCode\":28492,\"stockCode\":\"DRYS\",\"stockName\":\"干船\",\"market\":\"7\",\"contentDict\":[{\"timezone\":\"美东\"},{\"time\":\"06-1909:56\"},{\"typeText\":\"买入\"},{\"stockText\":\"干船(DRYS)\"},{\"unitPriceText\":\"成交价\"},{\"unitPrice\":\"1.2491\"},{\"positionText\":\"仓位占比\"},{\"position\":\"0%\"}],\"addTime\":\"06-1922:56\",\"listID\":\"497417\",\"isForeign\":\"1\",\"commentNum\":\"0\",\"commentNumText\":\"0条回复\"},{\"dynamicType\":111,\"type\":1,\"userID\":4048181,\"userName\":\"数据水晶球\",\"userLogoUrl\":\"https://i0.niuguwang.com/SavePhoto/2018/0427/23447/L_78BFCACFB6F2023B842B51FB9F315FD5.jpg\",\"userIcons\":[],\"innerCode\":28492,\"stockCode\":\"DRYS\",\"stockName\":\"干船\",\"market\":\"7\",\"contentDict\":[{\"timezone\":\"美东\"},{\"time\":\"06-1909:43\"},{\"typeText\":\"买入\"},{\"stockText\":\"干船(DRYS)\"},{\"unitPriceText\":\"成交价\"},{\"unitPrice\":\"1.3\"},{\"positionText\":\"仓位占比\"},{\"position\":\"0.12%\"}],\"addTime\":\"06-1922:43\",\"listID\":\"497417\",\"isForeign\":\"1\",\"commentNum\":\"0\",\"commentNumText\":\"0条回复\"},{\"dynamicType\":111,\"type\":1,\"userID\":4048181,\"userName\":\"数据水晶球\",\"userLogoUrl\":\"https://i0.niuguwang.com/SavePhoto/2018/0427/23447/L_78BFCACFB6F2023B842B51FB9F315FD5.jpg\",\"userIcons\":[],\"innerCode\":28492,\"stockCode\":\"DRYS\",\"stockName\":\"干船\",\"market\":\"7\",\"contentDict\":[{\"timezone\":\"美东\"},{\"time\":\"06-1909:42\"},{\"typeText\":\"买入\"},{\"stockText\":\"干船(DRYS)\"},{\"unitPriceText\":\"成交价\"},{\"unitPrice\":\"1.3\"},{\"positionText\":\"仓位占比\"},{\"position\":\"0.12%\"}],\"addTime\":\"06-1922:42\",\"listID\":\"497417\",\"isForeign\":\"1\",\"commentNum\":\"0\",\"commentNumText\":\"0条回复\"},{\"dynamicType\":111,\"type\":1,\"userID\":4048181,\"userName\":\"数据水晶球\",\"userLogoUrl\":\"https://i0.niuguwang.com/SavePhoto/2018/0427/23447/L_78BFCACFB6F2023B842B51FB9F315FD5.jpg\",\"userIcons\":[],\"innerCode\":11176,\"stockCode\":\"01958\",\"stockName\":\"北京汽车\",\"market\":\"5\",\"contentDict\":[{\"timezone\":\"\"},{\"time\":\"06-1515:14\"},{\"typeText\":\"买入\"},{\"stockText\":\"北京汽车(01958)\"},{\"unitPriceText\":\"成交价\"},{\"unitPrice\":\"8.12\"},{\"positionText\":\"仓位占比\"},{\"position\":\"3.95%\"}],\"addTime\":\"06-1515:14\",\"listID\":\"490827\",\"isForeign\":\"1\",\"commentNum\":\"0\",\"commentNumText\":\"0条回复\"},{\"dynamicType\":111,\"type\":1,\"userID\":4048181,\"userName\":\"数据水晶球\",\"userLogoUrl\":\"https://i0.niuguwang.com/SavePhoto/2018/0427/23447/L_78BFCACFB6F2023B842B51FB9F315FD5.jpg\",\"userIcons\":[],\"innerCode\":11176,\"stockCode\":\"01958\",\"stockName\":\"北京汽车\",\"market\":\"5\",\"contentDict\":[{\"timezone\":\"\"},{\"time\":\"06-1409:21\"},{\"typeText\":\"买入\"},{\"stockText\":\"北京汽车(01958)\"},{\"unitPriceText\":\"成交价\"},{\"unitPrice\":\"8.35\"},{\"positionText\":\"仓位占比\"},{\"position\":\"1.21%\"}],\"addTime\":\"06-1409:21\",\"listID\":\"490827\",\"isForeign\":\"1\",\"commentNum\":\"0\",\"commentNumText\":\"0条回复\"},{\"dynamicType\":111,\"type\":2,\"userID\":4048181,\"userName\":\"数据水晶球\",\"userLogoUrl\":\"https://i0.niuguwang.com/SavePhoto/2018/0427/23447/L_78BFCACFB6F2023B842B51FB9F315FD5.jpg\",\"userIcons\":[],\"innerCode\":30441,\"stockCode\":\"UTMD\",\"stockName\":\"犹他医疗产品\",\"market\":\"7\",\"contentDict\":[{\"timezone\":\"美东\"},{\"time\":\"05-1811:25\"},{\"typeText\":\"卖出\"},{\"stockText\":\"犹他医疗产品(UTMD)\"},{\"unitPriceText\":\"成交价\"},{\"unitPrice\":\"64.8\"},{\"shareText\":\"份额占比\"},{\"share\":\"100%\"},{\"profitText\":\"获利\"},{\"profit\":\"1.87%\"}],\"addTime\":\"05-1900:25\",\"listID\":\"334\",\"isForeign\":\"1\",\"commentNum\":\"0\",\"commentNumText\":\"0条回复\"},{\"dynamicType\":111,\"type\":2,\"userID\":4048181,\"userName\":\"数据水晶球\",\"userLogoUrl\":\"https://i0.niuguwang.com/SavePhoto/2018/0427/23447/L_78BFCACFB6F2023B842B51FB9F315FD5.jpg\",\"userIcons\":[],\"innerCode\":28492,\"stockCode\":\"DRYS\",\"stockName\":\"干船\",\"market\":\"7\",\"contentDict\":[{\"timezone\":\"美东\"},{\"time\":\"05-0409:31\"},{\"typeText\":\"卖出\"},{\"stockText\":\"干船(DRYS)\"},{\"unitPriceText\":\"成交价\"},{\"unitPrice\":\"0.7437\"},{\"shareText\":\"份额占比\"},{\"share\":\"100%\"},{\"profitText\":\"获利\"},{\"profit\":\"10.55%\"}],\"addTime\":\"05-0422:31\",\"listID\":\"431017\",\"isForeign\":\"1\",\"commentNum\":\"0\",\"commentNumText\":\"0条回复\"},{\"dynamicType\":111,\"type\":1,\"userID\":4048181,\"userName\":\"数据水晶球\",\"userLogoUrl\":\"https://i0.niuguwang.com/SavePhoto/2018/0427/23447/L_78BFCACFB6F2023B842B51FB9F315FD5.jpg\",\"userIcons\":[],\"innerCode\":28492,\"stockCode\":\"DRYS\",\"stockName\":\"干船\",\"market\":\"7\",\"contentDict\":[{\"timezone\":\"美东\"},{\"time\":\"05-0309:59\"},{\"typeText\":\"买入\"},{\"stockText\":\"干船(DRYS)\"},{\"unitPriceText\":\"成交价\"},{\"unitPrice\":\"0.6699\"},{\"positionText\":\"仓位占比\"},{\"position\":\"0.13%\"}],\"addTime\":\"05-0322:59\",\"listID\":\"431017\",\"isForeign\":\"1\",\"commentNum\":\"0\",\"commentNumText\":\"0条回复\"}],\"settings\":{\"imageSize\":{\"thumbnail\":\"/160s\",\"crop\":\"/320t\",\"small\":\"/480\",\"middle\":\"/720\",\"large\":\"/1080\",\"original\":\"\"}},\"title\":\"牛人动态\"}";

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";

        public PlaceholderFragment() {
        }

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            TextView textView = rootView.findViewById(R.id.section_label);
            TextView gson_label = rootView.findViewById(R.id.gson_label);
            TextView gson_value = rootView.findViewById(R.id.gson_value);
            textView.setText(getString(R.string.section_format, getArguments().getInt(ARG_SECTION_NUMBER)));

            UserTrendResponse response = GsonParser.parse(input, UserTrendResponse.class, new TypeToken<String>() {
            }.getType(), new GsonParser.StringAdapter());

            gson_label.setText(response.getData().get(0).getContentDict());
            gson_value.setText(GsonParser.parseGsonValue("stockText", response.getData().get(0).getContentDict()));
            return rootView;
        }
    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            return PlaceholderFragment.newInstance(position + 1);
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 3;
        }
    }
}
