package gamerController.entities;

import gamerController.abstracts.Entity;

public class Sale implements Entity {
	private int   id;
	private String gameId;
	private  String gamerId;
	
	
	public Sale() {
		super();
		
	}


	public Sale(int id, String gameId, String gamerId) {
		this.id = id;
		this.gameId = gameId;
		this.gamerId = gamerId;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getGameId() {
		return gameId;
	}


	public void setGameId(String gameId) {
		this.gameId = gameId;
	}


	public String getGamerId() {
		return gamerId;
	}


	public void setGamerId(String gamerId) {
		this.gamerId = gamerId;
	}
	
	
	
	
	
	

}
