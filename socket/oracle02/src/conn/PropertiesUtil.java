/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conn;

import java.io.FileInputStream;

import java.io.FileNotFoundException;

import java.io.IOException;

import java.util.HashMap;

import java.util.Map;

import java.util.Properties;

public class PropertiesUtil {

    private String protocol;

    private String userid;

    private String pass;

    private String f;

    public PropertiesUtil(String f) throws Exception {

// �츮�� ���� ��Űų�� ���� ���� ������ ���
// dbconn.properties������ ���
        this.f = f;

        propertiesValue();

    }

    public void propertiesValue()
            throws FileNotFoundException, IOException {

// java.util.Properties��ü�� ����
        Properties pt = new Properties();

// ���� ���������� ��Ʈ������ ���� ���� �ε� �ؿ´�.
        pt.load(new FileInputStream(f));

// Ű�� ���� ���� �� �ִ� �÷����� ���� �صд�.
        HashMap<String, String> map = new HashMap<String, String>();

// Ű�� ���� �и��Ͽ� map�� �����Ͽ� �д�.
        for (Map.Entry<Object, Object> entry : pt.entrySet()) {

            map.put(entry.getKey().toString(),
                    entry.getValue().toString());

        }

        protocol = map.get("protocol");

        userid = map.get("user");

        pass = map.get("pass");

    }

// ���̵�/ ��й�ȣ / �������� ���� ���� �� �ִ� getter
    public String getPass() {

        return pass;

    }

    public String getProtocol() {

        return protocol;

    }

    public String getUserid() {

        return userid;

    }

}
