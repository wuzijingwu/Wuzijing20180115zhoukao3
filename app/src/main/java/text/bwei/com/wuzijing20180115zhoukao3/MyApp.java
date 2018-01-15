package text.bwei.com.wuzijing20180115zhoukao3;

import android.app.Application;

import text.bwei.com.wuzijing20180115zhoukao3.gen.DaoMaster;
import text.bwei.com.wuzijing20180115zhoukao3.gen.DaoSession;
import text.bwei.com.wuzijing20180115zhoukao3.gen.UserDao;


/**
 * Created by Zhang on 2017/11/22.
 */

public class MyApp extends Application {
    public static UserDao userDao;

    @Override
    public void onCreate() {
        super.onCreate();
        DaoMaster.DevOpenHelper devOpenHelper = new DaoMaster.DevOpenHelper(this, "lenvess.db", null);
        DaoMaster daoMaster = new DaoMaster(devOpenHelper.getWritableDb());
        DaoSession daoSession = daoMaster.newSession();
        userDao = daoSession.getUserDao();
    }
}