package utility;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

public class VarshTourPackageDetails {

	public static void main(String[] args) throws SQLException, IOException
	{

		TravelAgency vtr=new TravelAgency();
		List list=vtr.generatePackageCost("D:\\VarshTourPackageDetails.txt");
		Iterator<String> itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}