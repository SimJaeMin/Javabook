/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.SawonDTO;
import java.util.List;

/**
 *
 * @author bit
 */
public interface SawonInter {
    // �Է±��
        public void addSawon(SawonDTO dto);
    // ��±��
        public List<SawonDTO> getListSawon(String searchValue);
    // ����
    // ����
    // .....
}
