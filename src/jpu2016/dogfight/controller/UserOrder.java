package jpu2016.dogfight.controller;

public abstract class UserOrder implements IUserOrder{
	
	public int player;
	
	public int getPlayer() {
		return player;
	}

	public String Order;
	
	public String getOrder() {
		return Order;
	}
	
	public UserOrder ( int player, String Order){
		this.player = player;
		this.Order = Order;
	}
}
