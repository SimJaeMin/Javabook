/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conn;

import java.util.ArrayList;
import oracle02.SawonVO;

/**
 *
 * @author bit
 */
public interface SawonInter {
     ArrayList<SawonVO> sawonSearch(int deptno);
}
