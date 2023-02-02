package com.mhl_.service;

import com.mhl_.dao.DiningTableDao;
import com.mhl_.domain.DiningTable;

import java.util.List;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class DiningTableService {//业务层
    //定义diningTableDao
    private DiningTableDao diningTableDao = new DiningTableDao();

    //返回所有餐桌信息
    public List<DiningTable>list(){
      return  diningTableDao.queryMulti("select id ,state from diningTable",DiningTable.class);
    }
    //根据id查找对应餐桌
    //返回值为null则表示id对应的桌不存在
    public DiningTable getDiningTableById(int id){
        return diningTableDao.querySingle("select * from diningtable where id =?",DiningTable.class,id);
    }
    //预定餐桌
    public boolean orderDiningTable(int id,String orderName,String orderTel){
        int update =
                diningTableDao.update
                        ("update diningTable set state = '已经预定',orderName=?,orderTel=? where id = ?"
                                , orderName, orderTel,id);
        return update > 0;

    }

    //更新餐桌
    public boolean updateDiningTableState(int id,String state){
        int update = diningTableDao.update("update diningTable set state = ? where id=?", state, id);
        return update > 0;

    }




}
