package me.dec7.swa_week2.sort;

public class SimpleSortFactory extends SortFactory {

	@Override
	public ISort createFactory(String sortType) {
		ISort sort = null;
		
		try {
			sort = (ISort) Class.forName("me.dec7.swa_week2.sort." + sortType).newInstance();
			
		} catch (InstantiationException e) {
			e.printStackTrace();
			
		} catch (IllegalAccessException e) {
			e.printStackTrace();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return sort;
	}

}
