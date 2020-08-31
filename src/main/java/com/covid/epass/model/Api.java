package com.covid.epass.model;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.apache.tomcat.util.json.ParseException;

public class Api {
public static List<Long> getCovidCount(String source,String destination) throws IOException, ParseException, InterruptedException, org.json.simple.parser.ParseException {
	String inline = "";
	List<Long> list=new ArrayList<Long>();
	try {
		URL url=new URL("https://api.covid19india.org/state_district_wise.json");
		//Parse URL into HttpURLConnection in order to open the connection in order to get the JSON data
		HttpURLConnection conn = (HttpURLConnection)url.openConnection();
		//Set the request to GET or POST as per the requirements
		conn.setRequestMethod("GET");
		//Use the connect method to create the connection bridge
		conn.connect();
		Scanner sc = new Scanner(url.openStream());
		while(sc.hasNext())
		{
			inline+=sc.nextLine();
		}
		//Close the stream when reading the data has been finished
		sc.close();
		JSONParser parse = new JSONParser();
		JSONObject jobj = (JSONObject)parse.parse(inline);
		JSONObject state=(JSONObject) jobj.get("Tamil Nadu");
		JSONObject districtWise=(JSONObject) state.get("districtData");
		JSONObject dDistrict=(JSONObject)districtWise.get(destination);
		long dActive=(long) dDistrict.get("active");
		long dConfirmed=(long) dDistrict.get("confirmed");
		long dDeceased=(long) dDistrict.get("deceased");
		long dRecovered=(long) dDistrict.get("recovered");
		JSONObject sDistrict=(JSONObject)districtWise.get(source);
		long sActive=(long) sDistrict.get("active");
		long sConfirmed=(long) sDistrict.get("confirmed");
		long sDeceased=(long) sDistrict.get("deceased");
		long sRecovered=(long) sDistrict.get("recovered");
		long big=dConfirmed;
		long result=0;
		if(big>10000) {
		result=100;
		}
		else {
			result=(long) (((float)big/(float)10000)*100);
		}
		list.add(dActive);
		list.add(dConfirmed);
		list.add(dDeceased);
		list.add(dRecovered);
		list.add(sActive);
		list.add(sConfirmed);
		list.add(sDeceased);
		list.add(sRecovered);
		list.add(result);
		conn.disconnect();
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return list;
}
}
