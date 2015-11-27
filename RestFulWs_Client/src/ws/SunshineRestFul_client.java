package ws;

import java.text.MessageFormat;
import java.util.List;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;

import entities.HocsinhWs;

public class SunshineRestFul_client {
	
	private Client client;
	private WebResource ws;
	private String Base_Path = "http://localhost:8080/RestFulWS/rest/sunshine/";
	
	public SunshineRestFul_client() {
		// TODO Auto-generated constructor stub
		client = Client.create();
		ws = client.resource(Base_Path);
	}
	
	public List<HocsinhWs> findXML(String tenhs){
		WebResource wr = ws.path(MessageFormat.format("tim/{0}", new Object[] {tenhs}));
		wr.accept(MediaType.APPLICATION_XML);
		List<HocsinhWs> dshs = wr.get(new GenericType<List<HocsinhWs>>(){});
		return dshs;
	}
	
	public List<HocsinhWs> findJSON(String tenhs){
		WebResource wr = ws.path(MessageFormat.format("timjs/{0}", new Object[] {tenhs}));
		wr.accept(MediaType.APPLICATION_JSON);
		List<HocsinhWs> dshs = wr.get(new GenericType<List<HocsinhWs>>() {});
		return dshs;
	}

}
