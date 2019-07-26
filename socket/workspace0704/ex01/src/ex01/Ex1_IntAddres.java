package ex01;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;

public class Ex1_IntAddres implements Ex1_InetAddressInter {
	private InetAddress[] ar;
	@Override
	public void searchDomain(String sns) 
		throws UnknownHostException{
		ar= InetAddress.getAllByName(sns);
		}
	

	@Override
	public ArrayList<String> getDomainList() {
		ArrayList<String> list =new ArrayList<String>();
		for(InetAddress e : ar) {
			list.add(e.getHostAddress());
		}
		return list;
	}
	

}
