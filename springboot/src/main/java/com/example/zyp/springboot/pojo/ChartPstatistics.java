package com.example.zyp.springboot.pojo;

import lombok.Data;

/**
 * @ Author     ：ZYP
 * @ Date       ：Created in 17:55 2018/8/3
 * @ Description：${description}
 * @ Modified By：
 * @Version: $version$
 */
@Data
public class ChartPstatistics {
    private String sku;   //商品sku
    private String product_name;//商品名称
    private float sale_price;//商品售价
    private String person;   //投放人
    private String team;     //所属组
    private float fb_cost;  //facebook支出
    private float fb_income;//facebook收入
    private float real_income;  //真实收入
    private float predict_income;//预估收入
    private float real_roi;   //真实roi
    private float profit;     //今日盈亏
    private float yestadayProfit;//昨日盈亏
    private int order_num;    // 真实 订单/order 数
    private float unit_price;   //客单价
    private float single_result;   //单次成效，cpo
    private float refuse_money;  //拒签金额
    private float refusalrate;  // 拒签率
    private float procurement;  //采购成本
    private float logistics;    //物流成本
    private float cart_rate;   //加购物车
    private float order_rate;   //网站购物
    private float cpc;          //cpc
    private float increase;     //同比
    private int addcart_num;   //加车数
    private int shownum;//展示次数
    private int site_conversion;   //网站转化
    private float promotion_cost;//推广成本
    private float real_promotion_cost;//真实推广成本
    private float profit_roi;//盈亏roi
    private String country;//国家
    private int dainum;//待审核订单数
    private int errorordernum;//异常订单数
    private int totalnum;//总订单数
    private float errororderrate;//异常订单率
    //国家统计新属性
    private float realCost;//真实支出
    private float incomePercentage;  //收入占比
    private float grossProfit;      //毛利
    private String launch_time; // 投放时间

    //总表新增属性
    private float ctr;

}
