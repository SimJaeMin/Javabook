/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatePractice;

import dto.SawonDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import orcle01.ConnDriver;

/**
 *
 * @author bit
 */
public class DataImple implements DataInter {
    private static DataImple dataimple;
      public synchronized static DataImple getDataImple(){
          if(dataimple==null){
              dataimple=new DataImple();
          }
              
          return dataimple;
}

    @Override
    public List<DataDTO> getCal() {
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
       List<DataDTO> list = new ArrayList<>();
       String sql1 = "select deptno,sname,sahire from sawon where saname like ? order by 1 desc";
       String sql2 = "SELECT deptno, saname,sahire,sysdate,TRUNC(sysdate - sahire) as 근무일수 FROM SAWON";
        try {
         
            con = ConnDriver.getMyConnection();
            System.out.println("연결성공" + con);
            pstm = con.prepareStatement(sql2);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                DataDTO vo = new DataDTO();
                vo.setDeptno(rs.getInt("deptno"));
                vo.setSaname(rs.getString("saname"));
                vo.setSahire(rs.getString("sahire"));
                vo.setSysdate(rs.getString("sysdate"));
                vo.setDuringWork(rs.getString("근무일수"));
                //사원들의 정보를 리스트에 추가
                list.add(vo);
             
            }
        } catch (SQLException ex) {
           ex.printStackTrace();}
        
        finally{
            try{
                if(con!=null){
                    con.close();
                }
                if(pstm!=null){
                    pstm.close();
                }
                if(con != null){
                    con.close();
                }
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }

    return list;
}
}

