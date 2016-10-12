package com.mycompany.app;

public class calculadora {
	
	private int ans;
	
	public calculadora(){
		ans = 0;
	}
	
	public int add (int a, int b){
		ans=a+b;
		return ans;
	}
	public int sub (int a, int b){
		ans=a-b;
		return ans;
	}
	
	public int add(int v){
		ans += v;
		return ans;
	}
	public int sub(int v){
		ans -= v;
		return ans;
	}
	
	public int div(int a, int b){
		if(b == 0){
			throw new ArithmeticException("No puedes dividir entre 0!!!");
		}
		ans = a / b;
		return ans;
	}
	public void operacionMuyLarga(){
		do{
			
		}while(true);
	}
	public int ans(){
		return ans;
	}
	
	public void clear(){
		ans = 0;
	}
}
