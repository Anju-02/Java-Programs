package com.solution.service;

public interface IBank {

	public void balanceCheck();
	public void deposit(int amount);
	public void withdrawn(int amount);
	public void send(int amount);
}
