/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conn;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import oracle02.SawonVO;

public class Dao implements SawonInter {

    private static Dao dao;

    public static synchronized Dao getDao() {

        if (dao == null) {
            dao = new Dao();
        }
        return dao;
    }

    public ArrayList<SawonVO> sawonSearch(int deptno) {
        Connection con = null;
        ArrayList<SawonVO> arlist = new ArrayList<SawonVO>();
        PreparedStatement pstm = null;
        CallableStatement cs = null;
        ResultSet rs = null;

        try {
// 커넥션 획득
            con = ConnUtil.getConn();

// 프로시져 호출
            cs = con.prepareCall("begin p_sawon(?,?); end;");

// 입력 파라미터
            cs.setInt(1, deptno);

// 출력 파라미터
            cs.registerOutParameter(2,
                    oracle.jdbc.OracleTypes.CURSOR);

// 실행
            cs.execute();

            rs = (ResultSet) cs.getObject(2);

            while (rs.next()) {

                SawonVO v = new SawonVO();

                v.setSabun(rs.getInt("sabun"));

                v.setSaname(rs.getString("saname"));

           // v.setComm(rs.getInt("comm"));
                v.setDeptno(rs.getInt("deptno"));

                v.setSahire(rs.getString("sahire"));

                v.setSajob(rs.getString("sajob"));

                v.setSapay(rs.getInt("sapay"));

                v.setSasex(rs.getString("sasex"));
                 
                v.setSamgr(rs.getInt("samgr"));
                arlist.add(v);

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {

            try {
                if (con != null) {
                    con.close();
                }

                if (cs != null) {
                    cs.close();
                }
                if (rs != null) {
                    rs.close();
                }
               
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

            return arlist;

        }
    }
      public void insertDB(SawonVO v) {
        Connection con = null;
        CallableStatement cs = null;
        try {
            con = ConnUtil.getConn();
            cs = con.prepareCall("begin ps_in(?,?,?,?,?,?); end;");
            cs.setString(1, v.getSaname());
            cs.setInt(2, v.getDeptno());
            cs.setString(3, v.getSajob());
            cs.setInt(4, v.getSapay());
            cs.setString(5, v.getSasex());
            cs.setInt(6, v.getSamgr());
            cs.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (cs != null) {
                    cs.close();
                }
                if (con != null){
                    con.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }  
}
