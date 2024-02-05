package Person.controller;

import Person.person;

public class Personcontroller {
	private person p = new 	person();	
	
	public void add(int id,String name,String address ) {
		p.setId(id);
		p.setName(name);
		p.setAddress(address);
		
	}
	
	
	public void update(int id,String addr) {
		p.setId(id);
		p.setAddress(addr);
	
		
	}
	
   public void delete(int id) {
	  p.setId(id);

   }
   public person all() {
	   
	return p;
   }

public void search(int id) {
	p.setId(id);
	
}

}



