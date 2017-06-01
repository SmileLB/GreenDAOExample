package daoUtils;

import com.example.admin.myapplication.MyApplication;
import com.example.admin.myapplication.greenDAO.ShopDao;

import java.util.List;

import javabean.Shop;

/**
 * Description:封装增删改查的工具类
 * Created by LiBing
 * Data:2017/6/1 15:52
 */
public class CartDao {
    /**
     * 添加数据，如果有重复则覆盖
     * @param shop
     */
    public static void insertCart(Shop shop) {
        MyApplication.getDaoInstant().getShopDao().insertOrReplace(shop);
    }

    /**
     * 删除数据
     * @param id
     */
    public static void deleteCart(long id) {
        MyApplication.getDaoInstant().getShopDao().deleteByKey(id);
    }

    /**
     * 更新数据
     * @param shop
     */
    public static void updateCart(Shop shop) {
        MyApplication.getDaoInstant().getShopDao().update(shop);
    }

    /**
     * 查询条件为Type=TYPE_LOVE的数据
     * @return
     */
    public static List<Shop> queryCart() {
        return MyApplication.getDaoInstant().getShopDao().queryBuilder().where(ShopDao.Properties.Type.eq(Shop.TYPE_LOVE)).list();
    }

    /**
     * 查询全部数据
     */
    public static List<Shop> queryAll() {
        return MyApplication.getDaoInstant().getShopDao().loadAll();
    }
}
