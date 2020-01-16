package com.gao;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class GetIp {
	 public static void main(String[] args) {
		          // TODO Auto-generated method stub
		          InetAddress ia=null;
		          try {
		              ia=InetAddress.getLocalHost();
		             
		             String localname=ia.getHostName();
		             String localip=ia.getHostAddress();
		             System.out.println("本机名称是："+ localname);
		             System.out.println("本机的ip是 ："+localip);
		         } catch (Exception e) {
		             // TODO Auto-generated catch block
		            e.printStackTrace();
		         }
		          
		          List<String> sipv4=getLocalIPList();
		          for (String s : sipv4) {
					System.out.println("IPv4的IP地址:"+s);
				}
		     }
	 
	// 获取所有IPv4的IP地址：
	   public static List<String> getLocalIPList() {
	           List<String> ipList = new ArrayList<String>();
	           try {
	               Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
	               NetworkInterface networkInterface;
	               Enumeration<InetAddress> inetAddresses;
	               InetAddress inetAddress;
	               String ip;
	               while (networkInterfaces.hasMoreElements()) {
	                  networkInterface = networkInterfaces.nextElement();
	                  inetAddresses = networkInterface.getInetAddresses();
	                  while (inetAddresses.hasMoreElements()) {
	                      inetAddress = inetAddresses.nextElement();
	                     if (inetAddress != null && inetAddress instanceof Inet4Address) { // IPV4
	                          ip = inetAddress.getHostAddress();
	                          ipList.add(ip);
	                      }
	                  }
	              }
	          } catch (SocketException e) {
	              e.printStackTrace();
	          }
	          return ipList;
	      }

}
