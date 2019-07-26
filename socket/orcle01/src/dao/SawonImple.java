/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.SawonDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import orcle01.ConnDriver;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bit
 */
public class SawonImple implements  SawonInter{
    private static SawonImple sawondao;
    public synchronized static SawonImple getSawondao(){
        if(sawondao==null){
            sawondao=new SawonImple();
        }
        return sawondao;
    }
      
    
    @Override
    public List<SawonDTO> getListSawon(String searchValue) {
        String sql1 = "select sabun,saname,deptno,sapay,sahire from sawon where saname like ? order by 1 desc";
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        List<SawonDTO> list = new ArrayList<>();
        //select 일 경우 cursor를 반환
        try{
            // 1.Connection 연결
            con = ConnDriver.getMyConnection();
            System.out.println("연결성공" + con);
            pstm = con.prepareStatement(sql1);
            pstm.setString(1, "%"+ searchValue +"%");
            rs = pstm.executeQuery();
           
            while(rs.next()){
                SawonDTO vo = new SawonDTO();
                vo.setSabun(rs.getInt("sabun"));
                vo.setSaname(rs.getString("saname"));
                vo.setDeptno(rs.getInt("deptno"));
                vo.setSapay(rs.getInt("sapay"));
                vo.setSahire(rs.getString("sahire"));
                
                //사원들의 정보를 리스트에 추가
                list.add(vo);
                
            }
           // resv.setText(sb.toString());
        }catch(SQLException ex){
            ex.printStackTrace();
        }finally{
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

    @Override
    public void addSawon(SawonDTO dto) {
        Connection con = null;
        PreparedStatement pstm = null;
        //insert into sawon values(sawon_seq.nextVal, '박점심',20,'과장',5000,sysdate,'남자',10);
        ResultSet rs = null;
      
        String sql = "insert into sawon values(sawon_seq.nextVal,?,?,?,?,sysdate,?,?)";
        try {
            con = ConnDriver.getMyConnection();
            pstm=con.prepareStatement(sql);
            pstm.setString(1, dto.getSaname());
            pstm.setInt(2,dto.getDeptno());
            pstm.setString(3,dto.getSajob());
            pstm.setInt(4,dto.getSapay());
            pstm.setString(5,dto.getSasex());
            pstm.setInt(6,dto.getSamgr());
          
            pstm.executeUpdate(); // update(
            
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally
        {
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
    }
}
