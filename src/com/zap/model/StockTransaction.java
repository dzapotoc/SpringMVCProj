package com.zap.model;

public class StockTransaction {
	
	private String stockSymbol;
	private Action stockAction;
	private int numberOfStocks;
	
	public enum Action {
		BUY,
		SELL
	};
	
	public StockTransaction() {
		
	}
	
	public StockTransaction(String stockSymbol, Action stockAction, int numberOfStocks) {
		this.stockSymbol = stockSymbol;
		this.stockAction = stockAction;
		this.numberOfStocks = numberOfStocks;
	}
	
	public String getStockSymbol() {
		return stockSymbol;
	}

	public void setStockSymbol(String stockSymbol) {
		this.stockSymbol = stockSymbol;
	}

	public Action getStockAction() {
		return stockAction;
	}

	public void setStockAction(Action stockAction) {
		this.stockAction = stockAction;
	}

	public int getNumberOfStocks() {
		return numberOfStocks;
	}

	public void setNumberOfStocks(int numberOfStocks) {
		this.numberOfStocks = numberOfStocks;
	}

	@Override
	public String toString() {
		return "StockTransaction [stockSymbol=" + stockSymbol
				+ ", stockAction=" + stockAction + ", numberOfStocks="
				+ numberOfStocks + "]";
	}

}
