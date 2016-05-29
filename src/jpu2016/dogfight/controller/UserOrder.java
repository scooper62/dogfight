package jpu2016.dogfight.controller;

public abstract class UserOrder implements IUserOrder{
	
	private int player;
	public String Order;

	public int getPlayer() {
		return player;
	}
	
	public String getOrder() {
		return Order;
	}
	
	public UserOrder ( int player, String Order){
		this.player = player;
		this.Order = Order;
	}
}
