package com.halosky.algorithm.dp;


import java.util.Map;

/**
 * 数组的每个下标作为一个阶梯，第 i 个阶梯对应着一个非负数的体力花费值 cost[i]（下标从 0 开始）。
 * <p>
 * 每当你爬上一个阶梯你都要花费对应的体力值，一旦支付了相应的体力值，你就可以选择向上爬一个阶梯或者爬两个阶梯。
 * <p>
 * 请你找出达到楼层顶部的最低花费。在开始时，你可以选择从下标为 0 或 1 的元素作为初始阶梯。
 */
public class Solution_746 {

    public static void main(String[] args) {
//        int[] nums = new int[]{10, 15, 20};
        int[] nums = new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        System.out.println(minCostClimbingStairs(nums));
    }

    public static int minCostClimbingStairs(int[] cost) {
        int[] array = new int[cost.length+1];
        array[0] = 0;
        array[1] = 0;
        for (int i = 2; i <= cost.length; i++) {
            array[i] = Math.min(array[i - 1] + cost[i - 1],  array[i - 2]+ cost[i-2]);
        }
        return array[cost.length];
    }


    /**
     * 获取PN字段
     * @param data
     * @return
     */
    private String getPnField(Map<String,Object> data){
        String pn = "";
        String pro = (String)data.get("PROPERFIELD");
        if("C".equals(pro)){
            pn = (String)data.get("PROPERFIELD_7");
        }else if("R".equals(pro)){
            pn = (String)data.get("PROPERFIELD_6");
        }else if("L".equals(pro)){
            pn = (String)data.get("PROPERFIELD_7");
        }else if("PI".equals(pro)){
            pn = (String)data.get("PROPERFIELD_1");
        }else if("NAND".equals(pro)){
            pn = (String)data.get("PROPERFIELD_1");
        }else if("CTRL".equals(pro)){
            pn = (String)data.get("PROPERFIELD_1");
        }else if("CRY".equals(pro)){
            pn = (String)data.get("PROPERFIELD_9");
        }else if("CON".equals(pro)){
            pn = (String)data.get("PROPERFIELD_1");
        }else if("LED".equals(pro)){
            pn = (String)data.get("PROPERFIELD_5");
        }else if("WIRE".equals(pro)){
            pn = (String)data.get("PROPERFIELD_6");
        }else if("BEE".equals(pro)){
            pn = (String)data.get("PROPERFIELD_1");
        }else if("BJT".equals(pro)){
            pn = (String)data.get("PROPERFIELD_1");
        }else if("MOS".equals(pro)){
            pn = (String)data.get("PROPERFIELD_1");
        }else if("DIODE".equals(pro)){
            pn = (String)data.get("PROPERFIELD_1");
        }else if("ZENER".equals(pro)){
            pn = (String)data.get("PROPERFIELD_1");
        }else if("TVS".equals(pro)){
            pn = (String)data.get("PROPERFIELD_1");
        }else if("VT".equals(pro)){
            pn = (String)data.get("PROPERFIELD_1");
        }else if("LSW".equals(pro)){
            pn = (String)data.get("PROPERFIELD_1");
        }else if("DRAM".equals(pro)){
            pn = (String)data.get("PROPERFIELD_1");
        }else if("ENIC".equals(pro)){
            pn = (String)data.get("PROPERFIELD_1");
        }else if("SPI_NAND".equals(pro)){
            pn = (String)data.get("PROPERFIELD_1");
        }else if("SPI_NOR".equals(pro)){
            pn = (String)data.get("PROPERFIELD_1");
        }else if("ASW".equals(pro)){
            pn = (String)data.get("PROPERFIELD_1");
        }else if("EROM".equals(pro)){
            pn = (String)data.get("PROPERFIELD_1");
        }else if("SENSOR".equals(pro)){
            pn = (String)data.get("PROPERFIELD_1");
        }else if("BUF".equals(pro)){
            pn = (String)data.get("PROPERFIELD_1");
        }else if("LSIC".equals(pro)){
            pn = (String)data.get("PROPERFIELD_1");
        }else if("PLDIC".equals(pro)){
            pn = (String)data.get("PROPERFIELD_1");
        }else if("PSIC".equals(pro)){
            pn = (String)data.get("PROPERFIELD_1");
        }else if("SPI".equals(pro)){
            pn = (String)data.get("PROPERFIELD_1");
        }else if("WL".equals(pro)){
            pn = (String)data.get("PROPERFIELD_7");
        }else if("TRAN".equals(pro)){
            pn = (String)data.get("PROPERFIELD_7");
        }else if("AMP".equals(pro)){
            pn = (String)data.get("PROPERFIELD_7");
        }else if("ADC".equals(pro)){
            pn = (String)data.get("PROPERFIELD_7");
        }else if("RELAY".equals(pro)){
            pn = (String)data.get("PROPERFIELD_7");
        }
        return pn;
    }

}
