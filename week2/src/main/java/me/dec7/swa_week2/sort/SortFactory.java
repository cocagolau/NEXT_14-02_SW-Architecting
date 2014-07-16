package me.dec7.swa_week2.sort;

public abstract class SortFactory {
	
	protected static final String PACKAGE_NAME = "me.dec7.swa_week2.sort.";
	
	public abstract ISort createFactory(String sortType);
	
}
