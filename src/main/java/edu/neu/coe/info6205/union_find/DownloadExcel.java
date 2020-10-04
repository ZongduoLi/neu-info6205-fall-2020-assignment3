package edu.neu.coe.info6205.union_find;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

public class DownloadExcel {
    public static void main(String[] args) {
        Map<Integer,Integer> memberMap = getMember();
        String[] strArray = excelTitle();
        ExcelUtil.createExcel(memberMap, strArray);
    }

    /**
     * 初始化数据，将会被存储到excel表格中
     *
     * @return
     * @throws Exception
     */
    private static Map<Integer, Integer> getMember() {
        //List<Member> list = new ArrayList<Member>();
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-mm-dd");

        try {
            for(int i = 1;i < 1000;i++){
                int x = i;
                UF_HWQUPC uf = new UF_HWQUPC(i);
                int y = uf.count(i);
                map.put(x,y);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }

    /**
     * 创建excel title
     */
    public static String[] excelTitle() {
        String[] strArray = { "N", "M" };
        return strArray;
    }
}
