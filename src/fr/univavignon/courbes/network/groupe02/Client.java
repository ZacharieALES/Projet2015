package fr.univavignon.courbes.network.groupe02;

import java.util.List;
import java.util.Map;

import fr.univavignon.courbes.common.Board;
import fr.univavignon.courbes.common.Direction;
import fr.univavignon.courbes.common.Profile;
import fr.univavignon.courbes.network.ClientCommunication;
/**
 * 
 * 
 * @author Marie et Mary    
 * 
 * On fait la classe Client
 *
 */
public class Client implements ClientCommunication, Runnable
{

	@Override
	public String getIp() 
	{
		
	}

	@Override
	public void setIp(String ip) 
	{
		
	}

	@Override
	public int getPort() 
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setPort(int port) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void launchClient() 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeClient() 
	{
			
	}

	@Override
	public List<Profile> retrieveProfiles() 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer retrievePointThreshold() 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Board retrieveBoard() 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void sendCommands(Map<Integer, Direction> commands) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public String retrieveText() 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void sendText(String message) 
	{
		// TODO Auto-generated method stub
		
	}
	
}