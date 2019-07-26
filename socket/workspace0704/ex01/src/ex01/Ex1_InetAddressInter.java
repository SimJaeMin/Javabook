package ex01;

import java.net.UnknownHostException;
import java.util.ArrayList;

public interface Ex1_InetAddressInter {
	public abstract void searchDomain(String sns) throws UnknownHostException;
	public abstract ArrayList<String> getDomainList();
}
