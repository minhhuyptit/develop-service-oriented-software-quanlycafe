package dao;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import connect.SVConnect;
import java.util.ArrayList;
import model.Stats;
import model.RevenueStatistics;

public class StatsDAO {
    //--------------------------------------------------------------------------OK
    public static RevenueStatistics ThongKe(String start, String end) {
        RevenueStatistics thongKeDT = new RevenueStatistics();
        SVConnect connect = new SVConnect();
        String param = "start_day="+start+"&end_day=" + end;
            String url = connect.urlAPI + "statistic/products";
        try {
            String result = connect.sendPost2(url, param);
            if(result.equals("TABLE_AVALIABLE")) return thongKeDT;
            if(result.equals("[]")) return null;
            System.out.println(result);
            Gson gson = new Gson();
           //String t = "[{\"id_product\":\"aqfn\",\"name\":\"N\\u01b0\\u1edbc su\\u1ed1i Aquafina\",\"price\":10000,\"quantity\":\"6\",\"discount\":0},{\"id_product\":\"btg\",\"name\":\"Bia Tiger\",\"price\":15000,\"quantity\":\"16\",\"discount\":0},{\"id_product\":\"cm\",\"name\":\"Chanh mu\\u1ed1i\",\"price\":19000,\"quantity\":\"4\",\"discount\":0},{\"id_product\":\"cvc\",\"name\":\"C\\u00e1 Vi\\u00ean Chi\\u00ean\",\"price\":15000,\"quantity\":\"32\",\"discount\":0},{\"id_product\":\"gtx\",\"name\":\"\\u0110\\u00f9i g\\u00e0 Texas\",\"price\":128000,\"quantity\":\"4\",\"discount\":0},{\"id_product\":\"kb\",\"name\":\"Kimbap\",\"price\":35000,\"quantity\":\"12\",\"discount\":0},{\"id_product\":\"kscl\",\"name\":\"Kem Socola\",\"price\":35000,\"quantity\":\"8\",\"discount\":0},{\"id_product\":\"kvn\",\"name\":\"Kem Vani\",\"price\":30000,\"quantity\":\"2\",\"discount\":0},{\"id_product\":\"necr\",\"name\":\"N\\u01b0\\u1edbc \\u00e9p C\\u00e0 R\\u1ed1t\",\"price\":24000,\"quantity\":\"24\",\"discount\":0},{\"id_product\":\"stb\",\"name\":\"Sinh t\\u1ed1 B\\u01a1\",\"price\":30000,\"quantity\":\"16\",\"discount\":0},{\"id_product\":\"stx\",\"name\":\"Sinh t\\u1ed1 Xo\\u00e0i\",\"price\":22000,\"quantity\":\"4\",\"discount\":0},{\"id_product\":\"tscrm\",\"name\":\"Tr\\u00e0 s\\u1eefa Caramen\",\"price\":19000,\"quantity\":\"6\",\"discount\":0},{\"id_product\":\"tshn\",\"name\":\"Tr\\u00e0 s\\u1eefa Honny\",\"price\":19000,\"quantity\":\"8\",\"discount\":0},{\"id_product\":\"tskw\",\"name\":\"Tr\\u00e0 s\\u1eefa Kiwi\",\"price\":21000,\"quantity\":\"6\",\"discount\":0},{\"id_product\":\"tsn\",\"name\":\"Tr\\u00e0 s\\u1eefa Nho\",\"price\":23000,\"quantity\":\"6\",\"discount\":0}]";
            thongKeDT.setListStast(gson.fromJson(result,  new TypeToken<ArrayList<Stats>>(){}.getType()));     
        } catch (Exception e) {
            System.out.println("Loi get cart khong thanh cong: "+ e);
        }
        return thongKeDT;
    }

    public static void main(String[] args) {
        //20190401 20190430
        RevenueStatistics dT = ThongKe("20190401","20190430");
        if(dT==null) System.out.println("--"+dT+"--");
//        for(Stats a: dT.getListStast()){
//            System.out.println(a.getName() + " " + a.getDiscount());
//        }
    }
}
