package com.payspec.payspec.service.api.model;

public interface INotitication<T> {
	
	/*public Long getId() ;

	public void setId(Long id) ;

	public String getFirstName() ;

	public void setFirstName(String firstName) ;

	public String getLastName() ;

	public void setLastName(String lastName) ;

	public Date getCreatedOn();

	public void setCreatedOn(Date createdOn);*/
	
	T appliesTo();
	
	void send(T notification);

}
