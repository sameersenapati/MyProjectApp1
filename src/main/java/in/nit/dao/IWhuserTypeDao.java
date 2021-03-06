package in.nit.dao;

import java.util.List;

import in.nit.model.WhuserType;

public interface IWhuserTypeDao {

	public Integer saveWhuserType(WhuserType ob);
	List<WhuserType> displayAllWhuerTypes();
	public void deleteAllWhuserType(Integer id);
	public WhuserType getOneWhuserType(Integer id);
	public void updateWhuserType(WhuserType ob);
	public List<Object[]> getWhuserCodeCount();

}
