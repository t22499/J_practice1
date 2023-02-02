package com.mhl_.service;

import com.mhl_.dao.BasicDAO;
import com.mhl_.dao.BillDAO;
import com.mhl_.dao.DiningTableDao;
import com.mhl_.domain.Bill;

import java.util.List;
import java.util.UUID;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class BillService {
    private BillDAO billDAO = new BillDAO();
    private MenuService menuService = new MenuService();

    private DiningTableService diningTableService = new DiningTableService();


    //生成账单
    //更新对应状态
    public boolean orderMenu(int menuId, int nums, int diningTableId) {
        //生成一个账单号
        String billID = UUID.randomUUID().toString();

        //将账单生成到billID表，要求直接计算到账单金额
        int update = billDAO.update("insert into bill values(null,?,?,?,?,?,now(),'未结账')"
                , billID, menuId, nums, menuService.getMenuById(menuId).getPrice() * nums, diningTableId);
        if (update <= 0) {
            return false;
        }
        //更新对应桌状态
        return diningTableService.updateDiningTableState(diningTableId,"就餐中");
   }


   //查看账单
    public Bill getBill(int id){

        return billDAO.querySingle("select * from bill where diningTableId = ? ",Bill.class,id);
    }



}
