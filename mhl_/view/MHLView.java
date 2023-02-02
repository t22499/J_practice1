package com.mhl_.view;

import com.mhl_.dao.DiningTableDao;
import com.mhl_.domain.Bill;
import com.mhl_.domain.DiningTable;
import com.mhl_.domain.Employee;
import com.mhl_.domain.Menu;
import com.mhl_.service.BillService;
import com.mhl_.service.DiningTableService;
import com.mhl_.service.EmployeeService;
import com.mhl_.service.MenuService;
import com.mhl_.utils.Utility;

import java.util.List;


/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class MHLView {
    //定义属性
    //定义EmployeeService
    private EmployeeService employeeService = new EmployeeService();
    //定义DiningTableService
    private DiningTableService diningTableService = new DiningTableService();

    //定义BillService
    private BillService billService = new BillService();

    //定义MenuService
    private MenuService menuService = new MenuService();


    //接收用户的选择
    private String key = "";
    //控制是否退出菜单
    private boolean loop = true;

    //主方法
    public static void main(String[] args) {
        new MHLView().mainMenu();
    }

    //完成订座
    public void orderDiningTable(){
        System.out.println("=========预定餐桌=======");
        System.out.println("请选择预定的餐桌编号(-1退出)");
        int orderId = Utility.readInt();
        if (orderId == -1){
            System.out.println("=========取消预定餐桌========");
            return;
        }
        //该方法得到的是Y或者N
        char key = Utility.readConfirmSelection();
         if (key == 'Y'){
             //根据orderId返回对应DiningTable对像，如果为null，说明对象不存在
             DiningTable diningTable = diningTableService.getDiningTableById(orderId);
             if (diningTable == null){
                 System.out.println("=============预定餐桌不存在============");
                 return;
             }
             //判断该餐桌是否为’空‘
             if (!("空".equals(diningTable.getState()))){
                 System.out.println("============该餐桌已经预定===========");
                 return;
             }

             //接收预定信息
             System.out.println("预定人的名字");
             String orderName = Utility.readString(50);
             System.out.println("预定人的电话");
             String orderTel = Utility.readString(50);

             //更新餐桌状态
             if (diningTableService.orderDiningTable(orderId,orderName,orderTel)){
                 System.out.println("============预定餐桌成功===========");

             }else {
                 System.out.println("============预定餐桌失败===========");
             }

         }else {
             System.out.println("==========取消预定=========");
         }

    }




    //显示所有餐桌状态
    public void listDiningTable(){
        List<DiningTable> list = diningTableService.list();
        for (DiningTable diningTable : list) {
            System.out.println(diningTable);
        }
        System.out.println("======显示完毕======");
    }


    //显示所有菜品
    public void getMenu(){
        List<Menu> list = menuService.list();
        for (Menu menu : list) {
            System.out.println(menu);
        }

    }

    //完成点餐
    public void orderMenu(){
        System.out.println("=============点餐服务===========");
        System.out.println("请输入点餐的桌号(-1退出)");
        int orderDiningTableId = Utility.readInt();
        if (orderDiningTableId == -1){
            System.out.println("==========================");
            return;
        }


        System.out.println("请输入点餐的菜品单号(-1退出)");
        int orderMenuId = Utility.readInt();
        if (orderMenuId == -1){
            System.out.println("==========取消点餐=========");
            return;
        }
        System.out.println("请输入点餐的菜品数量(-1退出)");
        int orderNums = Utility.readInt();
        if (orderNums == -1){
            System.out.println("==========取消点餐=========");
            return;
        }

        //验证餐桌号是否存在
        DiningTable diningTableById =
                diningTableService.getDiningTableById(orderDiningTableId);
        if (diningTableById == null){
            System.out.println("=============餐桌不存在===========");
            return;
        }
        //验证菜品编号是否存在
        Menu menu = menuService.getMenuById(orderMenuId);
        if (menu == null){
            System.out.println("========菜品号不存在========");
            return;
        }

        //点餐
        if (billService.orderMenu(orderMenuId,orderNums,orderDiningTableId)){
            System.out.println("=======点餐成功======");
        }else {
            System.out.println("=======点餐失败======");
        }


    }

    //查看账单
    public void getBill(){
        System.out.println("请输入桌号");
        int getBillId = Utility.readInt();
        Bill bill = billService.getBill(getBillId);
        System.out.println("编号\t\t菜品号\t\t菜品量\t\t金额\t\t桌号\t\t日期\t\t\t\t\t\t\t状态");
        System.out.println(bill);
        return;
    }





    //显示主菜单
    public void mainMenu(){
        while (loop){
            System.out.println("==========满汉楼========");
            System.out.println("\t 1 登录满汉楼");
            System.out.println("\t 2 退出满汉楼");
            System.out.println("请输入你的选择");
            key = Utility.readString(1);
            switch (key){
                case "1":
                    System.out.println("请输入账号");
                    String empId = Utility.readString(50);
                    System.out.println("请输入密码");
                    String pwd = Utility.readString(50);
                    Employee employee = employeeService.getEmployeeDaoByIdAndPwd(empId, pwd);
                    //数据库内容一会写
                    if (employee != null){
                        System.out.println("登录成功" + "[" +employee.getName() + "]");
                        //二级菜单
                        while (loop){
                            System.out.println("\t 1 显示餐桌状态");
                            System.out.println("\t 2 预定餐桌");
                            System.out.println("\t 3 显示所有菜品");
                            System.out.println("\t 4 点餐服务");
                            System.out.println("\t 5 查看账单");
                            System.out.println("\t 6 结账");
                            System.out.println("\t 9 退出满汉楼状态");
                            System.out.println("\t 9 请输入你的选择");
                            key = Utility.readString(1);
                            switch (key){
                                case "1":
                                    listDiningTable();
                                    break;
                                case "2":
                                    orderDiningTable();
                                    break;
                                case "3":
                                    getMenu();
                                    break;
                                case "4":
                                    orderMenu();
                                    break;
                                case "5":
                                    getBill();
                                    break;
                                case "6":
                                    System.out.println("结账");
                                    break;
                                case "9":
                                    loop = false;
                                    System.out.println("退出满汉楼状态");
                                    break;
                                default:
                                    System.out.println("输入有错误，请重新输入");
                                    break;
                            }
                        }

                    }else{
                        System.out.println("登录失败");
                    }
                    break;
                case "2":

                    loop = false;
                    break;
                default:
                    System.out.println("你输入有误请重新输入");
                    break;
            }
        }
        System.out.println("退出满汉楼");
    }
}
