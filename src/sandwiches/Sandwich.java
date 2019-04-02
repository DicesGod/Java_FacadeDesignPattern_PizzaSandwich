package sandwiches;

import sandwiches.Sandwich;
import sandwiches.Sandwich.Builder;

public class Sandwich {
	
	private int size; 
	private boolean onion;
	private boolean cheddar;
	private boolean mayonnaise;
	private boolean hambuger;
	private boolean bacon;
	private boolean tomato;
	private boolean pickles;
	private boolean ham;
	private boolean lettuce;
	
	public Sandwich(int size, boolean onion, boolean cheddar, boolean mayonnaise,
			boolean hambuger, boolean bacon, boolean tomato,
			boolean pickles, boolean ham,boolean lettuce){
		this.size= size; 
		this.onion= onion;
		this.cheddar=cheddar;
		this.mayonnaise=mayonnaise;
		this.hambuger=hambuger;
		this.bacon=bacon;
		this.tomato=tomato;
		this.pickles= pickles;
		this.ham= ham;		
		this.lettuce = lettuce;
	}
	
	public int getSize() { return this.size;}
    public boolean hasOnion(){ return this.onion;}
    public boolean hasCheddar(){ return this.cheddar;}
    public boolean hasMayonnaise(){ return this.mayonnaise;}
    public boolean hasHambuger(){ return this.hambuger;}
    public boolean hasBacon(){ return this.bacon;}
    public boolean hasTomato(){ return this.tomato;}
    public boolean hasPickles(){ return this.pickles;}
    public boolean hasHam(){ return this.ham;}
    public boolean hasLettuce(){ return this.lettuce;}
    
    public static class Builder{ 
    	private int size = 10;    // default 
    	private boolean onion=false;
    	private boolean cheddar=false;
    	private boolean mayonnaise=false;
    	private boolean hambuger=false;
    	private boolean bacon=false;
    	private boolean tomato=false;
    	private boolean pickles=false;
    	private boolean ham=false;
    	private boolean lettuce = false;
    	
    	public Builder(){    		
    	}
    	
    	public Builder size(int size){
    		this.size=size;
    		return this;
    	}    	
    	public Builder onion(boolean v){
    		this.onion=v;
    		return this;
    	}
    	public Builder cheddar(boolean v){
    		this.cheddar=v;
    		return this;
    	}
    	public Builder mayonnaise(boolean v){
    		this.mayonnaise=v;
    		return this;
    	}
    	public Builder hambuger(boolean v){
    		this.hambuger=v;
    		return this;
    	}
    	public Builder bacon(boolean v){
    		this.bacon=v;
    		return this;
    	}
    	public Builder tomato(boolean v){
    		this.tomato=v;
    		return this;
    	}
    	public Builder pickles(boolean v){
    		this.pickles=v;
    		return this;
    	}
    	public Builder ham(boolean v){
    		this.ham=v;
    		return this;
    	}
    	public Builder lettuce(boolean v){
    		this.lettuce=v;
    		return this;
    	}
    	public Sandwich build(){
    		return new Sandwich(this);
    	}
    	
    	public int getSize() { return this.size;}
        public boolean hasOnion(){ return this.onion;}
    	public boolean hasCheddar(){ return this.cheddar;}
    	public boolean hasMayonnaise(){ return this.mayonnaise;}
    	public boolean hasHambuger(){ return this.hambuger;}
    	public boolean hasBacon(){ return this.bacon;}
    	public boolean hasTomato(){ return this.tomato;}
    	public boolean hasPickles(){ return this.pickles;}
    	public boolean hasHam(){ return this.ham;}
    	public boolean hasLettuce(){ return this.lettuce;}
    }
    
    private Sandwich (Builder b){
    	this.size= b.getSize();
    	this.onion=b.hasOnion();
    	this.cheddar=b.hasCheddar();
    	this.mayonnaise=b.hasMayonnaise();
    	this.hambuger=b.hasHambuger();
    	this.bacon=b.hasBacon();
    	this.tomato=b.hasTomato();
    	this.pickles=b.hasPickles();
    	this.ham=b.hasHam();
    	this.lettuce=b.hasLettuce();
    }
    
    
    
    
    
}
